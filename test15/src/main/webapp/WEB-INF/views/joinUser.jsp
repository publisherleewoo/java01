<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>joinUser.jsp</title>
</head>
<body>

<form action="joinUser" method="post">

<p>id: <input type="text" name="uid"></p>
<p>pw: <input type="text" name="upw"></p>
<p>name: <input type="text" name="uname"></p>
	<input type="submit" />
</form>


</body>
</html>
