<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>報名成功</title>
</head>
<body>
	<H1>註冊成功</H1>
    <label>姓名:</label> 
	<br><%= request.getParameter("name") %><br>
    <label>畢業學校:</label>
    <br><%= request.getParameter("school") %><br>
	<label>畢業科系:</label>
	<br><%= request.getParameter("subject") %><br>                         
	<label>性別:</label>
	<br><%= request.getParameter("gender")%><br>
	<label>交通工具:</label> 
	<% String[] transportation = request.getParameterValues("transportation"); %>
	<br>
	<% for(String x: transportation) {%>
	<label><%= x %></label>
	<% } %>
	
</body>
</html>