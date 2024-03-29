<%@page import="model.vo.PersonVO"%>
<%@page import="model.PersonDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Person 수정</h1>
	
	<% 
		PersonDAO dao=new PersonDAO();
		String name=request.getParameter("name");
		
		PersonVO row=dao.selectOne(name);
	%>

	<form action="ex02_update.jsp" method="POST">
		<p><input name="name" placeholder="이름" value=<%=row.getName() %>></p>
		<p><input name="height" type="number" step="0.1"  placeholder="신장" value=<%=row.getHeight() %>></p>
		<p><input name="birth" type="date" placeholder="생년월일" value="<%=row.getBirth() %>"></p>

		<p><input name="oldName" type="hidden" value=<%=name %>></p>
		<button>전송</button>	
	</form>

</body>
</html>