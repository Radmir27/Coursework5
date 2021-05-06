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
        
               .form {
                   display:flex;
                   justify-content: center;
                   max-width: 500px;
                   margin: auto;
                   border: 2px solid gray;
                   border-radius: 10px;
                   padding:10px;
               }
               .item input {
             	   width: 50%;
               }
        
               .form .item {
                   display:flex;
                   flex-direction:row;
                   margin: 10px;
                   align-items: flex-start;
                   width: 90%;
                   min-width: 400px;
                   justify-content: space-between;
               }
           </style>
           <!--STYLE_END-->
           <div class="title"><h1>Калькулятор расчета ОСАГО</h1></div>
           <div class="form">
           <form action="/JavaCalc" method="post">
			<div class="category">
    			<label for="category">Категория:</label>
    			<select>
					<option value="volvo">A</option>
					<option value="saab">AAB</option>
					<option value="opel">BCD</option>
					<option value="audi">CAC</option>
				</select> 
			</div>
			<div class="item">
				<label for="second">Регион: </label>
   				<input type="text" name="second" id="second" value="">
			</div>
			<div class="item">
				<label for="second">КБМ водителя: </label>
    			<input type="text" name="second" id="second" value="">
			</div>
			<div class="item">
				<label for="second">Возраст: </label>
    			<input type="text" name="second" id="second" value="">
			</div>
			<div class="item">
 				<label for="second">Стаж (лет): </label>
    			<input type="text" name="second" id="second" value="">
			</div>
			<div class="item">
				<label for="second">Мощность (л.с.): </label>
    			<input type="text" name="second" id="second" value="">
			</div>
			<div class="item">
				<label for="second">Наличие прицепа: </label>
    			<input type="radio" name="second" id="second" value="">
    			<input type="radio" name="second" id="second" value="">
			</div>
			<div class="item">
				<label for="second">Промокод: </label>
    			<input type="text" name="second" id="second" value="">
			</div>
			<div class="item">
				<label for="second">Стоимость: </label>
				<input type="text" name="second" id="second" value="">
			</div>
			<div class="item">
            	<input type="submit" name="sign" value="Calculate">
            </div>
           </form>
       </div>
        
        
	</body>

</html>