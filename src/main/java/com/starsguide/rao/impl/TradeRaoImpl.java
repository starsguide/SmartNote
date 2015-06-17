package com.starsguide.rao.impl;

import com.starsguide.rao.TradeRao;
import com.taobao.api.ApiException;
import com.taobao.api.domain.Trade;
import com.taobao.api.request.TradeGetRequest;
import com.taobao.api.request.TradePostageUpdateRequest;
import com.taobao.api.response.TradeGetResponse;
import com.taobao.api.response.TradePostageUpdateResponse;

public class TradeRaoImpl extends BaseRaoImpl implements TradeRao {

	public Trade getTrade(String sessionKey, Long tid) throws ApiException {
		TradeGetRequest req=new TradeGetRequest();
		req.setFields("orders.buyer_rate");
		req.setTid(tid);
		TradeGetResponse response = client.execute(req , sessionKey);
		return response.getTrade();
	}

	public void updatePostage(String sessionKey, Long tid, String postFee)
			throws ApiException {
		TradePostageUpdateRequest req=new TradePostageUpdateRequest();
		req.setTid(tid);
		req.setPostFee(postFee);
		TradePostageUpdateResponse response = client.execute(req , sessionKey);		
	}
	
	

}
