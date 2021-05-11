<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Результат расчета ОСАГО</title>
</head>
<body>
<h1>Результат расчета ОСАГО</h1>
<h2>Ваши введеные данные:</h2>
<p><strong>Категория:</strong> ${category_result}</p>
<p><strong>Регион:</strong> ${city_result}</p>
<p><strong>КБМ водителя:</strong> ${cbm_result}</p>
<p><strong>Возраст:</strong> ${age_result}</p>
<p><strong>Стаж (лет):</strong> ${experience_result}</p>
<p><strong>Мощность (л.с.):</strong> ${cm_result}</p>
<p><strong>Наличие прицепа:</strong> ${pricep_result}</p>
<p><strong>Промокод:</strong> ${promo_result}</p>
<p><strong>Стоимость:</strong> ${result}</p>

<form action="${pageContext.request.contextPath}/Form.jsp">
    <input type="submit" name="sign" value="Назад">
    </form>

</body>
</html>