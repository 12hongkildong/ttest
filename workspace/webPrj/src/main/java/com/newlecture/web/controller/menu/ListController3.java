package com.newlecture.web.controller.menu;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.newlecture.web.entity.GList;
import com.newlecture.web.entity.Menu;
import com.newlecture.web.service.DefaultMenuService;
import com.newlecture.web.service.MenuService;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/menu/list3")
public class ListController3 extends HttpServlet{
	
	private MenuService service;
	
	public ListController3() {
		service = new DefaultMenuService();
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		resp.setCharacterEncoding("UTF-8");
		//브라우저에서 html로 읽고 UTF-8로 읽어라 하고 헤더에 넣어줌.
		resp.setContentType("text/html; charset=UTF-8");
		
		req.getParameter("c");
		
		PrintWriter out = resp.getWriter();
		
		List<Menu> menus = new ArrayList<>(); //service.getList();
		
//		HttpSession session = req.getSession();
//		session.setAttribute("haha","hoho");
//		
		Cookie cookie = new Cookie("haha", "hoho");
		cookie.setPath("/");
		cookie.setMaxAge(60*24);
		resp.addCookie(cookie);
		
		req.setAttribute("menus", menus);
		
		req.getRequestDispatcher("/WEB-INF/view/menu/list2.jsp").forward(req, resp);
//		
	}
}
