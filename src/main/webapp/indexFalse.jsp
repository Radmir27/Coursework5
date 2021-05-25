<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="${pageContext.request.contextPath}/style.css">
<body bgcolor="#DAD8FE" leftmargin="40">
    <div class="title"><h1>АВТОРИЗАЦИЯ</h1></div> 
    <div id="auth" class="form">
    <form action="${pageContext.request.contextPath}/JavaLogin" method="post">
        <div class="item">
            <label for="login">Логин:</label>
            <input type="text" name="login" id="login" value="${login}">
        </div>
        <div class="item">
            <label for="pass">Пароль: </label>
            <input type="password" name="pass" id="pass" value="${pass}">
        </div>
        <div class="item">
            <label for="login">Неправильно введен логин или пароль</label>
        </div>
        <div class="item">
            <input type="submit" name="sign" value="Вход">
        </div>
    </form>

</div>
</body>
</html>
