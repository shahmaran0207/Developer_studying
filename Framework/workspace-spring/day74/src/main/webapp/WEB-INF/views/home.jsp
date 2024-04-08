<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>

<table class="board">
	<thead>
		<tr>
			<th>글 번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>조회수</th>
			<th>작성일</th>
			<th>수정</th>
			<th>삭제</th>
		</tr>
	</thead>

	<tbody>
		<c:forEach var="row" items="${list }">
			<tr>
				<td>${row.idx }</td>
				<td><a href="${cpath }/board/view/${row.idx}">${row.title }</a></td>
				<td>${row.nick }</td>
				<td>${row.v_count }</td>
				<td>${row.w_date }</td>
				<td><a href="${cpath }/board/update/${row.idx}">수정</a></td>
				<td><a href="${cpath }/board/delete/${row.idx}">삭제</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<ul class="menu">
	<c:forEach var="i" begin="1" end="10">
		<li><a href="${cpath }/${i}">${i}</a></li>
	</c:forEach>
</ul>


</body>
</html>