package com.starsguide.service;

import java.util.List;

import com.taobao.api.ApiException;
import com.taobao.api.domain.Item;

public interface ItemService {
	public List<Item> getItemsOnSale(String sessionKey) throws ApiException;
}
