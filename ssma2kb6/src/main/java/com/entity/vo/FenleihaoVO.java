package com.entity.vo;

import com.entity.FenleihaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 分类号
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-26 14:01:32
 */
public class FenleihaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 分类说明
	 */
	
	private String fenleishuoming;
				
	
	/**
	 * 设置：分类说明
	 */
	 
	public void setFenleishuoming(String fenleishuoming) {
		this.fenleishuoming = fenleishuoming;
	}
	
	/**
	 * 获取：分类说明
	 */
	public String getFenleishuoming() {
		return fenleishuoming;
	}
			
}
