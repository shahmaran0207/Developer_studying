<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quiz1.jsp</title>
</head>
<body>
	<h1>Quiz1</h1>
	<hr>

	<h4>JSP 구문을 활용해서 구구단 2단을 출력(X1 ~ X9)</h4>

	<%for (int i = 2; i <= 9; i++) { %>
	
		<%for (int j = 1; j <= 9; j++) { %>
			<p><%=i%> *	<%=j%>	= <%=i * j%></p>
		<%}%>
	<hr>
	<%} %>
	
</body>
</html>