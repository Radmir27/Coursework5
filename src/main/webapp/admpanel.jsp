<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
  <meta charset="utf-8" />
  <link rel="stylesheet" href="/style.css">
  <title>Админская панель</title>
 </head>
 		<body bgcolor="#DAD8FE" leftmargin="40">
              <div class="container">
              	<a href="/" class="logo">PI221GR5</a>
                <nav>
                  <ul>
                    <li><a href="${pageContext.request.contextPath}/authors.jsp">О нас</a></li>
                    <li><a href="${pageContext.request.contextPath}/Form.jsp">Калькулятор</a></li>
                  </ul>
                </nav>
              </div>
  				<div id="adm" class="form">
	  				<label for="color">Смена Цвета</label>
	    			<select id="color" name="color">
						<option ${category0} value="#D6912F">orange</option>
						<option ${category1} value="#37A1FA">Синиватый</option>
						<option ${category2} value="#DAD8FE">Бурмалиновый</option>
						</select>
						</div>
				<div class="item">
					<label for="cfg1">Изменение конфигурации</label>
					<input type="text" name="cfg1" id="cfg1" value="">
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
