package com.gn.pojo;

/**
 * 评论实体类
 * 2019年9月19日17:43:04
 * @author 
 *
 */
public class Pinglun {

	private int id;
	
	private int userId;
	
	private int jingdianId;
	
	private String details;
	
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

	public int getJindainId() {
		return jingdianId;
	}

	public void setJindainId(int jindainId) {
		this.jingdianId = jindainId;
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
		return "Pinglun{" +
				"id=" + id +
				", userId=" + userId +
				", jingdianId=" + jingdianId +
				", details='" + details + '\'' +
				", time='" + time + '\'' +
				'}';
	}
}
