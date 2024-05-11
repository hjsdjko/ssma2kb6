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


import com.dao.YewuzhidaoxinxiDao;
import com.entity.YewuzhidaoxinxiEntity;
import com.service.YewuzhidaoxinxiService;
import com.entity.vo.YewuzhidaoxinxiVO;
import com.entity.view.YewuzhidaoxinxiView;

@Service("yewuzhidaoxinxiService")
public class YewuzhidaoxinxiServiceImpl extends ServiceImpl<YewuzhidaoxinxiDao, YewuzhidaoxinxiEntity> implements YewuzhidaoxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YewuzhidaoxinxiEntity> page = this.selectPage(
                new Query<YewuzhidaoxinxiEntity>(params).getPage(),
                new EntityWrapper<YewuzhidaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YewuzhidaoxinxiEntity> wrapper) {
		  Page<YewuzhidaoxinxiView> page =new Query<YewuzhidaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YewuzhidaoxinxiVO> selectListVO(Wrapper<YewuzhidaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YewuzhidaoxinxiVO selectVO(Wrapper<YewuzhidaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YewuzhidaoxinxiView> selectListView(Wrapper<YewuzhidaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YewuzhidaoxinxiView selectView(Wrapper<YewuzhidaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
