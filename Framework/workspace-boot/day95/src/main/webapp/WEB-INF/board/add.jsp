<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<form method="POST">
		<table>
			<tr>
				<td><input name="title" placeholder="제목" required></td>
			</tr>
			<tr>
				<td><input name="user_idx" placeholder="계정번호" required></td>
			</tr>
			<tr>
				<td><textarea name="contents" placeholder="내용"></textarea></td>
			</tr>
		</table>
		
		<br>
		
		<button>작성</button>
	</form>

</body>
</html>