<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Day61-EX04.jsp</title>
</head>

<style>
	body{
		color: ${cookie.color.value == null?'black':cookie.color.value};
	}
</style>

<body>
	<%
		Cookie[] cs = request.getCookies();
		String color;
	
		color = "";
	
		if (cs != null) {
			for (int i = 0; i < cs.length; i++) {
				switch (cs[i].getName()) {
				case "color":
					color = cs[i].getValue();
					break;
				}
			}
		}
	%>

	<p> color = <%=color%></p>

	<h1>EL의 쿠키 접근</h1>
	<hr>

	<h4>색상 전달</h4>
	<p>전달받은 페이지에서 color라는 이름으로 16진수 색상값을 가진 Cookie를 발급</p>

	<form action="EX04_result.jsp">
		<input name="color" type="color">
		<button>전송</button>
	</form>

</body>
</html>