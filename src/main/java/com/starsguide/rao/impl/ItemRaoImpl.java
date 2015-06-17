package com.starsguide.rao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.starsguide.rao.ItemRao;
import com.taobao.api.ApiException;
import com.taobao.api.domain.Item;
import com.taobao.api.request.ItemsOnsaleGetRequest;
import com.taobao.api.response.ItemsOnsaleGetResponse;

@Repository
public class ItemRaoImpl extends BaseRaoImpl implements ItemRao {

	public List<Item> getItemsOnSale(String sessionKey) throws ApiException {
		ItemsOnsaleGetRequest req = new ItemsOnsaleGetRequest();
		req.setFields("approve_status,num_iid,title,nick,type,cid,pic_url,num,props,valid_thru,list_time,price,has_discount,has_invoice,has_warranty,has_showcase,modified,delist_time,postage_id,seller_cids,outer_id");
//		req.setQ("N97");
//		req.setCid(1512L);
//		req.setSellerCids("11");
//		req.setPageNo(10L);
//		req.setHasDiscount(true);
//		req.setHasShowcase(true);
//		req.setOrderBy("list_time:desc");
//		req.setIsTaobao(true);
//		req.setIsEx(true);
//		req.setPageSize(100L);
//		Date dateTime = SimpleDateFormat.getDateTimeInstance().parse("2000-01-01 00:00:00");
//		req.setStartModified(dateTime);
//		Date dateTime = SimpleDateFormat.getDateTimeInstance().parse("2000-01-01 00:00:00");
//		req.setEndModified(dateTime);
//		req.setIsCspu(true);
		ItemsOnsaleGetResponse response = client.execute(req , sessionKey);
		
		return response.getItems();
	}

}
