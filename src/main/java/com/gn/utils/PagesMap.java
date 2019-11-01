package com.gn.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.gn.pojo.Jingdian;
import com.gn.pojo.LiuyanBo;
import com.gn.pojo.PinglunBo;
import com.gn.pojo.User;

public class PagesMap {
	
	public static Map<String,Object> getpagesUserMaps(List<User> list,int pn){
		 List<User> newList = new ArrayList<User>();
	        if(10*pn>list.size()) {
	        	newList = list.subList(10*pn-9-1,list.size());
	        }else {
	        	newList = list.subList(10*pn-9-1, 10*pn);
	        }
	        
	        Map<String,Object> map = new HashMap<String,Object>();
	        
	        int total = list.size();   
	        int pageNum = pn;          
	        int pages = total%10 == 0 ? (total/10) : (total/10)+1;   
	        int[] navigatepageNums = new int[pages];      
	        for(int i=0;i<navigatepageNums.length;i++) {
	        	navigatepageNums[i]=i+1;	        			
	        }
	        boolean hasNextPage = false;
	        if(pn==pages) {
	        	hasNextPage = false;
	        }else {
	        	hasNextPage = true;
	        }
	        boolean hasPreviousPage = false;
	        if(pn==1) {
	        	hasPreviousPage = false;
	        }else {
	        	hasPreviousPage = true;
	        }
	        map.put("total", total);
	        map.put("pageNum", pageNum);
	        map.put("pages", pages);
	        map.put("navigatepageNums", navigatepageNums);
	        map.put("hasNextPage", hasNextPage);
	        map.put("list", newList);
	        map.put("hasPreviousPage", hasPreviousPage);
	        return map;
	}
	
	public static Map<String,Object> getpagesJingdianMaps(List<Jingdian> list,int pn){
		 List<Jingdian> newList = new ArrayList<Jingdian>();
	        if(10*pn>list.size()) {
	        	newList = list.subList(10*pn-9-1,list.size());
	        }else {
	        	newList = list.subList(10*pn-9-1, 10*pn);
	        }
	        
	        Map<String,Object> map = new HashMap<String,Object>();
	        
	        int total = list.size();   
	        int pageNum = pn;          
	        int pages = total%10 == 0 ? (total/10) : (total/10)+1;   
	        int[] navigatepageNums = new int[pages];      
	        for(int i=0;i<navigatepageNums.length;i++) {
	        	navigatepageNums[i]=i+1;	        			
	        }
	        boolean hasNextPage = false;
	        if(pn==pages) {
	        	hasNextPage = false;
	        }else {
	        	hasNextPage = true;
	        }
	        boolean hasPreviousPage = false;
	        if(pn==1) {
	        	hasPreviousPage = false;
	        }else {
	        	hasPreviousPage = true;
	        }
	        map.put("total", total);
	        map.put("pageNum", pageNum);
	        map.put("pages", pages);
	        map.put("navigatepageNums", navigatepageNums);
	        map.put("hasNextPage", hasNextPage);
	        map.put("list", newList);
	        map.put("hasPreviousPage", hasPreviousPage);
	        return map;
	}
	
	
	public static Map<String,Object> getpagesPinglunMaps(List<PinglunBo> list,int pn){
		 List<PinglunBo> newList = new ArrayList<PinglunBo>();
	        if(10*pn>list.size()) {
	        	newList = list.subList(10*pn-9-1,list.size());
	        }else {
	        	newList = list.subList(10*pn-9-1, 10*pn);
	        }
	        
	        Map<String,Object> map = new HashMap<String,Object>();
	        
	        int total = list.size();   
	        int pageNum = pn;          
	        int pages = total%10 == 0 ? (total/10) : (total/10)+1;   
	        int[] navigatepageNums = new int[pages];      
	        for(int i=0;i<navigatepageNums.length;i++) {
	        	navigatepageNums[i]=i+1;	        			
	        }
	        boolean hasNextPage = false;
	        if(pn==pages) {
	        	hasNextPage = false;
	        }else {
	        	hasNextPage = true;
	        }
	        boolean hasPreviousPage = false;
	        if(pn==1) {
	        	hasPreviousPage = false;
	        }else {
	        	hasPreviousPage = true;
	        }
	        map.put("total", total);
	        map.put("pageNum", pageNum);
	        map.put("pages", pages);
	        map.put("navigatepageNums", navigatepageNums);
	        map.put("hasNextPage", hasNextPage);
	        map.put("list", newList);
	        map.put("hasPreviousPage", hasPreviousPage);
	        return map;
	}
	
	public static Map<String,Object> getpagesLiuyanMaps(List<LiuyanBo> list,int pn){
		 List<LiuyanBo> newList = new ArrayList<LiuyanBo>();
	        if(10*pn>list.size()) {
	        	newList = list.subList(10*pn-9-1,list.size());
	        }else {
	        	newList = list.subList(10*pn-9-1, 10*pn);
	        }
	        
	        Map<String,Object> map = new HashMap<String,Object>();
	        
	        int total = list.size();   
	        int pageNum = pn;          
	        int pages = total%10 == 0 ? (total/10) : (total/10)+1;   
	        int[] navigatepageNums = new int[pages];      
	        for(int i=0;i<navigatepageNums.length;i++) {
	        	navigatepageNums[i]=i+1;	        			
	        }
	        boolean hasNextPage = false;
	        if(pn==pages) {
	        	hasNextPage = false;
	        }else {
	        	hasNextPage = true;
	        }
	        boolean hasPreviousPage = false;
	        if(pn==1) {
	        	hasPreviousPage = false;
	        }else {
	        	hasPreviousPage = true;
	        }
	        map.put("total", total);
	        map.put("pageNum", pageNum);
	        map.put("pages", pages);
	        map.put("navigatepageNums", navigatepageNums);
	        map.put("hasNextPage", hasNextPage);
	        map.put("list", newList);
	        map.put("hasPreviousPage", hasPreviousPage);
	        return map;
	}
}
