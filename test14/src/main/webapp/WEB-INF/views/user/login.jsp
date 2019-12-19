<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P> 로그인페이지입니다. </P>
 
 <form action="filter" method="get">
 	ID: <input type="text" name="uid"/><br/>
 	PW: <input type="text" name="upw"/><br/>
 	<input type="submit">
 </form>
 
</body>
</html>
