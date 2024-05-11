package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.FenleihaoDao;
import com.entity.FenleihaoEntity;
import com.service.FenleihaoService;
import com.entity.vo.FenleihaoVO;
import com.entity.view.FenleihaoView;

@Service("fenleihaoService")
public class FenleihaoServiceImpl extends ServiceImpl<FenleihaoDao, FenleihaoEntity> implements FenleihaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FenleihaoEntity> page = this.selectPage(
                new Query<FenleihaoEntity>(params).getPage(),
                new EntityWrapper<FenleihaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FenleihaoEntity> wrapper) {
		  Page<FenleihaoView> page =new Query<FenleihaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FenleihaoVO> selectListVO(Wrapper<FenleihaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FenleihaoVO selectVO(Wrapper<FenleihaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FenleihaoView> selectListView(Wrapper<FenleihaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FenleihaoView selectView(Wrapper<FenleihaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
