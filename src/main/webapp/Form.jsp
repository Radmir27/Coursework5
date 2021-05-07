<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Калькулятор расчета ОСАГО</title>
</head>

	<body bgcolor="#DAD8FE" leftmargin="40">
           <!--STYLE_START-->
           <style>
               .title{
                   margin: auto;
                   text-align: center;
               }
               select {
    				width: 325px; /* Ширина списка в пикселах */
   				}
        
               .form {
                   display:flex;
                   justify-content: center;
                   max-width: 600px;
                   margin: auto;
                   border: 2px solid gray;
                   border-radius: 10=0px;
                   padding:10px;
               }
               .item input {
             	   width: 40%;
               }
        
               .form .item {
                   display:flex;
                   flex-direction:row;
                   margin: 10px;
                   align-items: flex-start;
                   width: 100%;
                   justify-content: space-between;
               }
               nav {
                   float: right;
               }
               nav ul {
                 margin: 0;
                 padding: 0;
                 list-style: none;
               }
               nav li {
                 display: inline-block;
               }
               .container:after {
                 content: "";
                 display: table;
                 clear: both;
               }
               .container {
                 width: 100%;
                 max-width: 1024px;
                 padding: 15px;
                 margin: 0 auto;
               }
           </style>
           <!--STYLE_END-->
                       <header>
              <div class="container">
                <nav>
                  <ul>
                    <li><a href="/Authorization.jsp">Вход</a></li>
                    <li><a href="">О нас</a></li>
                    <li><a href="xxx.pdf" download>Выгрузить PDF</a></li>
                  </ul>
                </nav>
              </div>
            </header>
           <div class="title"><h1>Калькулятор расчета ОСАГО</h1></div>
           <div class="form">
           <form action="/JavaCalc" method="post">
			<div class="item">
    			<label for="category">Категория:</label>
    			<select id="category" name="category">
					<option value="0">А, М Мотоциклы, мопеды и легкие квадрициклы</option>
					<option value="1">B, BE физических лиц, индивидуальных предпринимателей</option>
					<option value="2">В, ВЕ юридических лиц</option>
					<option value="3">B, BE используемые в качестве такси</option>
					<option value="4">C, CE с разрешенной максимальной массой 16 тонн и менее</option>
					<option value="5">C, CE с разрешенной максимальной массой более 16 тонн</option>
					<option value="6">D, DE с числом пассажирских мест до 16 включительно</option>
					<option value="7">D, DE с числом пассажирских мест более 16</option>
					<option value="8">D, DE используемые на регулярных перевозках</option>
					<option value="9">Tb Троллейбусы</option>
					<option value="10">Tm Трамваи</option>
					<option value="11">Тракторы, самоходные дорожно-строительные и иные машины</option>
				</select> 
			</div>
			<div class="item">
				<label for="city">Регион: </label>
   				<select id="city" name="city">
					<option value="0">Уфа</option>
					<option value="1">Воронеж</option>
					<option value="2">Омск</option>
					<option value="3">Челябинск</option>
					<option value="4">Москва</option>
				</select>
			</div>
			<div class="item">
				<label for="cbm">КБМ водителя: </label>
    			<select id="cbm" name="cbm">
					<option value="0">M</option>
					<option value="1">0</option>
					<option value="2">1</option>
					<option value="3">2</option>
					<option value="4">3</option>
					<option value="5">4</option>
					<option value="6">5</option>
					<option value="7">6</option>
					<option value="8">7</option>
					<option value="9">8</option>
					<option value="10">9</option>
					<option value="11">10</option>
					<option value="12">11</option>
					<option value="13">12</option>
					<option value="14">13</option>
				</select> 
			</div>
			<div class="item">
				<label for="age">Возраст: </label>
    			<select id="age" name="age">
					<option value="0">16 - 21</option>
					<option value="1">22 - 24</option>
					<option value="2">25 - 29</option>
					<option value="3">30 - 34</option>
					<option value="4">35 - 39</option>
					<option value="5">40 - 49</option>
					<option value="6">50 - 59</option>
					<option value="7">старше 59</option>
				</select>
			</div>
			<div class="item">
 				<label for="experience">Стаж (лет): </label>
    			<select id="experience" name="experience">
					<option value="0">0</option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3 - 4</option>
					<option value="4">5 - 6</option>
					<option value="5">7 - 9</option>
					<option value="6">10 - 14</option>
					<option value="7">более 14</option>
				</select>
			</div>
			<div class="item">
				<label for="cm">Мощность (л.с.): </label>
    			<select id="cm" name="cm">
					<option value="0">До 50</option>
					<option value="1">От 51 до 70</option>
					<option value="2">От 71 до 100</option>
					<option value="3">От 101 до 120</option>
					<option value="4">От 121 до 150</option>
					<option value="5">От 151</option>
				</select>
			</div>
			<div class="item">
				<label for="pricep">Наличие прицепа: </label>
    			<input type="radio" name="pricep" value="1">Да (промокод не учитывается)
    			<input checked type="radio" name="pricep" value="-1">Нет
			</div>
			<div class="item">
				<label for="promo">Промокод: </label>
    			<input type="text" name="promo" value="">
			</div>
			<div class="item">
				<label for="price">Стоимость: </label>
				<input readonly type="text" name="price" id="price" value="${result}">
			</div>
			<div class="item">
            	<input type="submit" name="sign" value="Расчитать">
            </div>
           </form>
       </div>
        
        
	</body>

</html>
