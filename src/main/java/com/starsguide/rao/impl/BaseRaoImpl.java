package com.starsguide.rao.impl;

import javax.annotation.PostConstruct;

import com.starsguide.common.AppProp;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;

public class BaseRaoImpl {
	protected TaobaoClient client = null;
	
	@PostConstruct
	public void init() {
		String url = AppProp.URL;
		String appKey = AppProp.APP_KEY;
		String appSecret = AppProp.APP_SECRET;
		client = new DefaultTaobaoClient(url, appKey, appSecret);
	}
}
