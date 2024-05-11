package com.entity.vo;

import com.entity.ZhuanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 专利
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-26 14:01:32
 */
public class ZhuanliVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 专利名称
	 */
	
	private String zhuanlimingcheng;
		
	/**
	 * 申请人
	 */
	
	private String shenqingren;
		
	/**
	 * 协同作者
	 */
	
	private String xietongzuozhe;
		
	/**
	 * 专利类型
	 */
	
	private String zhuanlileixing;
		
	/**
	 * 申请类型
	 */
	
	private String shenqingleixing;
		
	/**
	 * 分类号
	 */
	
	private String fenleihao;
		
	/**
	 * 关键词
	 */
	
	private String guanjianci;
		
	/**
	 * 说明书
	 */
	
	private String shuomingshu;
		
	/**
	 * 专利图片
	 */
	
	private String zhuanlitupian;
		
	/**
	 * 日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date riqi;
		
	/**
	 * 专利备注
	 */
	
	private String zhuanlibeizhu;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：专利名称
	 */
	 
	public void setZhuanlimingcheng(String zhuanlimingcheng) {
		this.zhuanlimingcheng = zhuanlimingcheng;
	}
	
	/**
	 * 获取：专利名称
	 */
	public String getZhuanlimingcheng() {
		return zhuanlimingcheng;
	}
				
	
	/**
	 * 设置：申请人
	 */
	 
	public void setShenqingren(String shenqingren) {
		this.shenqingren = shenqingren;
	}
	
	/**
	 * 获取：申请人
	 */
	public String getShenqingren() {
		return shenqingren;
	}
				
	
	/**
	 * 设置：协同作者
	 */
	 
	public void setXietongzuozhe(String xietongzuozhe) {
		this.xietongzuozhe = xietongzuozhe;
	}
	
	/**
	 * 获取：协同作者
	 */
	public String getXietongzuozhe() {
		return xietongzuozhe;
	}
				
	
	/**
	 * 设置：专利类型
	 */
	 
	public void setZhuanlileixing(String zhuanlileixing) {
		this.zhuanlileixing = zhuanlileixing;
	}
	
	/**
	 * 获取：专利类型
	 */
	public String getZhuanlileixing() {
		return zhuanlileixing;
	}
				
	
	/**
	 * 设置：申请类型
	 */
	 
	public void setShenqingleixing(String shenqingleixing) {
		this.shenqingleixing = shenqingleixing;
	}
	
	/**
	 * 获取：申请类型
	 */
	public String getShenqingleixing() {
		return shenqingleixing;
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
	 * 设置：关键词
	 */
	 
	public void setGuanjianci(String guanjianci) {
		this.guanjianci = guanjianci;
	}
	
	/**
	 * 获取：关键词
	 */
	public String getGuanjianci() {
		return guanjianci;
	}
				
	
	/**
	 * 设置：说明书
	 */
	 
	public void setShuomingshu(String shuomingshu) {
		this.shuomingshu = shuomingshu;
	}
	
	/**
	 * 获取：说明书
	 */
	public String getShuomingshu() {
		return shuomingshu;
	}
				
	
	/**
	 * 设置：专利图片
	 */
	 
	public void setZhuanlitupian(String zhuanlitupian) {
		this.zhuanlitupian = zhuanlitupian;
	}
	
	/**
	 * 获取：专利图片
	 */
	public String getZhuanlitupian() {
		return zhuanlitupian;
	}
				
	
	/**
	 * 设置：日期
	 */
	 
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
				
	
	/**
	 * 设置：专利备注
	 */
	 
	public void setZhuanlibeizhu(String zhuanlibeizhu) {
		this.zhuanlibeizhu = zhuanlibeizhu;
	}
	
	/**
	 * 获取：专利备注
	 */
	public String getZhuanlibeizhu() {
		return zhuanlibeizhu;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
