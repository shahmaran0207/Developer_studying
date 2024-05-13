<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<h4>Board 테이블</h4>
	
	<table>
		<tr>
			<th>계정번호</th>
			<th>제목</th>
			<th>내용</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
		
		<c:forEach var="row" items="${list }">
		<tr>
			<td>${row.idx }</td>
			<td>${row.title }</td>
			<td>${row.contents }</td>
			<td>${row.user_idx }</td>
			<td>${row.w_date }</td>
			<td>${row.v_count }</td>
		</tr>
		</c:forEach>
	</table>
	
</body>
</html>