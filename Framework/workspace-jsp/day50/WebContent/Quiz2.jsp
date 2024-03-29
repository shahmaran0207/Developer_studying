<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quiz2</title>
</head>
<body>
	<h1>Quiz2</h1>
	<hr>
	<ul>
		<li>quiz2.jsp: 두 정수를 입력받아 quiz2_result.jsp로 전송</li>
		<li>quiz2_result.jsp: 전달받은 두 정수의 합계 출력</li>
	</ul>
	
	<form action="quiz2_result.jsp">
		<p><input type="number" name="num1" placeholder="숫자1"></p>
		<p><input type="number" name="num2" placeholder="숫자2"></p>
		<button>아몰랑</button>
	</form>

</body>
</html>