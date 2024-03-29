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
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		
		//파라미터가 없으면 null이 저장된다.
		if(num1==null || num2==null){
			num1=num2="0";
		}
		
		//null을 정수로 변환하면 예외 발생
		int n1=Integer.parseInt(num1);
		int n2=Integer.parseInt(num2);
	%>

	<h1>parameter 결과</h1>
	<hr>

	<ul>
		<li>두 수의 합: <%=n1+n2%></li>
	</ul>

</body>
</html>