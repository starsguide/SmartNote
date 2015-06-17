package com.starsguide.rao;

import com.starsguide.common.AppEnum.TmcTopic;
import com.taobao.api.ApiException;

public interface TmcRao {
	public boolean permitUserTmc(String sessionKey, TmcTopic topic) throws ApiException;
	
	public void addUserTmcGroup(String nick, String groupName) throws ApiException;
}
