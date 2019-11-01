package com.gn.service;

import com.gn.pojo.Address;
import com.gn.pojo.Admin;
import com.gn.pojo.Dianzan;
import com.gn.pojo.Jingdian;
import com.gn.pojo.Liuyan;
import com.gn.pojo.Pinglun;
import com.gn.pojo.User;
import com.gn.utils.Msg;

public interface AdminService {

	/**
	 * 管理员登录
	 * @param admin
	 * @return
	 */
	public Msg AdminLogin(Admin admin);

	/**
	 * 添加访问量
     *  在用户登录时调用
	 */
	public Msg AddfangkeshuServlet();

	/**
	 * 添加评论
	 * @return
	 */
	public Msg AddpinglunServlet(Pinglun pinglun);

	/**
	 * 前端显示景点评论
	 * @param id
	 * @return
	 */
	public Msg AllpinglunServlet(Integer id);

	/**
	 * 删除景点
	 * @param id
	 * @return
	 */
	public Msg DeljingdianServlet(Integer id);

	/**
	 * 删除留言
	 * @param id
	 * @return
	 */
	public Msg DelliuyanServlet(Integer id);

	/**
	 * 删除评论
	 * @param id
	 * @return
	 */
	public Msg DelPinglunServlet(Integer id);

	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	public Msg DeluserServlet(Integer id);

	/**
	 * 用户点赞
	 * @param dianzan
	 * @return
	 */
	public Msg DianzanServlet(Dianzan dianzan);

	/**
	 * 判断用户和景点之间的点赞关系
	 * @param userId
	 * @param jingdianId
	 * @return
	 */
	public Msg IsdianzanServlet(Integer userId, Integer jingdianId);

	/**
	 * 前端按城市查询所有的景点
	 * @param yiji
	 * @param erji
	 * @param sanji
	 * @return
	 */
	public Msg IsdianzanServlet(String yiji, String erji, String sanji);

	/**
	 * 添加留言
	 * @param liuyan
	 * @return
	 */
	public Msg LiuyanServlet(Liuyan liuyan);

	/**
	 * 用户登录
	 * @param username
	 * @param password
	 * @return
	 */
	public Msg LoginServlet(String username, String password);

	/**
	 * 用户注册
	 * @param username
	 * @param password
	 * @return
	 */
	public Msg RsgServlet(String username, String password);

	/**
	 * 后台分页查询所有评论
	 * @param pn
	 * @return
	 */
	public Msg SelAllPinglunServlet(int pn);

	/**
	 * 后台分页查询所有景点
	 * @param pn
	 * @return
	 */
	public Msg SelJDServlet(int pn);

	/**
	 * 后台分页查询所有留言
	 * @param pn
	 * @return
	 */
	public Msg SelliuyanServlet(int pn);

	/**
	 * 根据id查询景点
	 * @param id
	 * @return
	 */
	public Msg SelOneByIdServlet(int id);

	/**
	 * 后台根据地区查询景点（分页）
	 * @param address
	 * @return
	 */
	public Msg SelOneByTiaojianServlet(Address address);

	/**
	 * 查询热门景点
	 * @return
	 */
	public Msg SelRDjindianServlet();

	/**
	 * 根据id查询用户信息
	 * @param id
	 * @return
	 */
	public Msg SeluserByIdServlet(Integer id);

	/**
	 * 根据用户名查询用户信息
	 * @param username
	 * @return
	 */
	public Msg SeluserServlet(String username);

	/**
	 * 柱状图数据
	 * @return
	 */
	public Msg TuServlet();

	/**
	 * 更新景点信息
	 * @param jingdian
	 * @return
	 */
	public Msg UpdjingdianServlet(Jingdian jingdian);

	/**
	 * 设置不热门景点
	 * @param id
	 * @return
	 */
	public Msg UpdNoRMServlet(Integer id);

	/**
	 * 设置热门景点
	 * @param id
	 * @return
	 */
	public Msg UpdRMServlert(Integer id);

	/**
	 * 修改用户信息
	 * @param user
	 * @return
	 */
	public Msg UpuserServlet(User user);

	/**
	 * 后台分页查询用户
	 * @param pn
	 * @return
	 */
	public Msg UserServlet(Integer pn);
}
