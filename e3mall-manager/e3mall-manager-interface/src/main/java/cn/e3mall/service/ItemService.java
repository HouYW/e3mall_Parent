package cn.e3mall.service;

import cn.e3mall.common.EasyUIResult;
import cn.e3mall.pojo.TbItem;

public interface ItemService {

	public TbItem findItemById(Long id) throws Exception;

	// 分页查询
	public EasyUIResult pageQueryItem(Integer page, Integer rows);
	
}
