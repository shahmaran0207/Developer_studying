<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<main class="home">
	<%@ include file="../sideMenu.jsp"%>

	<form mehtod="POST">
		<p>
			<input name="userid" placeholder="ID를 입력해주세요." required>
			<input name="useremail" placeholder="email를 입력해주세요." type="email" required>
		</p>
		<button>암호 찾기</button>
	</form>

</main>
</body>
</html>