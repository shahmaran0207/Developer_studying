<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JSTL - Attribute</h1>
	<hr>
	
	<%-- set: Attribute를 생성하는 태그 --%>
	<%-- var: Attribute 이름--%>
	<%-- value: Attribute에 저장할 데이터--%>
	<%-- scope: 저장할 영역(pageScope). 기본값은 page --%>
	
	<c:set var="p1" value="홍길동" scope="page"/>
	<c:set var="p2" value="이수진" scope="request"/>
	<c:set var="p3" value="박철수" scope="session"/>
	<c:set var="p4" value="김아영" scope="application"/>
	
	<ul>
		<li>pageContext: ${p1 }</li>
		<li>request: ${p2 }</li>
		<li>session: ${p3 }</li>
		<li>application: ${p4 }</li>
	</ul>
	
	<a href="EX07_result.jsp">
		<button>전송</button>
	</a>
	
	<br>
	
	<form>
		<input name="forward" type="hidden" value="yes">
	</form>
	
	<%-- 아래는 forward라는 파라미터가 있으면 무조건 참이 됨 --%>
	<c:if test="${not empty param.forward }">
		<jsp:forward page="EX07_result.jsp"></jsp:forward>
	</c:if>

</body>
</html>