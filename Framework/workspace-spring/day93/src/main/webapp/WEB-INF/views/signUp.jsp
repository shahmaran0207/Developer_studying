<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<form method="POST">
		<p><input name="userid" placeholder="아이디" required></p>
		<p><input name="userpw" type="password" placeholder="패스워드" required></p>
		<p><input name="userpw" type="password" placeholder="패스워드 확인" required></p>
		<p><input name="nick" placeholder="닉네임" required></p>
		<p><input name="email" type="email" placeholder="이메일" required></p>
		
		<button>가입</button>
	</form>

	<p class="result"></p>

	<script>
		// 패스워드 체크
		let userpw = document.getElementsByName("userpw");
		let result = document.querySelector('.result');

		userpw[1].onblur = () => {
			let msg;

			if (userpw[0].value == userpw[1].value) {
				msg = "패스워드가 일치 합니다";
			}
			else {
				msg = "패스워드가 다릅니다";
				userpw[0].value = userpw[1].value = '';
				userpw[0].focus();
			}

			result.innerHTML = msg;
		}
		
		// 아이디 중복 검사
		let userid = document.getElementsByName("userid")[0];
		let result2="중복된 아이디입니다. "
		
		userid.onblur = () => {
			let url = 'checkId?userid=' + userid.value;
			
			fetch(url, { method:'GET' })
			.then(response => response.json())
			.then(data => {
				if (data ==0) result2="사용가능한 아이디입니다."
				alert('결과 : ' + result2);
			});
		}

	</script>

</body>
</html>