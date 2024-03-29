<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Day61-EX10.jsp</title>
</head>
<body>

	<h1>JSTL - 조건문</h1>
	<hr>

	<form>
		<p>
			<input name="name" placeholder="이름" required>
		</p>
		<p>
			<input name="age" placeholder="나이" required>
		</p>

		<button>전송</button>
	</form>

	<hr>

	<h4>결과</h4>

	<c:if test="${not empty age }">
		<c:choose>
			<c:when test="${param.age>=19 }">
				<%-- if --%>
				<p>${param.name }님은성인입니다.</p>
			</c:when>
			<c:when test="${param.age>=16}">
				<%--else if --%>
				<p>${param.name }님은고등학생입니다.</p>
			</c:when>
			<c:when test="${param.age>=13}">
				<%--else if --%>
				<p>${param.name }님은중학생 입니다.</p>
			</c:when>

			<c:otherwise>
				<%--else --%>
				<p>${param.name }님은초등학생 이하 입니다.</p>
			</c:otherwise>
		</c:choose>
	</c:if>

</body>
</html>