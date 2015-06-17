package com.starsguide.listener;

import com.taobao.api.internal.tmc.Message;

public interface MessageProcessor {
	public void process(Message msg) throws Exception;
}
