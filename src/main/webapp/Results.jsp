<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Результат расчета площади равнобедреннего треугольника</title>
</head>
<body bgcolor="#DAD8FE" leftmargin="40">
<h1>Результат расчета площади равнобедреннего треугольника</h1>
<h2>Ваши введеные данные:</h2>
<p><strong>Основание треугольника:</strong> ${first_result}</p>
<p><strong>Высота треугольника:</strong> ${second_result}</p>
<p><strong>Результат:</strong> ${result}</p>

<form action="${pageContext.request.contextPath}/Form.jsp">
    <input type="submit" name="sign" value="Назад">
    </form>

</body>
</html>