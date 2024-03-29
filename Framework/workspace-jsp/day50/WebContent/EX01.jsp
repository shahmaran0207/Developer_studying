<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>지역변수 VS 멤버변수(=필드)</h1>
	<hr>

	<%!int n1 = 10;%>
	<%-- 선언부 -> 필드 --%>
	<%
		int n2 = 10;
	%>
	<%-- 실행부 -> 지역 --%>

	<h4>F5를 눌러 새로고침</h4>

	<ul>
		<li>n1=<%=n1++%></li>
		<li>n2=<%=n2++%></li>
	</ul>ㄹ

	<ul>
		<li>선언부는 서버 실행 후 최초 요청시 필드와 메서드를 생성</li>
		<li>실행부는 페이지 요청시마다 특정 메서드가 호출되고 지역변수를 생성한다.</li>
	</ul>

</body>
</html>