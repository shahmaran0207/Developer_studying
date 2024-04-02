<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<main class="home">
	<%@ include file="../sideMenu.jsp"%>

	<article>
		<form method="POST">
			<p>
				<input name="nick" placeholder="nick" required>
			</p>
			<p>
				<input name="userpw" type="password" placeholder="PW" required>
			</p>
			<p>
				<input name="email" type="email" placeholder="email" required>
			</p>
			<p>
				<input name="idx" placeholder="idx" required>
			</p>
			<button>변경</button>
		</form>
	</article>
           
</main>
</body>
</html>