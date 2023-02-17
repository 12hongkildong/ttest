package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/input")
public class InputController extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		1. 쿼리 스트림을 이용한 입력znjfl tmxmfladmf dldydgks dlqfur
//			QueryString이란? 데이터 제공하는 방법, 그대신 우리 비밀번호 같은 게 보이게 된다?
//		예: 페이지, 검색어, 레코드 개수, 날짜 범위, 기간...
//		그럼 위의 옵션은 누가 결정하냐? -> 서버
//		그럼 어떤 식으로 서버가 그 값을 받도록 할 것인가?
		
//		int page = request.getParameter("p");
//		전달한 내용은 무조건 문자열로 오기에 int로 받으니 오류가 나는 것 integer형으로 바꾸나?
//		입력 값은 무조건 문자열이므로 바로 int로 사용할 수 없다.
		response.setContentType("text/html; charset=UTF-8");
		
		
		String page = request.getParameter("p");
		String query = request.getParameter("q");
		
		String size = request.getParameter("s");
		// dlqfur rkqtdmf wjsekfgksms tkdydwksms zldnjemfh ㅔfmf tkdydgkehfhr rufwjdgks ruddn ekdmacjfja rkqtdmf qkedmf tn dlTEk.
		
		
//		그럼 요청하는 방법은?
//		input?=1
		PrintWriter out = response.getWriter();		
//		http://localhost:8080/input?p=3&q=hello&s=15

		
		out.println(page);
		out.println(query);
		out.println(size);
		out.write("<br>");
		// dnldml znjfltmxmfladptj 냨ㄷfmf dlqfur qkerl dnlgks zldnjemfmf dho rnedl ㄴfh gotSkdy? -> rmsid 냐
		// 위의 쿼리스트림에서 size를 입력 받기 위한 키워드를 왜 굳이 ㄴfh goTSkdy? rmsid 냨ㄷfh gkwl?
		// 웹의 주소는 원래 1000자 내외의 길이제한이 있다 값을 줄일 수 는 없으니 키워드라도 줄여보자고 했던 것
//		과거 플랫폼과의 호환성 때문이다.
//		여담이지만 최근엔 제한이 없다는 말도 있습니다.
		
		
		
//		2. form을 이용한 입력
//		사실 쿼리 스트릠은 사용자가 전달하는 값이라기 보다 페이지를 제공하는 쪽에서 정해진 값을 선택하게 하는 방식이다.
//		예를 들어 쿼리스트림은 사용자가 url창을 직접 편집하는 것이 아니라 다음처럼 링크에 잇는 경우가 일반적이다
//		<a href="/input?p=2&q=hello&s=15">2</a>
//		<a href="/input?p=3&q=hello&s=15">1</a>
//		d위와 같이 이미 정해진 값 중 하나의 링크를 선택함으로 입력을 요청하게 된다.
//		반면 사용자가 값을 직접 입력하게 하고 싶다면 어떻게 할까? 그때는 form을 제공함으로 입력을 하게 한다.
		
	
		request.setAttribute("page", page);
		request.setAttribute("query", query);
		request.setAttribute("size", size);
		
		request.getHeader("referer");
		
		String[] hbs=request.getParameterValues("hb");
		request.setAttribute("cnt", hbs.length);
		
		
//		3. 쿠키 입력
		
		
		
//		4. header 입력
		
		
		
//		5. hidden 필드 입력
		
		
		request.getRequestDispatcher("/WEB-INF/view/input.jsp").forward(request, response);
	}
	
	

}
