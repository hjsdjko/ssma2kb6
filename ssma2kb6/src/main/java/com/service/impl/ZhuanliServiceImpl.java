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


import com.dao.ZhuanliDao;
import com.entity.ZhuanliEntity;
import com.service.ZhuanliService;
import com.entity.vo.ZhuanliVO;
import com.entity.view.ZhuanliView;

@Service("zhuanliService")
public class ZhuanliServiceImpl extends ServiceImpl<ZhuanliDao, ZhuanliEntity> implements ZhuanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuanliEntity> page = this.selectPage(
                new Query<ZhuanliEntity>(params).getPage(),
                new EntityWrapper<ZhuanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuanliEntity> wrapper) {
		  Page<ZhuanliView> page =new Query<ZhuanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuanliVO> selectListVO(Wrapper<ZhuanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuanliVO selectVO(Wrapper<ZhuanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuanliView> selectListView(Wrapper<ZhuanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuanliView selectView(Wrapper<ZhuanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
