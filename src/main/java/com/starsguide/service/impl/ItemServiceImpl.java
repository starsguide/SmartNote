package com.starsguide.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.starsguide.service.ItemService;
import com.taobao.api.ApiException;
import com.taobao.api.domain.Item;

@Service
public class ItemServiceImpl implements ItemService {

	public List<Item> getItemsOnSale(String sessionKey) throws ApiException {
		// TODO Auto-generated method stub
		return null;
	}
}
