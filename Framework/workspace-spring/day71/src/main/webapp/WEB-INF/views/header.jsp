<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="cpath" value="${pageContext.request.contextPath }"></c:set>


<!DOCTYPE html>
<html>
<head>
<title>Home</title>
<style>
	.menu {
		display: flex;
		list-style: none;
		padding: 0;
	}
	
	.menu > li{
		margin: 0 10px;
	}
</style>
</head>
<body>
	<h1>Hello world!</h1>

	<ul class="menu">
		<li><a href="${cpath }">home</a></li>
		<li><a href="${cpath }/EX01">ex01</a></li>
		<li><a href="${cpath }/EX02">ex02</a></li>
		<li><a href="${cpath }/EX03">ex03</a></li>
		<li><a href="${cpath }/EX04/test1">ex04</a></li>
		<li><a href="${cpath }/EX05">ex05</a></li>
		<li><a href="${cpath }/EX05/test1">ex06</a></li>
	</ul>
	<hr>