package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZhuanlishenqingEntity;
import com.entity.view.ZhuanlishenqingView;

import com.service.ZhuanlishenqingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 专利申请
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-26 14:01:32
 */
@RestController
@RequestMapping("/zhuanlishenqing")
public class ZhuanlishenqingController {
    @Autowired
    private ZhuanlishenqingService zhuanlishenqingService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhuanlishenqingEntity zhuanlishenqing, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			zhuanlishenqing.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhuanlishenqingEntity> ew = new EntityWrapper<ZhuanlishenqingEntity>();
		PageUtils page = zhuanlishenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhuanlishenqing), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhuanlishenqingEntity zhuanlishenqing, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			zhuanlishenqing.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhuanlishenqingEntity> ew = new EntityWrapper<ZhuanlishenqingEntity>();
		PageUtils page = zhuanlishenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhuanlishenqing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhuanlishenqingEntity zhuanlishenqing){
       	EntityWrapper<ZhuanlishenqingEntity> ew = new EntityWrapper<ZhuanlishenqingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhuanlishenqing, "zhuanlishenqing")); 
        return R.ok().put("data", zhuanlishenqingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhuanlishenqingEntity zhuanlishenqing){
        EntityWrapper< ZhuanlishenqingEntity> ew = new EntityWrapper< ZhuanlishenqingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhuanlishenqing, "zhuanlishenqing")); 
		ZhuanlishenqingView zhuanlishenqingView =  zhuanlishenqingService.selectView(ew);
		return R.ok("查询专利申请成功").put("data", zhuanlishenqingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhuanlishenqingEntity zhuanlishenqing = zhuanlishenqingService.selectById(id);
        return R.ok().put("data", zhuanlishenqing);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhuanlishenqingEntity zhuanlishenqing = zhuanlishenqingService.selectById(id);
        return R.ok().put("data", zhuanlishenqing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhuanlishenqingEntity zhuanlishenqing, HttpServletRequest request){
    	zhuanlishenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhuanlishenqing);

        zhuanlishenqingService.insert(zhuanlishenqing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhuanlishenqingEntity zhuanlishenqing, HttpServletRequest request){
    	zhuanlishenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhuanlishenqing);
    	zhuanlishenqing.setUserid((Long)request.getSession().getAttribute("userId"));

        zhuanlishenqingService.insert(zhuanlishenqing);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZhuanlishenqingEntity zhuanlishenqing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhuanlishenqing);
        zhuanlishenqingService.updateById(zhuanlishenqing);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhuanlishenqingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZhuanlishenqingEntity> wrapper = new EntityWrapper<ZhuanlishenqingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = zhuanlishenqingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
