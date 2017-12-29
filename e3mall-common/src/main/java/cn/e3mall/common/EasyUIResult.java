package cn.e3mall.common;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class EasyUIResult implements Serializable {
	// 分页总条数
	private Long total;
	// 分页显示数据
	private List<?> rows;

}