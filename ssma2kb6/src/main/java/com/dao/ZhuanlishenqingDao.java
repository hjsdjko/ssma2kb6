package com.dao;

import com.entity.ZhuanlishenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuanlishenqingVO;
import com.entity.view.ZhuanlishenqingView;


/**
 * 专利申请
 * 
 * @author 
 * @email 
 * @date 2021-04-26 14:01:32
 */
public interface ZhuanlishenqingDao extends BaseMapper<ZhuanlishenqingEntity> {
	
	List<ZhuanlishenqingVO> selectListVO(@Param("ew") Wrapper<ZhuanlishenqingEntity> wrapper);
	
	ZhuanlishenqingVO selectVO(@Param("ew") Wrapper<ZhuanlishenqingEntity> wrapper);
	
	List<ZhuanlishenqingView> selectListView(@Param("ew") Wrapper<ZhuanlishenqingEntity> wrapper);

	List<ZhuanlishenqingView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuanlishenqingEntity> wrapper);
	
	ZhuanlishenqingView selectView(@Param("ew") Wrapper<ZhuanlishenqingEntity> wrapper);
	
}
