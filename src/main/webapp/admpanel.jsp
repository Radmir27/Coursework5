<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
  <meta charset="utf-8" />
  <link rel="stylesheet" href="/style.css">
  <title>Панель администратора</title>
 </head>
 		<body bgcolor="#DAD8FE" leftmargin="40">
              <div class="container">
              	<a ref="/" class="logo">PI221GR5</a>
                <nav>
                  <ul>
                    <li><a href="${pageContext.request.contextPath}/authors.jsp">О нас</a></li>
                    <li><a href="${pageContext.request.contextPath}/index.jsp">Вход</a></li>
                    <li><a href="${pageContext.request.contextPath}/Form.jsp">Калькулятор</a></li>
                  </ul>
                </nav>
              </div>
              <div class="title"><h1>Панель администратора</h1></div>
  				<div id="adm" class="form">
  				<form action="${pageContext.request.contextPath}/JavaCity" method="post">
	  				<label for="color">Смена Цвета</label>
	    			<select id="color" name="color">
						<option value="#DAD8FE">Бурмалиновый</option>
						<option value="#D6912F">Оранжевый</option>
						<option value="#37A1FA">Синий</option>
						</select>
						</div>
				<div class="form">
					<label for="cfg1">Изменение коэффициента города Уфы:</label>
					<input type="text" name="cfg1" id="cfg1" value="${city0}">
				</div>
				<div class="form">
					<label for="cfg1">Изменение коэффициента города Воронежа:</label>
					<input type="text" name="cfg1" id="cfg1" value="${city1}">
				</div>
				<div class="form">
					<label for="cfg1">Изменение коэффициента города Омска:</label>
					<input type="text" name="cfg1" id="cfg1" value="${city2}">
				</div>
				<div class="form">
					<label for="cfg1">Изменение коэффициента города Челябинска:</label>
					<input type="text" name="cfg1" id="cfg1" value="${city3}">
				</div>
				<div class="form">
					<label for="cfg1">Изменение коэффициента города Москвы:</label>
					<input type="text" name="cfg1" id="cfg1" value="${city4}">
				</div>
				<div class="item">
            	<input type="submit" name="sign" value="Сохранить">
            </div>
				</form>
  <script type="text/javascript">
  window.onload=function(){
	  var button=document.getElementById('color');
	  var body=document.getElementsByTagName('body')[0];
	  button.onchange=function(){
	  body.style.backgroundColor=button.value;
	  };
  };
  </script>
 </body>
</html>
