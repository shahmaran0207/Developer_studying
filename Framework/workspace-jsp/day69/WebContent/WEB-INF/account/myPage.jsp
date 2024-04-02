<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<main class="home">
	<%@ include file="../sideMenu.jsp"%>

	<article>
		<table class="board w70">
			<thead>
				<tr>
					<td>회원번호</td>
					<td>아이디</td>
					<td>비밀번호</td>
					<td>닉네임</td>
					<td>이메일</td>
					<td>가입일</td>
				</tr>
			</thead>

			<tbody>
				<tr>
					<td>${user.idx }</td>
					<td>${user.userid }</td>
					<td>${user.userpw.substring(0,6) }</td>
					<td>${user.nick }</td>
					<td>${user.email }</td>
					<td>${user.j_date }</td>
				</tr>
			</tbody>
		</table>
		<br> <a href="${cpath }/account/update">
			<button type="button">닉네임 / PW 수정</button>
		</a>
	</article>

</main>
</body>
</html>