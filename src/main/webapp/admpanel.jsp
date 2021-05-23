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
	  				<label for="color">Смена Цвета</label>
	    			<select id="color" name="color">
						<option value="#DAD8FE">Бурмалиновый</option>
						<option value="#D6912F">Оранжевый</option>
						<option value="#37A1FA">Синиватый</option>
						</select>
						</div>
				<div id="adm" class="form">
					<label for="cfg1">Изменение коэффициента промокода</label>
					<input type="text" name="cfg1" id="cfg1">
				</div>
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
