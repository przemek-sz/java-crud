<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>CRUD</title>
</head>
<body>
<h1>Witaj co chcesz zrobić?</h1>


<a href="addPerson">Dodaj osobę</a><br>
<a href="addPerson">Zaktualizuj dane osoby</a><br>
<a href="addPerson">Znajdź osobę</a><br>
<a href="addPerson">Usuń osobę</a><br>
${persona.name}


<c:forEach items="${lista}" var="lis">
${lis.ID}
${lis.name}
${lis.lastname}
${lis.age}<br>
</c:forEach>

${persona.name}

</body>
</html>