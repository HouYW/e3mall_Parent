package cn.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.e3mall.common.EasyUIResult;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;

@RestController
public class ItemController {

	@Autowired
	private ItemService  itemService;
	
	/**
	* @Title: pageQueryItem 
	* @Description:(商品列表分页查询) 
	* @time 2017年12月29日下午10:27:42
	* @name 黄加耀
	 */
	// @RequestParam(defaultValue="1") 当值为空的话，给设置一个默认值
	@RequestMapping("/item/list")
	public EasyUIResult pageQueryItem(@RequestParam(defaultValue="1") Integer page ,@RequestParam(defaultValue="30") Integer rows) throws Exception{
		EasyUIResult result = itemService.pageQueryItem(page,rows);
		return result;
	}
	
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
