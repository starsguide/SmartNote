package com.starsguide.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("item")
public class ItemController extends BaseController {
	@RequestMapping("getItem")
	public String getItem(Model model, ModelMap modelMap) {
		System.out.println(model.asMap().get("sessionKey"));
		return "main";
	}
}
