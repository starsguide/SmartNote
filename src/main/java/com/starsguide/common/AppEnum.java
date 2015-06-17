package com.starsguide.common;

/**
 * application enum
 * defined the type used by the application
 * @author Administrator
 *
 */
public class AppEnum {
	public enum TmcTopic {
		ITEMDOWNSHELF("taobao_item_ItemDownshelf", TmcGroup.ITEM.name()),
		TRADECREATE("taobao_trade_TradeCreate", TmcGroup.TRADE.name());
		
		private String topicName;
		
		private String groupName;
		
		private TmcTopic(String topicName, String groupName) {
			this.topicName = topicName;
			this.groupName = groupName;
		}

		public String getTopicName() {
			return topicName;
		}

		public void setTopicName(String topicName) {
			this.topicName = topicName;
		}

		public String getGroupName() {
			return groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}
		
	}
	
	public enum TmcGroup {
		ITEM("item"), TRADE("trade");
		
		private String groupName;
		
		private TmcGroup(String groupName) {
			this.groupName = groupName;
		}
		
		public String toString() {
			return groupName;
		}
	}
}
