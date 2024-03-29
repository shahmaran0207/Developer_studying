<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Quiz2</h1>
	<hr>
	
	<ul>
		<li>사용자에게 구구단을 입력받아 현재 페이지에 출력</li>
		<li>JSTL / EL 을 최대한 활용</li>
	</ul>
	
		<h1>JSTL - 조건문</h1>
	<hr>

	<form>
		<p>
			<input name="num" type="number" placeholder="숫자" required>
		</p>

		<button>전송</button>
	</form>

	<hr>

	<h4>결과</h4>

<c:if test="${not empty param.num }">
	<c:forEach var="i" begin="1" end="9">
		<p> ${param.num } X ${i }  = ${param.num*i } </p>
	</c:forEach>
</c:if>

</body>
</html>