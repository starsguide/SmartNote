package com.starsguide.rao;

import com.taobao.api.ApiException;
import com.taobao.api.domain.Trade;

public interface TradeRao {
	public Trade getTrade(String sessionKey, Long tid) throws ApiException;
	
	public void updatePostage(String sessionKey, Long tid, String postFee) throws ApiException;
}
