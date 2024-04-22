<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	
	<table class="board">
		<thead>
		<tr>
			<th>No</th>
			<th>제목</th>
			<th>작성자</th>
			<th>조회수</th>
			<th>작성일</th>
			<th>삭제</th>
			<th>수정</th>
		</tr>
		</thead>
		
		<tbody>
			<c:forEach var="row" items="${list }">
			<tr>
				<td>${row.idx }</td>
				<td>${row.title }</td>
				<td>${row.nick }</td>
				<td>${row.v_count }</td>
				<td>
					<f:formatDate 
						pattern="yyyy년 MM월 dd일 HH:mm:ss" 
						value="${row.w_date }"/>
				</td>
				<td><a href="">수정</a></td>
				<td><a>삭제</a></td>
			</tr>	
			</c:forEach>
		</tbody>
	</table>
	
</body>
</html>