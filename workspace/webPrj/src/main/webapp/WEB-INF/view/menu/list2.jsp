<%@page import="com.newlecture.web.entity.Menu"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%
	List<Menu> menus = (List<Menu>)request.getAttribute("menus");
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>메뉴목록</h1>
	<table border="1px">
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>가격</td>
		</tr>

		<c:forEach var="m" items="${menus }">
		<fmt:formatNumber var="price" pattern="#,###" value="${m.price+1}"/>
			<tr>
				<td>${m.id}</td>
				<td>${m.name}</td>
				<td>${price } 원</td>	
				<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${m.regDate}"/>
				<tr>
					<td colspan="4">
						<c:forTokens var="img" items="${m.images }" delims=",">
						<a download href="upload/s{img}">${img} |</a>
						${img }
						</c:forTokens>
					</td>
				</tr>
				<%--
			<td><%=m.getId()%></td>			
			<td><%=m.getName() %></td>
			<td><%=m.getPrice() %></td>
			
		 --%>
			</tr>
		</c:forEach>


	</table>
</body>
</html>