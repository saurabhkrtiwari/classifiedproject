<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link href="${pageContext.request.contextPath}/static/css/test.css"	rel="stylesheet" type="text/css">
<meta charset="ISO-8859-1">
<title>Advertisement</title>
</head>
<body>

<c:forEach var="ad" items="${advertisementList}">
<p class="ad">
	${ad.id}<br>
	${ad.description}<br>
	${ad.contact.username}<br>
	${ad.contact.emailid}<br>
	${ad.contact.mobile}<br>
</p>
	<hr/>

</c:forEach>

</body>
</html>