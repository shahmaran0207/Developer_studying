<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>

<h4>FileFolder 목록</h4>

<form class=EX02upload method="POST" enctype="multipart/form-data">		<!-- 길이 제한 때문에 파일 전송은 무조건  POST 형식, GET형식은 길이 제한이 있음 -->
	<input name="upload" type="file">
	<button>전송</button>
</form>

<table class="board">
		<tr>
			<th>파일명</th>
			<th>크기</th>
			<th>경로</th>
		</tr>
	<c:forEach var="file" items="${dir }">
		<tr>
			<td><a href="${cpath}/fileTest/${file.name }" download>${file.name }</a></td>
			<td>${file.length() } byte</td>
			<td>${file.path }</td>
		</tr>
	</c:forEach>
</table>



</body>
</html>