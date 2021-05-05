<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Калькулятор - площадь равнобедреннего треугольника</title>
</head>
<body bgcolor="#DAD8FE" leftmargin="40">
<h1>Окно авторизации</h1>
<h2>Введите логин и пароль</h2>
	<p><label for="login">Логин:</label>
    <input type="text" name="login" id="login" value="${login}"></p>
    <p><label for="password">Пароль: </label>
    <input type="text" name="password" id="password" value="${password}"></p>
    <form action="${pageContext.request.contextPath}/JavaCalc" method="post">
    	<p><input type="submit" name="sign" value="Calculate"></p>
    </form>
    </body>
</html>