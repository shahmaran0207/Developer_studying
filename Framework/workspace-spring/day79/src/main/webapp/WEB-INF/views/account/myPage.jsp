<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file='../header.jsp' %>

	<table>
		<tr>
			<th>회원번호</th>
			<td>${user.idx }</td>
		</tr>
		<tr>
			<th>아이디</th>
			<td>${user.userid }</td>
		</tr>
		<tr>
			<th>패스워드</th>
			<td>${user.userpw }</td>
		</tr>
		<tr>
			<th>닉네임</th>
			<td>${user.nick }</td>
		</tr>
		<tr>
			<th>가입일자</th>
			<td>${user.j_date }</td>
		</tr>
	</table>
	
	<a href="${cpath }/account/logOut">
		<button>로그아웃</button>
	</a>
	<a href="${cpath }/account/logOut">
		<button>로그아웃</button>
	</a>
	<a href="${cpath }/account/logOut">
		<button>로그아웃</button>
	</a>

</body>
</html>