<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Day61-EX08.jsp</title>
</head>
<body>
	<h1>JSTL - 조건문</h1>
	<hr>
	
	<%-- test에 true가 작성되면 if 사이의 구문을 출력한다 --%>
	<c:if test="hello">
		<p>실행이 되나?</p>
	</c:if>
	
	<%-- 아래 2개 차이를 생각해라 --%>
	<p> 10 > 5</p>
	<p>${10 > 5 }</p>

</body>
</html>