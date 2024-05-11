package com.dao;

import com.entity.ZengzhifuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZengzhifuwuVO;
import com.entity.view.ZengzhifuwuView;


/**
 * 增值服务
 * 
 * @author 
 * @email 
 * @date 2021-04-26 14:01:32
 */
public interface ZengzhifuwuDao extends BaseMapper<ZengzhifuwuEntity> {
	
	List<ZengzhifuwuVO> selectListVO(@Param("ew") Wrapper<ZengzhifuwuEntity> wrapper);
	
	ZengzhifuwuVO selectVO(@Param("ew") Wrapper<ZengzhifuwuEntity> wrapper);
	
	List<ZengzhifuwuView> selectListView(@Param("ew") Wrapper<ZengzhifuwuEntity> wrapper);

	List<ZengzhifuwuView> selectListView(Pagination page,@Param("ew") Wrapper<ZengzhifuwuEntity> wrapper);
	
	ZengzhifuwuView selectView(@Param("ew") Wrapper<ZengzhifuwuEntity> wrapper);
	
}
