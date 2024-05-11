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


import com.dao.ZengzhifuwuDao;
import com.entity.ZengzhifuwuEntity;
import com.service.ZengzhifuwuService;
import com.entity.vo.ZengzhifuwuVO;
import com.entity.view.ZengzhifuwuView;

@Service("zengzhifuwuService")
public class ZengzhifuwuServiceImpl extends ServiceImpl<ZengzhifuwuDao, ZengzhifuwuEntity> implements ZengzhifuwuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZengzhifuwuEntity> page = this.selectPage(
                new Query<ZengzhifuwuEntity>(params).getPage(),
                new EntityWrapper<ZengzhifuwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZengzhifuwuEntity> wrapper) {
		  Page<ZengzhifuwuView> page =new Query<ZengzhifuwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZengzhifuwuVO> selectListVO(Wrapper<ZengzhifuwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZengzhifuwuVO selectVO(Wrapper<ZengzhifuwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZengzhifuwuView> selectListView(Wrapper<ZengzhifuwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZengzhifuwuView selectView(Wrapper<ZengzhifuwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
