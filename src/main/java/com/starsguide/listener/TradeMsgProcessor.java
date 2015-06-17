package com.starsguide.listener;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.starsguide.common.AppEnum.TmcTopic;
import com.starsguide.dao.UserDao;
import com.starsguide.rao.TradeRao;
import com.taobao.api.domain.Trade;
import com.taobao.api.internal.tmc.Message;

public class TradeMsgProcessor implements MessageProcessor {
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private TradeRao tradeRao;

	public void process(Message msg) throws Exception {
		if (TmcTopic.TRADECREATE.equals(msg.getTopic())) {
			Map<?, ?> contentMap = msg.getContentMap();
			
			String nick = msg.getUserNick();
			Long tid = Long.valueOf((String)contentMap.get("tid"));
			
			String sessionKey = userDao.getSessionKeyByNick(nick);
			Trade trade = tradeRao.getTrade(sessionKey, tid);
			
			// judge if match the condition of deduct of post fee
			Double totalFee = Double.valueOf(trade.getTotalFee());
			Integer postFee = Integer.valueOf(trade.getPostFee());
			
			// TODO : change the rule to be flexiable and can config
			if (totalFee > 68) {
				postFee = 0;
			} else if (totalFee > 38) {
				postFee -= 5;
			}
			
			tradeRao.updatePostage(sessionKey, tid, postFee.toString());
		}
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void setTradeRao(TradeRao tradeRao) {
		this.tradeRao = tradeRao;
	}

}
