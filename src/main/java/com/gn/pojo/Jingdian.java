package com.gn.pojo;

import java.io.Serializable;

/**
 * 景点实体类
 * 2019年9月19日17:42:24
 * @author 
 *
 */
public class Jingdian implements Serializable {

	private int id;
	
	private String name;
	
	private String yiji;
	
	private String erji;
	
	private String sanji;
	
	private String jianjie;
	
	private String jianjietu;
	
	private String wenhua;
	
	private String wenhuatu;
	
	private String lishi;
	
	private String lishitu;
	
	private String techang;
	
	private String techangtu;
	
	private int isremeng;
	
	

	public int getIsremeng() {
		return isremeng;
	}

	public void setIsremeng(int isremeng) {
		this.isremeng = isremeng;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYiji() {
		return yiji;
	}

	public void setYiji(String yiji) {
		this.yiji = yiji;
	}

	public String getErji() {
		return erji;
	}

	public void setErji(String erji) {
		this.erji = erji;
	}

	public String getSanji() {
		return sanji;
	}

	public void setSanji(String sanji) {
		this.sanji = sanji;
	}

	public String getJianjie() {
		return jianjie;
	}

	public void setJianjie(String jianjie) {
		this.jianjie = jianjie;
	}

	public String getJianjietu() {
		return jianjietu;
	}

	public void setJianjietu(String jianjietu) {
		this.jianjietu = jianjietu;
	}

	public String getWenhua() {
		return wenhua;
	}

	public void setWenhua(String wenhua) {
		this.wenhua = wenhua;
	}

	public String getWenhuatu() {
		return wenhuatu;
	}

	public void setWenhuatu(String wenhuatu) {
		this.wenhuatu = wenhuatu;
	}

	public String getLishi() {
		return lishi;
	}

	public void setLishi(String lishi) {
		this.lishi = lishi;
	}

	public String getLishitu() {
		return lishitu;
	}

	public void setLishitu(String lishitu) {
		this.lishitu = lishitu;
	}

	public String getTechang() {
		return techang;
	}

	public void setTechang(String techang) {
		this.techang = techang;
	}

	public String getTechangtu() {
		return techangtu;
	}

	public void setTechangtu(String techangtu) {
		this.techangtu = techangtu;
	}

	@Override
	public String toString() {
		return "Jingdian{" +
				"id=" + id +
				", name='" + name + '\'' +
				", yiji='" + yiji + '\'' +
				", erji='" + erji + '\'' +
				", sanji='" + sanji + '\'' +
				", jianjie='" + jianjie + '\'' +
				", jianjietu='" + jianjietu + '\'' +
				", wenhua='" + wenhua + '\'' +
				", wenhuatu='" + wenhuatu + '\'' +
				", lishi='" + lishi + '\'' +
				", lishitu='" + lishitu + '\'' +
				", techang='" + techang + '\'' +
				", techangtu='" + techangtu + '\'' +
				", isremeng=" + isremeng +
				'}';
	}
}
