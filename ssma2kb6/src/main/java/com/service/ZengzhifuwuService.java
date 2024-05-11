package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZengzhifuwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZengzhifuwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZengzhifuwuView;


/**
 * 增值服务
 *
 * @author 
 * @email 
 * @date 2021-04-26 14:01:32
 */
public interface ZengzhifuwuService extends IService<ZengzhifuwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZengzhifuwuVO> selectListVO(Wrapper<ZengzhifuwuEntity> wrapper);
   	
   	ZengzhifuwuVO selectVO(@Param("ew") Wrapper<ZengzhifuwuEntity> wrapper);
   	
   	List<ZengzhifuwuView> selectListView(Wrapper<ZengzhifuwuEntity> wrapper);
   	
   	ZengzhifuwuView selectView(@Param("ew") Wrapper<ZengzhifuwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZengzhifuwuEntity> wrapper);
   	
}

