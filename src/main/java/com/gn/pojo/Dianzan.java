package com.gn.pojo;

/**
 * 点赞实体类
 * 2019年9月19日17:41:56
 * @author 
 *
 */
public class Dianzan {

	private int id;
	
	private int userId;
	
	private int jingdianId;
	
	private String time;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getJindianId() {
		return jingdianId;
	}

	public void setJindianId(int jindianId) {
		this.jingdianId = jindianId;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	
}
