<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<style>
	.board{
		margin-left: auto;
		margin-right: auto;
		border: 1px solid black;
		border-collapse: collapse;
	}
	
	.board th, .board td{
		border: 3px solid black;
		padding: 10px 10px;
		
	}
</style>

</head>
<body>
	
	<table class="board">
		<tr>
			<th>계정번호</th>
			<th>아이디</th>
			<th>닉네임</th>
			<th>이메일</th>
			<th>가입일</th>
		</tr>
		
		<c:forEach var="row" items="${list }">
		<tr>
			<td>${row.idx }</td>
			<td>${row.userid }</td>
			<td>${row.nick }</td>
			<td>${row.email }</td>
			<td>${row.j_date }</td>
			
	
		</tr>
		</c:forEach>
	</table>
	
</body>
</html>