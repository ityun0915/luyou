package com.gn.pojo;

/**
 * 评论实体类
 * 2019年9月19日17:43:20
 * @author 
 *
 */
public class PinglunBo {

	private int id;
	
	private String username;
	
	private String jindianname;
	
	private int jindian;
	
	private String details;
	
	private String time;

	
	
	public String getJindianname() {
		return jindianname;
	}

	public void setJindianname(String jindianname) {
		this.jindianname = jindianname;
	}

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

	public int getJindian() {
		return jindian;
	}

	public void setJindian(int jindian) {
		this.jindian = jindian;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "PinglunBo [id=" + id + ", username=" + username + ", jindianname=" + jindianname + ", jindian="
				+ jindian + ", details=" + details + ", time=" + time + "]";
	}

	
}
