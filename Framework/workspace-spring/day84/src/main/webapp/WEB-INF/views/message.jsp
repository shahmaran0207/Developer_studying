<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<script>
		let msg = '${msg}';
		
		alert(msg);
		location.href = '${cpath}/account/list';
	</script>

</body>
</html>