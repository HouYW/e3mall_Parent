package cn.e3mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {
	
	/**
	 * 页面跳转:
	 * 首页:localhost:8081/index
	 * 商品添加:localhost:8081/item-add
	 * 商品列表:localhost:8081/item-list
	 * ........................
	 * 特点:
	 * 请求名称和页面名称相同
	 */
	@RequestMapping("{page}")
	public String showPage(@PathVariable String page){
		return page;
	}

}
