<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Day61-EX04_result.jsp</title>
</head>
<body>

	<%
		request.setCharacterEncoding("utf-8");
	
		String color = request.getParameter("color");
	
		Cookie[] cs = new Cookie[] {
			new Cookie("color", color)
		};
		
		
		for (int i = 0; i < cs.length; i++) {
			cs[i].setMaxAge(0);
			
			if (color != null) cs[i].setMaxAge(60 * 60 * 24 * 7);
			
			response.addCookie(cs[i]);
		}
	%>
	
	<h1>쿠키 발급</h1>
	<hr>
	
	<a href="EX04.jsp">
		<button>EX04</button>
	</a>

</body>
</html>