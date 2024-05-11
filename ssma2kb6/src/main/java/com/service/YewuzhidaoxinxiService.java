package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YewuzhidaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YewuzhidaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YewuzhidaoxinxiView;


/**
 * 业务指导信息
 *
 * @author 
 * @email 
 * @date 2021-04-26 14:01:32
 */
public interface YewuzhidaoxinxiService extends IService<YewuzhidaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YewuzhidaoxinxiVO> selectListVO(Wrapper<YewuzhidaoxinxiEntity> wrapper);
   	
   	YewuzhidaoxinxiVO selectVO(@Param("ew") Wrapper<YewuzhidaoxinxiEntity> wrapper);
   	
   	List<YewuzhidaoxinxiView> selectListView(Wrapper<YewuzhidaoxinxiEntity> wrapper);
   	
   	YewuzhidaoxinxiView selectView(@Param("ew") Wrapper<YewuzhidaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YewuzhidaoxinxiEntity> wrapper);
   	
}

