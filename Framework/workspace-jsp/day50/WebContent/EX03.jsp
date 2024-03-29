<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EX03.jsp</title>

<style>
	.clr {
		color: blue;
	}
	
	
</style>

</head>

<body>
	<h1>실행부는 끊어서 사용 가능</h1>
	<hr>

	<h4>1. 끊지 않고 사용 시</h4>

	<%
		for (int i = 1; i <= 3; i++) {
		out.println("<p class=\"clr\">" + i + " : HelloJSP!!!" + "</p>");
	}
	%>

	<hr>

	<h4>2. 끊어서 사용 시</h4>
	<%
		for (int i = 1; i <= 3; i++) {
	%>

	<p class="clr"><%=i%>: Hello world!!!
	</p>

	<%
		}
	%>


</body>
</html>