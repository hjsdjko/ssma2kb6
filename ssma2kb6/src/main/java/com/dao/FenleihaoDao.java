package com.dao;

import com.entity.FenleihaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FenleihaoVO;
import com.entity.view.FenleihaoView;


/**
 * 分类号
 * 
 * @author 
 * @email 
 * @date 2021-04-26 14:01:32
 */
public interface FenleihaoDao extends BaseMapper<FenleihaoEntity> {
	
	List<FenleihaoVO> selectListVO(@Param("ew") Wrapper<FenleihaoEntity> wrapper);
	
	FenleihaoVO selectVO(@Param("ew") Wrapper<FenleihaoEntity> wrapper);
	
	List<FenleihaoView> selectListView(@Param("ew") Wrapper<FenleihaoEntity> wrapper);

	List<FenleihaoView> selectListView(Pagination page,@Param("ew") Wrapper<FenleihaoEntity> wrapper);
	
	FenleihaoView selectView(@Param("ew") Wrapper<FenleihaoEntity> wrapper);
	
}
