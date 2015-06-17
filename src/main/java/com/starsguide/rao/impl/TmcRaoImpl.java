package com.starsguide.rao.impl;

import org.springframework.stereotype.Repository;

import com.starsguide.common.AppEnum.TmcTopic;
import com.starsguide.rao.TmcRao;
import com.taobao.api.ApiException;
import com.taobao.api.request.TmcGroupAddRequest;
import com.taobao.api.request.TmcUserPermitRequest;
import com.taobao.api.response.TmcGroupAddResponse;
import com.taobao.api.response.TmcUserPermitResponse;

@Repository
public class TmcRaoImpl extends BaseRaoImpl implements TmcRao {
	public boolean permitUserTmc(String sessionKey, TmcTopic topic) throws ApiException {
		TmcUserPermitRequest req = new TmcUserPermitRequest();
		req.setTopics(topic.getTopicName());
		
		TmcUserPermitResponse response = client.execute(req , sessionKey);
		
		return response.getIsSuccess();
	}
	
	public void addUserTmcGroup(String nick, String groupName) throws ApiException {
		TmcGroupAddRequest req=new TmcGroupAddRequest();
		req.setGroupName(groupName);
		req.setNicks(nick);
		TmcGroupAddResponse response = client.execute(req);
	}
}
