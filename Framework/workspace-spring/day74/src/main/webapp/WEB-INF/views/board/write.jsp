<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>

<form method="POST">
	<p><input name="title" value="${row.title }" placeholder="제목" type="text"></p>
	<p><textarea name="contents"  rows="30" cols="30">${row.contents }</textarea></p>
	<p><input name="user_idx" placeholder="작성 idx"></p>
	
	<button>작성</button>
</form>

</body>
</html>