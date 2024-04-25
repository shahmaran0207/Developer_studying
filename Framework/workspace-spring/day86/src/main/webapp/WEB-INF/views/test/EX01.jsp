<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<form method="POST" enctype="multipart/form-data">		<!-- 길이 제한 때문에 파일 전송은 무조건  POST 형식, GET형식은 길이 제한이 있음 -->
	<p><input name="memo" placeholder="memo"></p>
	<p><input name="upload" type="file"></p>
	
	<button>전송</button>
	
</form>

</body>
</html>