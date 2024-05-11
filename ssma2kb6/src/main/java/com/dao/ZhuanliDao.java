package com.dao;

import com.entity.ZhuanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuanliVO;
import com.entity.view.ZhuanliView;


/**
 * 专利
 * 
 * @author 
 * @email 
 * @date 2021-04-26 14:01:32
 */
public interface ZhuanliDao extends BaseMapper<ZhuanliEntity> {
	
	List<ZhuanliVO> selectListVO(@Param("ew") Wrapper<ZhuanliEntity> wrapper);
	
	ZhuanliVO selectVO(@Param("ew") Wrapper<ZhuanliEntity> wrapper);
	
	List<ZhuanliView> selectListView(@Param("ew") Wrapper<ZhuanliEntity> wrapper);

	List<ZhuanliView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuanliEntity> wrapper);
	
	ZhuanliView selectView(@Param("ew") Wrapper<ZhuanliEntity> wrapper);
	
}
