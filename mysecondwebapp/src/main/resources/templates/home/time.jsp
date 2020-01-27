<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <spring:url value="/survey/save" var="saveURL"></spring:url>
<form:form action="${saveURL}" method="POST" modelAttribute="surveyForm">
//other stuffs
<form:input type="datetime-local" path="startDateTime" />
</form:form>
</body>
</html> --%>