<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 
  
  
	<table border="1" cellpadding="10" cellspacing="0">
	<tr>
		<td>번호</td>
		<td>이름</td>
	  	
	 	<td>날짜</td>
		<td>하트</td>	
	</tr>
	
	<c:forEach items="${list}" var="dto">
		<tr>
			<td>${dto.bId}</td>
			<td>${dto.bName}</td>
		 
			<td>${dto.bDate}</td>
			<td>${dto.bHit}</td>
		</tr>
	</c:forEach>
	<tr>
		<td colspan="4">
			<a href="write_view">글작성</a>
		</td>
	</tr>
	</table>

</body>
</html>