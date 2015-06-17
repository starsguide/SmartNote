package com.starsguide.rao;

import java.util.List;

import com.taobao.api.ApiException;
import com.taobao.api.domain.Item;

public interface ItemRao {
	public List<Item> getItemsOnSale(String sessionKey) throws ApiException;
}
