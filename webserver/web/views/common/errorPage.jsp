<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%							// 무조건 object이기 때문에 형변환 해야 함 / parameter X
	String message = (String)request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body { text-align:center; }
	div { height:30px; width:100px; background:#ddd; }
</style>
</head>
<body>
	<h1 align="center"><%= message %></h1>
	<button onclick="goHome();" align="center">메인으로 돌아가기</button>
	
	<script>
		function goHome(){
			location.href="index.jsp";
		}
	</script>
</body>
</html>