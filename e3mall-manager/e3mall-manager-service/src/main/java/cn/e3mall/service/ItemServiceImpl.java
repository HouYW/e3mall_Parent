package cn.e3mall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3mall.dao.TbItemMapper;
import cn.e3mall.pojo.TbItem;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper  tbItemMapper;
	
	/**
	 * @param id
	 * @return  
	 * @throws Exception
	 * @根据ID查询Item
	 */
	public TbItem findItemById(Long id) throws Exception{
		TbItem item = tbItemMapper.selectByPrimaryKey(id);
		return item;
	}
	
}
