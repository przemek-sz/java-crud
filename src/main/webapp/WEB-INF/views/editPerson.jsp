<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Edit person</title>
</head>
<body>

       <form:form commandName="person" action="${pageContext.request.contextPath}/update/${person.ID}" method="GET">
		 Imię:    <form:input path="name" /><br/>
		 Nazwisko:<form:input path="lastname" /><br/>
		 Wiek:    <form:input path="age" /><br/>
		
		<input type="submit" value="Zapisz" />
	</form:form>


</body>
</html>