package com.starsguide.listener;

import org.springframework.stereotype.Component;

import com.starsguide.common.AppEnum;
import com.starsguide.common.AppProp;
import com.taobao.api.internal.tmc.Message;
import com.taobao.api.internal.tmc.MessageHandler;
import com.taobao.api.internal.tmc.MessageStatus;
import com.taobao.api.internal.tmc.TmcClient;
import com.taobao.top.link.LinkException;

@Component
public class MessgaeListener {
	
	private static final String TMC_GROUP_DEFAULT = "default";
	
	public MessgaeListener() throws LinkException {
		TmcClient client = new TmcClient(AppProp.APP_KEY, AppProp.APP_SECRET, TMC_GROUP_DEFAULT);
		client.setMessageHandler(new MessageHandler() {
		    public void onMessage(Message message, MessageStatus status) {
		        try {  
		            System.out.println(message.getContent());  
		            System.out.println(message.getTopic());
		            // Ĭ�ϲ��׳��쳣����Ϊ��Ϣ����ɹ�  
		        } catch (Exception e) {
		            e.printStackTrace();
		            status.fail();// ��Ϣ����ʧ�ܻع����������Ҫ�ط�
		        }
		    }
		});
//		client.connect(AppProp.MESSAGE_URL);
	}
}
