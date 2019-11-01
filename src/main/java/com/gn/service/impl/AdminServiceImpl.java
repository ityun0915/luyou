package com.gn.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gn.mapper.AdminMapper;
import com.gn.pojo.Address;
import com.gn.pojo.Admin;
import com.gn.pojo.Dianzan;
import com.gn.pojo.Jingdian;
import com.gn.pojo.Liuyan;
import com.gn.pojo.LiuyanBo;
import com.gn.pojo.Pinglun;
import com.gn.pojo.PinglunBo;
import com.gn.pojo.User;
import com.gn.service.AdminService;
import com.gn.utils.Msg;
import com.gn.utils.PagesMap;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminMapper adminMapper;
	
	public Msg AdminLogin(Admin admin) {
		// TODO Auto-generated method stub
		List<Admin> result = adminMapper.AdminLogin(admin);
		if(result!=null && result.size()>0) {
			return Msg.success();
		}else {
			return Msg.fail();
		}
	}

	public Msg AddfangkeshuServlet() {
		// TODO Auto-generated method stub
		adminMapper.AddfangkeshuServlet();
		return Msg.success();
	}

	public Msg AddpinglunServlet(Pinglun pinglun) {
		// TODO Auto-generated method stub
		adminMapper.AddpinglunServlet(pinglun);
		return Msg.success();
	}

	public Msg AllpinglunServlet(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("servicImpl的景点id:"+id);
		List<PinglunBo> result = adminMapper.AllpinglunServlet(id);
		for(PinglunBo b:result) {
			System.out.println("评论详情:"+b);
		}
		return Msg.success().add("list",result);
	}

	public Msg DeljingdianServlet(Integer id) {
		// TODO Auto-generated method stub
		adminMapper.DeljingdianServlet(id);
		return Msg.success();
	}

	public Msg DelliuyanServlet(Integer id) {
		// TODO Auto-generated method stub
		adminMapper.DelliuyanServlet(id);
		return Msg.success();
	}

	public Msg DelPinglunServlet(Integer id) {
		// TODO Auto-generated method stub
		adminMapper.DelPinglunServlet(id);
		return Msg.success();
	}

	public Msg DeluserServlet(Integer id) {
		// TODO Auto-generated method stub
		adminMapper.DeluserServlet(id);
		return Msg.success();
	}

	public Msg DianzanServlet(Dianzan dianzan) {
		// TODO Auto-generated method stub
		adminMapper.DianzanServlet(dianzan);
		return Msg.success();
	}

	public Msg IsdianzanServlet(Integer userId, Integer jingdianId) {
		// TODO Auto-generated method stub
		System.out.println("到了IsdianzanServlet的serviceImpl");
		Dianzan dianzan = new Dianzan();
		dianzan.setJindianId(jingdianId);
		dianzan.setUserId(userId);
		List<Dianzan> result = adminMapper.IsdianzanServlet(dianzan);

		for (Dianzan dianzan1:result){
			System.out.println("点赞对象:"+dianzan1);
		}

		if(result!=null && result.size()>0) {
			return Msg.success();
		}else {
			return Msg.fail();
		}
	}

	public Msg IsdianzanServlet(String yiji, String erji, String sanji) {
		// TODO Auto-generated method stub
		Address address = new Address();
		address.setErji(erji);
		address.setSanji(sanji);
		address.setYiji(yiji);
		
		List<Jingdian> result = adminMapper.JingdianAllServlet(address);
		return Msg.success().add("list", result);
	}

	public Msg LiuyanServlet(Liuyan liuyan) {
		System.out.println("id为"+liuyan.getId()+"正在留言....liuyan:"+liuyan);
		// TODO Auto-generated method stub
		adminMapper.LiuyanServlet(liuyan);		
		return Msg.success();
	}

	public Msg LoginServlet(String username, String password) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		User result = adminMapper.LoginServlet(user);

			System.out.println("loginUser:"+result);

		if(result!=null) {
			return Msg.success().add("list",result);
		}else {
			return Msg.fail();
		}
	}

	public Msg RsgServlet(String username, String password) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		adminMapper.RsgServlet(user);
		return Msg.success();
	}

	public Msg SelAllPinglunServlet(int pn) {
		// TODO Auto-generated method stub
		List<PinglunBo> list = adminMapper.SelAllPinglunServlet();

		for (PinglunBo pinglunBo:list){
			System.out.println("评论:"+pinglunBo);
		}

		Map<String,Object> pageInfo = PagesMap.getpagesPinglunMaps(list, pn);
		return Msg.success().add("list", pageInfo);
	}

	public Msg SelJDServlet(int pn) {
		// TODO Auto-generated method stub
		List<Jingdian> list = adminMapper.SelJDServlet();
		Map<String,Object> pageInfo = PagesMap.getpagesJingdianMaps(list, pn);
		return Msg.success().add("list", pageInfo);
	}

	public Msg SelliuyanServlet(int pn) {
		// TODO Auto-generated method stub
		List<LiuyanBo> result = adminMapper.SelliuyanServlet();
		for (LiuyanBo liuyanBo:result){
			System.out.println("留言result:"+liuyanBo);
		}
		Map<String,Object> pageInfo = PagesMap.getpagesLiuyanMaps(result, pn);
		return Msg.success().add("list", pageInfo); 
	}

	public Msg SelOneByIdServlet(int id) {
		// TODO Auto-generated method stub
		Jingdian jingdian = adminMapper.SelOneByIdServlet(id);
		return Msg.success().add("jingdian", jingdian);
	}

	public Msg SelOneByTiaojianServlet(Address address) {
		// TODO Auto-generated method stub
		List<Jingdian> list = adminMapper.SelOneByTiaojianServlet(address);
	    Map<String,Object> pageInfo = PagesMap.getpagesJingdianMaps(list, 1);
		return Msg.success().add("list", pageInfo);
	}

	public Msg SelRDjindianServlet() {
		// TODO Auto-generated method stub
		List<Jingdian> list = adminMapper.SelRDjindianServlet();

		for (Jingdian jingdian:list){
			System.out.println("SelRDjindianServlet的jingdain:"+jingdian);
		}

		return Msg.success().add("list", list);
	}

	public Msg SeluserByIdServlet(Integer id) {
		// TODO Auto-generated method stub
		User user = adminMapper.SeluserByIdServlet(id);
		return Msg.success().add("user", user);
	}

	public Msg SeluserServlet(String username) {
		// TODO Auto-generated method stub
		User user = adminMapper.SeluserServlet(username);
		System.out.println("impl: user:"+user);
		return Msg.success().add("user", user);
	}

	public Msg TuServlet() {
		// TODO Auto-generated method stub
		int renshu = 0;
        int fangkeshu = 0;
        int dianzanshu = 0;
        renshu = adminMapper.renshu();
        fangkeshu = adminMapper.fangkeshu();
        dianzanshu = adminMapper.dianzanshu();

        System.out.println("renshu:"+renshu);
        System.out.println("renshu:"+renshu);
        System.out.println("dianzanshu:"+dianzanshu);

		return Msg.success().add("renshu", renshu).add("fankeshu", fangkeshu).add("dianzanshu", dianzanshu);
	}

	public Msg UpdjingdianServlet(Jingdian jingdian) {
		// TODO Auto-generated method stub
		adminMapper.UpdjingdianServlet(jingdian);
		return Msg.success();
	}

	public Msg UpdNoRMServlet(Integer id) {
		// TODO Auto-generated method stub
		adminMapper.UpdNoRMServlet(id);
		return Msg.success();
	}

	public Msg UpdRMServlert(Integer id) {
		// TODO Auto-generated method stub
		adminMapper.UpdRMServlert(id);
		return Msg.success();
	}

	public Msg UpuserServlet(User user) {
		// TODO Auto-generated method stub
		adminMapper.UpuserServlet(user);
		return Msg.success();
	}

	public Msg UserServlet(Integer pn) {
		// TODO Auto-generated method stub
		List<User> list = adminMapper.UserServlet();
		Map<String,Object> pageInfo = PagesMap.getpagesUserMaps(list, pn);
		return Msg.success().add("list", pageInfo);
	}
}
