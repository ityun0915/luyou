package com.gn.pojo;

/**
 * 留言实体类
 * 2019年9月19日17:42:51
 * @author 
 *
 */
public class LiuyanBo {

	private int id;
	
	private String username;
	
	private String chenghu;
	
	private String phone;
	
	
	private String sex;
	
	private String xinxi;
	
	private String time;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getChenghu() {
		return chenghu;
	}

	public void setChenghu(String chenghu) {
		this.chenghu = chenghu;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getXinxi() {
		return xinxi;
	}

	public void setXinxi(String xinxi) {
		this.xinxi = xinxi;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "LiuyanBo{" +
				"id=" + id +
				", username='" + username + '\'' +
				", chenghu='" + chenghu + '\'' +
				", phone='" + phone + '\'' +
				", sex='" + sex + '\'' +
				", xinxi='" + xinxi + '\'' +
				", time='" + time + '\'' +
				'}';
	}
}
