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

// menu/list
public class ListPOJOController4{
	
	private int x = 1;
	private int y = 2;
	
	private MenuService service;
	
	public ListPOJOController4() {
		service = new DefaultMenuService();
	}
	

	
//	public int add(int x, int y) {
//		return x+y;
//	}
	public int add(int x, int y) {
		return 20+x;
	}
	
	public String requestHandler(){
		return "/WEB-INF/view/menu/list2.jsp";
	}
	
}
