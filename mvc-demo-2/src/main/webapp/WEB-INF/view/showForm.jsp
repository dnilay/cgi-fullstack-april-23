<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student-form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
First Name: <form:input path="firstName"/><br/>
Last Name: <form:input path="lastName"/><br/>
Country:<form:select path="country">
<form:option value="Brazil" label="Brazil"/>
<form:option value="India" label="India"/>
<form:option value="USA" label="USA"/>
</form:select><br/>
Java<form:radiobutton path="favoriteLanguage" value="Java"/>
Ruby<form:radiobutton path="favoriteLanguage" value="Ruby"/>
C#<form:radiobutton path="favoriteLanguage" value="C#"/>
Python<form:radiobutton path="favoriteLanguage" value="Python"/>
<input type="submit" value="submit student">
</form:form>
</body>
</html>