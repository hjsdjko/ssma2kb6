package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FenleihaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FenleihaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FenleihaoView;


/**
 * 分类号
 *
 * @author 
 * @email 
 * @date 2021-04-26 14:01:32
 */
public interface FenleihaoService extends IService<FenleihaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FenleihaoVO> selectListVO(Wrapper<FenleihaoEntity> wrapper);
   	
   	FenleihaoVO selectVO(@Param("ew") Wrapper<FenleihaoEntity> wrapper);
   	
   	List<FenleihaoView> selectListView(Wrapper<FenleihaoEntity> wrapper);
   	
   	FenleihaoView selectView(@Param("ew") Wrapper<FenleihaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FenleihaoEntity> wrapper);
   	
}

