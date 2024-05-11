package com.entity.view;

import com.entity.ZengzhifuwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 增值服务
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 14:01:32
 */
@TableName("zengzhifuwu")
public class ZengzhifuwuView  extends ZengzhifuwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZengzhifuwuView(){
	}
 
 	public ZengzhifuwuView(ZengzhifuwuEntity zengzhifuwuEntity){
 	try {
			BeanUtils.copyProperties(this, zengzhifuwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
