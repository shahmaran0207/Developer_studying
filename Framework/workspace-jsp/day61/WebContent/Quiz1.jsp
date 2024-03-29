<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Day61-Quiz1.jsp</title>
</head>
<body>
	<h1>Quiz1</h1>
	<hr>
	
	<ul>
		<li>Quiz_result.jsp에 이름 / 나이를 전송</li>
		<li>결과 페이지에 성인 / 미성년자 판별하여 출력</li>
		<li>결과는 쿠키로 저장 및 발급</li>
	</ul>
	
		<%
		Cookie[] cs = request.getCookies();
		String age, msg;
	
		msg  = age = " ";
	
		if (cs != null) {
			for (int i = 0; i < cs.length; i++) {
				switch (cs[i].getName()) {
				case "age":
					age = cs[i].getValue();
					break;
				}
			}
		}
		int adult=Integer.parseInt(age);
		
		if(adult <= 19) msg+="미성년자 입니다.";
		else msg+="성인 입니다.";
	%>

	<p> 결과 = <%=msg%></p>


	<form action="Quiz_result.jsp">
		<input name="age" type="number">
		<button>전송</button>
	</form>

</body>
</html>