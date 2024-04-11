<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <c:set var="cpath" value="${pageContext.request.contextPath }"></c:set>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
</head>
<body>
<h1>${cpath }</h1>
	<ul>
		<li><a href="${cpath }"> EX01</a></li>
		<li><a href="${cpath }/EX02"> EX02</a></li>
		<li><a href="${cpath }/board/list"> list</a></li>
		<li><a href="${cpath }/account/list"> account_list</a></li>
	</ul>
	<hr>