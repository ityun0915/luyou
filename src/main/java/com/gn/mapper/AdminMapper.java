package com.gn.mapper;

import java.util.List;

import com.gn.pojo.Address;
import com.gn.pojo.Admin;
import com.gn.pojo.Dianzan;
import com.gn.pojo.Jingdian;
import com.gn.pojo.Liuyan;
import com.gn.pojo.LiuyanBo;
import com.gn.pojo.Pinglun;
import com.gn.pojo.PinglunBo;
import com.gn.pojo.User;

public interface AdminMapper {

	/**
	 * 管理员登录
	 * @param admin
	 * @return
	 */
	public List<Admin> AdminLogin(Admin admin);
	
	/**
	 * 增加访客数量
	 * @return
	 */
	public int AddfangkeshuServlet();
	
	/**
	 * AddpinglunServlet
	 * 添加评论
	 * @param pinglun
	 * @return
	 */
	public int AddpinglunServlet(Pinglun pinglun);
	
	/**
	 * 前端查询所有评论
	 * @param id
	 * @return
	 */
	public List<PinglunBo> AllpinglunServlet(int id);
	
	/**
	 * 删除景点
	 * @param id
	 * @return
	 */
	public int DeljingdianServlet(int id);
	
	/**
	 * 删除留言
	 * @param id
	 * @return
	 */
	public int DelliuyanServlet(int id);
	
	/**
	 * 删除评论
	 * @param id
	 * @return
	 */
	public int DelPinglunServlet(int id);
	
	/**
	 * 添加留言
	 * @param liuyan
	 * @return
	 */
	public int LiuyanServlet(Liuyan liuyan);
	
	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	public int DeluserServlet(int id);
	
	/**
	 * 用户点赞
	 * @param dianzan
	 * @return
	 */
	public int DianzanServlet(Dianzan dianzan);
	
	/**
	 * 判断用户和景点之间的点赞关系
	 * @param dianzan
	 * @return
	 */
	public List<Dianzan> IsdianzanServlet(Dianzan dianzan);
	
	/**
	 * 前端按城市查询所有的景点
	 * @param address
	 * @return
	 */
	public List<Jingdian> JingdianAllServlet(Address address);
	
	/**
	 * 用户登录
	 * @param user
	 * @return
	 */
	public User LoginServlet(User user);
	
	/**
	 * 用户注册
	 * @param user
	 * @return
	 */
	public int RsgServlet(User user);
	
	/**
	 * 后台分页查询所有评论
	 * @param pn
	 * @return
	 */
	public List<PinglunBo> SelAllPinglunServlet();
	
	/**
	 * 后台分页查询所有景点
	 * @return
	 */
	public List<Jingdian> SelJDServlet();
	
	/**
	 * 后台分页查询留言
	 * @return
	 */
	public List<LiuyanBo> SelliuyanServlet();
	
	/**
	 * 根据景点id查询景点
	 * @param id
	 * @return
	 */
	public Jingdian SelOneByIdServlet(int id);
	
	/**
	 * 后台根据地区查询景点（分页）
	 * @param address
	 * @return
	 */
	public List<Jingdian> SelOneByTiaojianServlet(Address address);
	
	/**
	 * 查询热门景点
	 * @return
	 */
	public List<Jingdian> SelRDjindianServlet();
	
	/**
	 * 根据id查询用户信息
	 * @param id
	 * @return
	 */
	public User SeluserByIdServlet(int id);
	
	/**
	 * 根据用户名查询用户信息
	 * @param username
	 * @return
	 */
	public User SeluserServlet(String username);
	
	/**
	 * 用户数
	 * @return
	 */
	public int renshu();
	
	/**
	 * 访客数
	 * @return
	 */
	public int fangkeshu();
	
	/**
	 * 点赞数
	 * @return
	 */
	public int dianzanshu();
	
	/**
	 * 更新景点信息
	 * @param jingdian
	 * @return
	 */
	public int UpdjingdianServlet(Jingdian jingdian);
	
	/**
	 * 设置不热门景点
	 * @param id
	 * @return
	 */
	public int UpdNoRMServlet(int id);
	
	/**
	 * 设置热门景点
	 * @param id
	 * @return
	 */
	public int UpdRMServlert(int id);
	
	/**
	 * 修改用户信息
	 * @param user
	 * @return
	 */
	public int UpuserServlet(User user);
	
	/**
	 * 后台分页查询用户
	 * @return
	 */
	public List<User> UserServlet();
}
