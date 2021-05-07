<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body bgcolor="#DAD8FE" leftmargin="40">
    <!--STYLE_START-->
    <style>
        .title{
            margin: auto;
            text-align: center;
        }

        .form {
            display:flex;
            justify-content: center;
            max-width: 300px;
            margin: auto;
            border: 2px solid gray;
            border-radius: 33px;
            padding:25px;
        }

        .form .item {
            display:flex;
            flex-direction:column;
            margin: 10px;
        }
    </style>
    <!--STYLE_END-->
    <div class="title"><h1>АВТОРИЗАЦИЯ</h1></div> 
    <div class="form">
    <form action="/JavaLogin" method="post">
        <div class="item">
            <label for="login">Логин:</label>
            <input type="text" name="login" id="login" value="">
        </div>
        <div class="item">
            <label for="pass">Пароль: </label>
            <input type="password" name="pass" id="pass" value="">
        </div>
        <div class="item">
            <input type="submit" name="sign" value="Вход">
		<div class="item">
			<input type="button" value="Назад" onclick="location.herf='/From.jsp'">
        </div>
    </form>
</div>


</body>
</html>