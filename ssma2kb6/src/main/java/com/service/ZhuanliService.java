package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuanliView;


/**
 * 专利
 *
 * @author 
 * @email 
 * @date 2021-04-26 14:01:32
 */
public interface ZhuanliService extends IService<ZhuanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuanliVO> selectListVO(Wrapper<ZhuanliEntity> wrapper);
   	
   	ZhuanliVO selectVO(@Param("ew") Wrapper<ZhuanliEntity> wrapper);
   	
   	List<ZhuanliView> selectListView(Wrapper<ZhuanliEntity> wrapper);
   	
   	ZhuanliView selectView(@Param("ew") Wrapper<ZhuanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuanliEntity> wrapper);
   	
}

