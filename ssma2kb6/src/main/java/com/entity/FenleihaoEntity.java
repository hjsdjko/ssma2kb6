package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 分类号
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-26 14:01:32
 */
@TableName("fenleihao")
public class FenleihaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FenleihaoEntity() {
		
	}
	
	public FenleihaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 分类号
	 */
					
	private String fenleihao;
	
	/**
	 * 分类说明
	 */
					
	private String fenleishuoming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：分类号
	 */
	public void setFenleihao(String fenleihao) {
		this.fenleihao = fenleihao;
	}
	/**
	 * 获取：分类号
	 */
	public String getFenleihao() {
		return fenleihao;
	}
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
