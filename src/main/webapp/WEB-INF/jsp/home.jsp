<html>
<head>
<title>Hello Java EE</title>
</head>
<body>
	
	
	
<strong>User Name </strong>: ${user.name} <br>
<strong>Gender </strong> : ${user.gender}<br>
<strong>Email </strong> : ${user.email}<br>
<strong>Language </strong> : <c:forEach var="val" items="${user.language}">
 <c:out value="${val}"></c:out>
 </c:forEach><br>
<strong>Country </strong>: ${user.country} <br> 

	
	
	
</body>
</html>