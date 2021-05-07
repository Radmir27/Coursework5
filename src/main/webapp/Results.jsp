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
            padding:5px;
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
    <form action="/JavaCalc" method="post">
        <div class="item">
            <label for="first">Логин:</label>
            <input type="text" name="first" id="first" value="">
        </div>
        <div class="item">
            <label for="second">Пароль: </label>
            <input type="password" name="second" id="second" value="">
        </div>
        <div class="item">
            <input type="submit" name="sign" value="Вход">
        </div>
    </form>
</div>


</body>
</html>