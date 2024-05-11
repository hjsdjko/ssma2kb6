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

import com.entity.ZengzhifuwuEntity;
import com.entity.view.ZengzhifuwuView;

import com.service.ZengzhifuwuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 增值服务
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-26 14:01:32
 */
@RestController
@RequestMapping("/zengzhifuwu")
public class ZengzhifuwuController {
    @Autowired
    private ZengzhifuwuService zengzhifuwuService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZengzhifuwuEntity zengzhifuwu, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			zengzhifuwu.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZengzhifuwuEntity> ew = new EntityWrapper<ZengzhifuwuEntity>();
		PageUtils page = zengzhifuwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zengzhifuwu), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZengzhifuwuEntity zengzhifuwu, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			zengzhifuwu.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZengzhifuwuEntity> ew = new EntityWrapper<ZengzhifuwuEntity>();
		PageUtils page = zengzhifuwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zengzhifuwu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZengzhifuwuEntity zengzhifuwu){
       	EntityWrapper<ZengzhifuwuEntity> ew = new EntityWrapper<ZengzhifuwuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zengzhifuwu, "zengzhifuwu")); 
        return R.ok().put("data", zengzhifuwuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZengzhifuwuEntity zengzhifuwu){
        EntityWrapper< ZengzhifuwuEntity> ew = new EntityWrapper< ZengzhifuwuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zengzhifuwu, "zengzhifuwu")); 
		ZengzhifuwuView zengzhifuwuView =  zengzhifuwuService.selectView(ew);
		return R.ok("查询增值服务成功").put("data", zengzhifuwuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZengzhifuwuEntity zengzhifuwu = zengzhifuwuService.selectById(id);
        return R.ok().put("data", zengzhifuwu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZengzhifuwuEntity zengzhifuwu = zengzhifuwuService.selectById(id);
        return R.ok().put("data", zengzhifuwu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZengzhifuwuEntity zengzhifuwu, HttpServletRequest request){
    	zengzhifuwu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zengzhifuwu);

        zengzhifuwuService.insert(zengzhifuwu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZengzhifuwuEntity zengzhifuwu, HttpServletRequest request){
    	zengzhifuwu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zengzhifuwu);
    	zengzhifuwu.setUserid((Long)request.getSession().getAttribute("userId"));

        zengzhifuwuService.insert(zengzhifuwu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZengzhifuwuEntity zengzhifuwu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zengzhifuwu);
        zengzhifuwuService.updateById(zengzhifuwu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zengzhifuwuService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ZengzhifuwuEntity> wrapper = new EntityWrapper<ZengzhifuwuEntity>();
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

		int count = zengzhifuwuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
