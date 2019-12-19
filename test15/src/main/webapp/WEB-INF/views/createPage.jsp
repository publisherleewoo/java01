<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>

<%
		String conPath = request.getContextPath();
%>

<form action ="<%= conPath%>/student/create" method="get">
	Name:<input type="text" name="name" value="${student.name}"> <br/>
	ID:<input type="text" name="id" value="${student.id}"> <br/>
	<input type="submit" value="submit"/>
</form>

</body>
</html>
