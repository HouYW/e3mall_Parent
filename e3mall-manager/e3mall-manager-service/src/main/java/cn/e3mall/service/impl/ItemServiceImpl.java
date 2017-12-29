package cn.e3mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.e3mall.common.EasyUIResult;
import cn.e3mall.dao.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.pojo.TbItemExample;
import cn.e3mall.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper tbItemMapper;

	/**
	 * @param id
	 * @return
	 * @throws Exception
	 * @根据ID查询Item
	 */
	public TbItem findItemById(Long id) throws Exception {
		TbItem item = tbItemMapper.selectByPrimaryKey(id);
		return item;
	}

	/**
	 * @Title: pageQueryItem
	 * @Description:(商品列表分页查询)
	 * @time 2017年12月29日下午10:27:42
	 * @name 黄加耀
	 */
	@Override
	public EasyUIResult pageQueryItem(Integer page, Integer rows) {

		/**
		 * 利用MyBatis的分页插件PageHelper （插件的依赖在dao层的pom.xml文件中有注入）
		 */

		// 创建example对象
		TbItemExample example = new TbItemExample();

		// 查询数据结果之前,必须进行分页设置
		// 此分页设置完毕,将会拦截最近的一条查询语句,进行分页
		PageHelper.startPage(page, rows);

		// 查询所有
		// 返回值结果:page{包含分页所有数据}
		List<TbItem> list = tbItemMapper.selectByExample(example);

		// 创建分页包装类对象,封装分页数据
		EasyUIResult pageBean = new EasyUIResult();

		// 创建分页插件提供工具类对象PageInfo,自动解析list集合,获取分页数据
		PageInfo<TbItem> pageInfo = new PageInfo<TbItem>(list);

		// 设置分页记录
		pageBean.setRows(list);
		// 设置总记录数
		pageBean.setTotal(pageInfo.getTotal());

		return pageBean;
	}

}
