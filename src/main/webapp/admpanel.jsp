<%@ page language="java" contentType="text/html; Windows-1251; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
  <meta charset="utf-8" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/style.css">
  <title>Панель администратора</title>
 </head>
 		<body bgcolor="#DAD8FE" leftmargin="40">
              <div class="container">
              	<a href="/" class="logo">PI221GR5</a>
                <nav>
                  <ul>
                    <li><a href="${pageContext.request.contextPath}/authors.jsp">О нас</a></li>
                    <li><a href="${pageContext.request.contextPath}/index.jsp">Вход</a></li>
                    <li><a href="${pageContext.request.contextPath}/Form.jsp">Калькулятор</a></li>
                  </ul>
                </nav>
              </div>
              <div class="title"><h1>Панель администратора</h1></div>
					<form action="${pageContext.request.contextPath}/JavaCity" method="post">
				<div class="form">
					<label for="city0">Изменение коэффициента города Уфы:</label>
					<input type="text" name="city0" id="city0" value="${city0}">
				</div>
				<div class="form">
					<label ${labe01} for="labe0">Коэффициент города успешно изменен!</label>
					<label ${labe0} for="labe0">Коэффициент города не изменился.</label>
				</div>
				<div class="form">
					<label for="city1">Изменение коэффициента города Воронежа:</label>
					<input type="text" name="city1" id="city1" value="${city1}">
				</div>
				<div class="form">
					<label ${labe11} for="labe1">Коэффициент города успешно изменен!</label>
					<label ${labe1} for="labe1">Коэффициент города не изменился.</label>
				</div>
				<div class="form">
					<label for="city2">Изменение коэффициента города Омска:</label>
					<input type="text" name="city2" id="city2" value="${city2}">
				</div>
				<div class="form">
					<label ${labe21} for="labe2">Коэффициент города успешно изменен!</label>
					<label ${labe2} for="labe2">Коэффициент города не изменился.</label>
				</div>
				<div class="form">
					<label for="city3">Изменение коэффициента города Челябинска:</label>
					<input type="text" name="city3" id="city3" value="${city3}">
				</div>
				<div class="form">
					<label ${labe31} for="labe3">Коэффициент города успешно изменен!</label>
					<label ${labe3} for="labe3">Коэффициент города не изменился.</label>
				</div>
				<div class="form">
					<label for="city4">Изменение коэффициента города Москвы:</label>
					<input type="text" name="city4" id="city4" value="${city4}">
				</div>
				<div class="form">
					<label ${labe41} for="labe4">Коэффициент города успешно изменен!</label>
					<label ${labe4} for="labe4">Коэффициент города не изменился.</label>
				</div>
				<div class="item">
            	<input type="submit" name="sign" value="Сохранить">
            </div>
				</form>
 </body>
</html>