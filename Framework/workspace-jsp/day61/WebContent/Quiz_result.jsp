<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
		request.setCharacterEncoding("utf-8");
	
		String age = request.getParameter("age");
		int sage=Integer.parseInt(age);
		
		String adult=(sage>=19)?"성인":"미성년자";
		
		Cookie[] cs = new Cookie[] {
			new Cookie("age", age)
		};
		
		
		for (int i = 0; i < cs.length; i++) {
			cs[i].setMaxAge(0);
			
			if (age != null) cs[i].setMaxAge(60 * 60 * 24 * 7);
			
			response.addCookie(cs[i]);
		}
	%>
	
	<h1>쿠키 발급</h1>
	<hr>
	
	<ul>
		<li>이름: ${param.name }</li>
		<li>나이: ${param.age }</li>
		<li>${param.name >=19 ? '성인':'미성년자' }</li>
	</ul>

</body>
</html>