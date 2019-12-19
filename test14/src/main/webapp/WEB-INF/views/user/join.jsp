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

<P> 조인페이지입니다. </P>
 <form action="join" method="post">
 	id:<input type="text" name="uid"><br/>
 	pw:<input type="text" name="upw"><br/>
 	name:<input type="text" name="uname"><br/>
 	<input type="submit" value="가입">
 </form>
</body>
</html>
