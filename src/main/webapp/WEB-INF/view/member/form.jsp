<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원 관리</title>
	<jsp:include page="../corestyle.jsp"></jsp:include>
</head>
<body>
<jsp:include page="../header.jsp"></jsp:include>
<h1>회원 등록</h1>

<form action="add.do" method="POST" enctype="multipart/form-data">
이름: <input type="text" name="name"><br>
전화: <input type="text" name="tel"><br>
이메일: <input type="text" name="email"><br>
암호: <input type="password" name="password"><br>
<button>등록</button>
</form>
<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>