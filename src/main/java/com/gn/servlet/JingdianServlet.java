package com.gn.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.gn.utils.IdUtils;
import com.gn.utils.JdbcUtils;

/**
 * Servlet implementation class JingdianServlet
 */
public class JingdianServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JingdianServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("我来了。。。");
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        PrintWriter out = response.getWriter();
        List items = null;
        try {
            items = upload.parseRequest(request);
        } catch (FileUploadException e) {
            e.printStackTrace();
        } // 解析request请求
        Iterator iter = items.iterator();// 遍历表单中提交过来的内容
        String yiji = null;
        String erji = null;
        String sanji = null;
        String name = null;
        String jianjie = null;
        String lishi = null;
        String wenhua = null;
        String techang = null;
        String jianjietu = null;
        String lishitu = null;
        String wenhuatu = null;
        String techangtu = null;
        while (iter.hasNext()) {
            FileItem item = (FileItem) iter.next();
            if (item.isFormField()) { // 如果是表单域 ，就是非文件上传元素
                String value = item.getString("UTF-8"); // 获取value属性的值，这里需要指明UTF-8格式，否则出现中文乱码问题
                if (item.getFieldName().equals("yiji")) {// 对应form中属性的名字
                    yiji = value;
                } else if (item.getFieldName().equals("erji")) {
                    erji = value;
                } else if(item.getFieldName().equals("sanji")) {
                	sanji = value;
                } else if(item.getFieldName().equals("name")) {
                	name = value;
                } else if(item.getFieldName().equals("jianjie")) {
                	jianjie = value;
                } else if(item.getFieldName().equals("lishi")) {
                	lishi = value;
                } else if(item.getFieldName().equals("wenhua")) {
                	wenhua = value;
                } else if(item.getFieldName().equals("techang")) {
                	techang = value;
                }
            } else {
                String fieldName = item.getFieldName(); // 文件域中name属性的值
                System.out.println("fieldName:" + fieldName);
                String filename = IdUtils.genImageName()+".jpg";// 文件的全路径，绝对路径名加文件名
                File saveFile = new File("D://commodity/images/" + filename); // 定义一个file指向一个具体的文件
                try {
                    item.write(saveFile);// 把上传的内容写到一个文件中
                   // /images/commodity/images/1568782820838185.jpg
                    if("jianjietu".equals(fieldName)) {
                    	jianjietu = "/images/commodity/images/"+filename;
                    }else if("lishitu".equals(fieldName)) {
                    	lishitu = "/images/commodity/images/"+filename;
                    }else if("wenhuatu".equals(fieldName)) {
                    	wenhuatu = "/images/commodity/images/"+filename;
                    }else if("techangtu".equals(fieldName)) {
                    	techangtu = "/images/commodity/images/"+filename;
                    }
                } catch (Exception e) {
                    /* e.printStackTrace(); */
                    System.out.println("文件为空");
                }
            }
        }
        //保存信息
        String sql = "INSERT INTO scenic_spot (yiji, erji,sanji,name,jianjie,lishi,wenhua,techang,jianjietu,lishitu,wenhuatu,techangtu,isremeng)"
        		+ "VALUES ('"+yiji+"', '"+erji+"','"+sanji+"','"+name+"','"+jianjie+"','"+lishi+"','"+wenhua+"','"+techang+"','"+jianjietu+"','"+lishitu+"','"+wenhuatu+"','"+techangtu+"',0)";
        JdbcUtils jdbcUtils = new JdbcUtils();
        try {
			Connection conn = jdbcUtils.getConnection();
			Statement stmt = conn.createStatement();
			int dept = stmt.executeUpdate(sql);
			if(dept==1) {
				out.println("添加成功！！");
				return;
			}else {
				out.println("添加失败！！");
				return;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println("yiji:" + yiji);
        System.out.println("erji:" + erji);
        System.out.println("sanji:" + sanji);
        System.out.println("name:" + name);
        System.out.println("jianjie:" + jianjie);
        System.out.println("lishi:" + lishi);
        System.out.println("wenhua:" + wenhua);
        System.out.println("techang:" + techang);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
