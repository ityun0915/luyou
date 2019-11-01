package com.gn.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.gn.pojo.Address;
import com.gn.pojo.Admin;
import com.gn.pojo.Dianzan;
import com.gn.pojo.Jingdian;
import com.gn.pojo.Liuyan;
import com.gn.pojo.Pinglun;
import com.gn.pojo.User;
import com.gn.service.AdminService;
import com.gn.utils.Msg;

@Controller
@ResponseBody
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	/**
	 * 管理员登录
	 * @return
	 */
	@RequestMapping(value="/AdminLogin",method=RequestMethod.POST)
	public Msg AdminLogin(@RequestBody Admin admin) {
//		Admin admin = new Admin();
//		admin.setPassword(password);
//		admin.setUsername(username);
		System.out.println("admin"+admin);
		return  adminService.AdminLogin(admin);
	}
	
	/**
	 *  添加访问量
     *  在用户登录时调用
	 * @return
	 */
	@RequestMapping(value="/AddfangkeshuServlet",method=RequestMethod.POST)
	public Msg AddfangkeshuServlet() {
		
		Msg msg = adminService.AddfangkeshuServlet();
		return msg;
	}
	
	/**
	 * 添加评论
	 * @param userId
	 * @param jingdianId
	 * @param details
	 * @return
	 */
	@RequestMapping(value="/AddpinglunServlet",method=RequestMethod.POST)
	public Msg AddpinglunServlet(@RequestParam("userId") Integer userId,@RequestParam("jingdianId") Integer jingdianId,@RequestParam("details") String details) {

		Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sf.format(date);
        Pinglun pinglun = new Pinglun();
        pinglun.setDetails(details);
        pinglun.setJindainId(jingdianId);
        pinglun.setTime(time);
        pinglun.setUserId(userId);
        System.out.println("用户正在评论："+pinglun);
		Msg msg = adminService.AddpinglunServlet(pinglun);
		return msg;
	}
	
	/**
	 * 前端显示景点评论
	 * @return
	 */
	@RequestMapping(value="/AllpinglunServlet",method=RequestMethod.POST)
	public Msg AllpinglunServlet(@RequestParam("id") Integer id) {
		System.out.println("景点评论...景点id："+id);
		Msg msg = adminService.AllpinglunServlet(id);
		return msg;
	}
	
	/**
	 * 删除景点
	 * @return
	 */
	@RequestMapping(value="/DeljingdianServlet",method=RequestMethod.POST)
	public Msg DeljingdianServlet(Integer id) {
		
		Msg msg = adminService.DeljingdianServlet(id);
		return msg;
	}
	
	/**
	 * 删除留言
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/DelliuyanServlet",method=RequestMethod.POST)
	public Msg DelliuyanServlet(Integer id) {
		
		Msg msg = adminService.DelliuyanServlet(id);
		return msg;
	}
	
	/**
	 * 删除评论
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/DelPinglunServlet",method=RequestMethod.POST)
	public Msg DelPinglunServlet(Integer id) {
		
		Msg msg = adminService.DelPinglunServlet(id);
		return msg;
	}
	
	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/DeluserServlet",method=RequestMethod.POST)
	public Msg DeluserServlet(Integer id) {
		
		Msg msg = adminService.DeluserServlet(id);
		return msg;
	}
	
	/**
	 * 用户点赞
	 * @param
	 * @return
	 */
	@RequestMapping(value="/DianzanServlet",method=RequestMethod.POST)
	public Msg DianzanServlet(Integer userId,Integer jingdianId) {
		 Date date = new Date();
	     SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	     String time = sf.format(date);
	     Dianzan dianzan = new Dianzan();
	     dianzan.setJindianId(jingdianId);
	     dianzan.setUserId(userId);
	     dianzan.setTime(time);
		 Msg msg = adminService.DianzanServlet(dianzan);
		 return msg;
	}
	
	/**
	 * 判断用户和景点之间的点赞关系
	 * @param
	 * @return
	 */
	@RequestMapping(value="/IsdianzanServlet",method=RequestMethod.POST)
	public Msg IsdianzanServlet(@RequestParam("userId") Integer userId,@RequestParam("jingdianId") Integer jingdianId) {
//		System.out.println("IsdianzanServlet进来了。。。");
		Msg msg = adminService.IsdianzanServlet(userId,jingdianId);
		return msg;
	}
	
	/**
	 * 前端按城市查询所有的景点
	 * @param yiji
	 * @param erji
	 * @param sanji
	 * @return
	 */
	@RequestMapping(value="/JingdianAllServlet",method=RequestMethod.POST)
	public Msg JingdianAllServlet(String yiji,String erji,String sanji) {
		
		Msg msg = adminService.IsdianzanServlet(yiji,erji,sanji);
		return msg;
	}
	
	/**
	 * 添加留言
	 * @param userId
	 * @return
	 */
	@RequestMapping(value="/LiuyanServlet",method=RequestMethod.POST)
	public Msg LiuyanServlet(@RequestParam("userId") Integer userId,
                          @RequestParam("chenghu")String chenghu,
                          @RequestParam("phone")String phone,
                          @RequestParam("sex")String sex,
                          @RequestParam("xinxi")String xinxi) {
		 Date date = new Date();
	     SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	     String time = sf.format(date);
	     Liuyan liuyan = new Liuyan();
	     liuyan.setChenghu(chenghu);
	     liuyan.setPhone(phone);
	     liuyan.setSex(sex);
	     liuyan.setTime(time);
	     liuyan.setUserId(userId);
	     liuyan.setXinxi(xinxi);
	     System.out.println("留言信息:"+liuyan);
		 Msg msg = adminService.LiuyanServlet(liuyan);
		 return msg;
	}
	
	/**
	 * 用户登录
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping(value="/LoginServlet",method=RequestMethod.POST)
	public Msg LoginServlet(@RequestParam("username") String username,@RequestParam("password") String password) {
//		System.out.println("有用户正在登录");
		Msg msg = adminService.LoginServlet(username,password);
		return msg;
	}
	
	/**
	 * 用户注册
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping(value="/RsgServlet",method=RequestMethod.POST)
	public Msg RsgServlet(@RequestParam("username") String username,@RequestParam("password") String password) {
		System.out.println("有用户正在注册账号...");
		Msg msg = adminService.RsgServlet(username,password);
		return msg;
	}
	
	/**
	 * 后台分页查询所有评论
	 * @param pn
	 * @return
	 */
	@RequestMapping(value="/SelAllPinglunServlet",method=RequestMethod.POST)
	public Msg SelAllPinglunServlet(int pn) {
		
		Msg msg = adminService.SelAllPinglunServlet(pn);
		return msg;
	}
	
	/**
	 * 后台分页查询所有景点
	 * @param pn
	 * @return
	 */
	@RequestMapping(value="/SelJDServlet",method=RequestMethod.POST)
	public Msg SelJDServlet(@RequestParam("pn") int pn) {
		
		Msg msg = adminService.SelJDServlet(pn);
		return msg;
	}
	
	/**
	 * 后台分页查询所有留言
	 * @param pn
	 * @return
	 */
	@RequestMapping(value="/SelliuyanServlet",method=RequestMethod.POST)
	public Msg SelliuyanServlet(int pn) {
		
		Msg msg = adminService.SelliuyanServlet(pn);
		return msg;
	}
	
	/**
	 * 根据id查询景点
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/SelOneByIdServlet",method=RequestMethod.POST)
	public Msg SelOneByIdServlet(@RequestParam("id") int id) {
		 
		Msg msg = adminService.SelOneByIdServlet(id);
		return msg;
	}
	
	/**
	 * 后台根据地区查询景点（分页）
	 * @param
	 * @return
	 */
	@RequestMapping(value="/SelOneByTiaojianServlet",method=RequestMethod.POST)
	public Msg SelOneByTiaojianServlet(String yiji,String erji,String sanji) {
		 
		Address address = new Address();
		address.setErji(erji);
		address.setSanji(sanji);
		address.setYiji(yiji);
		Msg msg = adminService.SelOneByTiaojianServlet(address);
		return msg;
	}
	
	/**
	 * 查询热门景点
	 * @return
	 */
	@RequestMapping(value="/SelRDjindianServlet",method=RequestMethod.POST)
	public Msg SelRDjindianServlet() {
		System.out.println("开始挑选热门景点..");
		Msg msg = adminService.SelRDjindianServlet();
		return msg;
	}
	
	/**
	 * 根据id查询用户信息
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/SeluserByIdServlet",method=RequestMethod.POST)
	public Msg SeluserByIdServlet(Integer id) {
		
		Msg msg = adminService.SeluserByIdServlet(id);
		return msg;
	}
	
	/**
	 * 根据用户名查询用户信息
	 * @param username
	 * @return
	 */
	@RequestMapping(value="/SeluserServlet",method=RequestMethod.POST)
	public Msg SeluserServlet(@RequestParam("username") String username) {
		System.out.println("用户名查询用户,username:"+username);
		Msg msg = adminService.SeluserServlet(username);
//		System.out.println("SeluserServlet的msg:"+msg);
		return msg;
	}
	
	/**
	 * 柱状图数据
	 * @return
	 */
	@RequestMapping(value="/TuServlet",method=RequestMethod.POST)
	public Msg TuServlet() {
		
		Msg msg = adminService.TuServlet();
		return msg;
	}
	
	/**
	 * 更新景点信息
	 * @return
	 */
	@RequestMapping(value="/UpdjingdianServlet",method=RequestMethod.POST)
	public Msg UpdjingdianServlet(Integer id,String yiji,String erji,String sanji,
			String name,String jianjie,String lishi,String wenhua,String techang) {

		Jingdian jingdian = new Jingdian();
		jingdian.setErji(erji);
		jingdian.setId(id);
		jingdian.setJianjie(jianjie);
		jingdian.setLishi(lishi);
		jingdian.setName(name);
		jingdian.setSanji(sanji);
		jingdian.setYiji(yiji);
		jingdian.setTechang(techang);
		jingdian.setWenhua(wenhua);
		System.out.println("jingdian:"+jingdian);
		Msg msg = adminService.UpdjingdianServlet(jingdian);
		return msg;
	}
	
	/**
	 * 设置不热门景点
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/UpdNoRMServlet",method=RequestMethod.POST)
	public Msg UpdNoRMServlet(Integer id) {
		
		Msg msg = adminService.UpdNoRMServlet(id);
		return msg;
	}
	
	/**
	 * 设置热门景点
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/UpdRMServlert",method=RequestMethod.POST)
	public Msg UpdRMServlert(Integer id) {
		
		Msg msg = adminService.UpdRMServlert(id);
		return msg;
	}
	
	/**
	 * 修改用户信息
	 * @param id
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping(value="/UpuserServlet",method=RequestMethod.POST)
	public Msg UpuserServlet(Integer id,String username,String password) {
		
		User user = new User();
		user.setId(id);
		user.setUsername(username);
		user.setPassword(password);
		Msg msg = adminService.UpuserServlet(user);
		return msg;
	}
	
	/**
	 * 后台分页查询用户
	 * @param pn
	 * @return
	 */
	@RequestMapping(value="/UserServlet",method=RequestMethod.POST)
	public Msg UserServlet(@RequestParam("pn") Integer pn) {
		
		Msg msg = adminService.UserServlet(pn);
		return msg;
	}
}
