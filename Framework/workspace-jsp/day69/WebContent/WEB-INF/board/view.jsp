<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<main class="home">
	<%@ include file="../sideMenu.jsp"%>

	<article>
		<p>${row.idx }</p>
		<p>${row.title }</p>
		<p>${row.nick }</p>
		<p>${row.v_count }</p>
		<p>${row.w_date }</p>
	</article>

</main>
</body>
</html>