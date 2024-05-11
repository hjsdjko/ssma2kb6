package com.dao;

import com.entity.YewuzhidaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YewuzhidaoxinxiVO;
import com.entity.view.YewuzhidaoxinxiView;


/**
 * 业务指导信息
 * 
 * @author 
 * @email 
 * @date 2021-04-26 14:01:32
 */
public interface YewuzhidaoxinxiDao extends BaseMapper<YewuzhidaoxinxiEntity> {
	
	List<YewuzhidaoxinxiVO> selectListVO(@Param("ew") Wrapper<YewuzhidaoxinxiEntity> wrapper);
	
	YewuzhidaoxinxiVO selectVO(@Param("ew") Wrapper<YewuzhidaoxinxiEntity> wrapper);
	
	List<YewuzhidaoxinxiView> selectListView(@Param("ew") Wrapper<YewuzhidaoxinxiEntity> wrapper);

	List<YewuzhidaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YewuzhidaoxinxiEntity> wrapper);
	
	YewuzhidaoxinxiView selectView(@Param("ew") Wrapper<YewuzhidaoxinxiEntity> wrapper);
	
}
