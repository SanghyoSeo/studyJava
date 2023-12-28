<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.jsp.dto.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table {
		border: 1px solid black;
		border-radius: 3px;
	}
	th, td {
		border: 1px solid black;
		border-radius: 3px;
		padding: 2px 5px 2px 5px;
		width: 80px;
		text-align: center;
	}
</style>
</head>
<body>
<!--  	${memberList}-->
	<table>
		<tr>
			<th>아이디</th>
			<th>패스워드</th>
			<th>이름</th>
			<th>이메일</th>
			<th>전화번호</th>
		</tr>
		<%-- <%
			List<MemberVO> memberList = (ArrayList<MemberVO>)request.getAttribute("memberList");
		%> --%>
		<c:if test="${not empty memberList }">
			<c:forEach var="member" items="${memberList }" >
			<tr>
				<td>${member.id }</td>
				<td>${member.pwd }</td>
				<td>${member.name }</td>
				<td>${member.email }</td>
				<td>${member.phone }</td>
			</tr>
			</c:forEach>
		</c:if>
	</table>
</body>
</html>