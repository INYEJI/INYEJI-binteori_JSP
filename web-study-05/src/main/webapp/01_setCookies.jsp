<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	//1.쿠키객체생성
	Cookie cookie = new Cookie("id","pinksung");
	//2.유효기간설정
	cookie.setMaxAge(365*24*60*60); //유효기간 0으로 설정 시 지워진다아아
	//3. 클라이언트에쿠키전송
	response.addCookie(cookie);
	//4. 쿠키를생성하여클라이언트에전송
	response.addCookie(new Cookie("pwd","test1234"));
	response.addCookie(new Cookie("age","20"));
	%>
	<h3>쿠키 설정</h3>
</body>
</html>