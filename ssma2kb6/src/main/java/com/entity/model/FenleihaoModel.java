package com.entity.model;

import com.entity.FenleihaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 分类号
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-26 14:01:32
 */
public class FenleihaoModel  implements Serializable {
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
