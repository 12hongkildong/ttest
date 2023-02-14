package com.newlecture.web.controller.menu;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.newlecture.web.entity.GList;
import com.newlecture.web.entity.Menu;
import com.newlecture.web.entity.NList;
import com.newlecture.web.service.MenuService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/menu/listview")
public class ListView extends HttpServlet{
   
   private MenuService service;
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   resp.setCharacterEncoding("UTF-8"); // 브라우저에게 utf-8로 읽으라는 명령  
	   resp.setContentType("text/html;charset=utf-8");
	   
	   PrintWriter out = resp.getWriter();
	   List<Menu> menus = (List<Menu>) req.getAttribute("menues");
	   
//      =========================================출력코드
      
      out.write("<!DOCTYPE html>");   // 반복하지 말아야 할 것
      out.write("<html>");
      out.write("<head>");
      out.write("<meta charset=\"EUC-KR\">"); //  문자열 사이에 "가 있으니까 역슬레시를 적어준다.
      out.write("<title>Insert title here</title>");
      out.write("</head>");
      out.write("<body>");
      out.write("<h1>메뉴목록</h1>");
      out.write("<table>");
      out.write("<tr>");
      out.write("         			<td>번호</td>");
      out.write("         			<td>이름</td>");
      out.write("         			<td>가격</td>");
      out.write("</tr>");
      
      for(int i=0 ; i<menus.size() ; i++) {
    	  Menu m = (Menu)menus.get(i);
      out.write("<tr>");                 // 반복 출력할 녀석
      out.write("<td>"+m.getId()+"</td>");
      out.write("<td>"+m.getName()+"</td>");
      out.write("<td>5000</td>");
      out.write("</tr>");
      }      
      out.write("</table>");
      out.write("</body>");
      out.write("</html>");
   }
}