package cn.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;

@RequestMapping("/item")
@RestController
public class ItemController {

	@Autowired
	private ItemService  itemService;
	
	/**
	* @Title: findItemById 
	* @Description:(根据ID查询Item对象) 
	* @time 2017年12月28日下午2:49:12
	* @name 黄加耀
	 */
	@RequestMapping("/item/{id}")
	public TbItem findItemById(@PathVariable Long id) throws Exception{
		TbItem item = itemService.findItemById(id);
		return item;
	}
	
}
