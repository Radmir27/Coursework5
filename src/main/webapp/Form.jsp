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
               .logo {
               		float: left;
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
               nav a {
               	text-decoration: none;
               	line-height: 38px;
               }
           </style>
           <!--STYLE_END-->
                       <header>
              <div class="container">
              	<a href="/" class="logo">PI221GR5</a>
                <nav>
                  <ul>
                    <li><a href="${pageContext.request.contextPath}/Authorization.jsp">Вход</a></li>
                    <li><a href="${pageContext.request.contextPath}/authors.jsp">О нас</a></li>
                  </ul>
                </nav>
              </div>
            </header>
           <div class="title"><h1>Калькулятор расчета ОСАГО</h1></div>
           <div class="form">
           <form action="${pageContext.request.contextPath}/JavaCalc" method="post">
			<div class="item">
    			<label for="category">Категория:</label>
    			<select id="category" name="category">
					<option ${category0} value="0">А, М Мотоциклы, мопеды и легкие квадрициклы</option>
					<option ${category1} value="1">B, BE физических лиц, индивидуальных предпринимателей</option>
					<option ${category2} value="2">В, ВЕ юридических лиц</option>
					<option ${category3} value="3">B, BE используемые в качестве такси</option>
					<option ${category4} value="4">C, CE с разрешенной максимальной массой 16 тонн и менее</option>
					<option ${category5} value="5">C, CE с разрешенной максимальной массой более 16 тонн</option>
					<option ${category6} value="6">D, DE с числом пассажирских мест до 16 включительно</option>
					<option ${category7} value="7">D, DE с числом пассажирских мест более 16</option>
					<option ${category8} value="8">D, DE используемые на регулярных перевозках</option>
					<option ${category9} value="9">Tb Троллейбусы</option>
					<option ${category10} value="10">Tm Трамваи</option>
					<option ${category11} value="11">Тракторы, самоходные дорожно-строительные и иные машины</option>
				</select> 
			</div>
			<div class="item">
				<label for="city">Регион: </label>
   				<select id="city" name="city">
					<option ${city0} value="0">Уфа</option>
					<option ${city1} value="1">Воронеж</option>
					<option ${city2} value="2">Омск</option>
					<option ${city3} value="3">Челябинск</option>
					<option ${city4} value="4">Москва</option>
				</select>
			</div>
			<div class="item">
				<label for="cbm">КБМ водителя: </label>
    			<select id="cbm" name="cbm">
					<option ${cbm0} value="0">M</option>
					<option ${cbm1} value="1">0</option>
					<option ${cbm2} value="2">1</option>
					<option ${cbm3} value="3">2</option>
					<option ${cbm4} value="4">3</option>
					<option ${cbm5} value="5">4</option>
					<option ${cbm6} value="6">5</option>
					<option ${cbm7} value="7">6</option>
					<option ${cbm8} value="8">7</option>
					<option ${cbm9} value="9">8</option>
					<option ${cbm10} value="10">9</option>
					<option ${cbm11} value="11">10</option>
					<option ${cbm12} value="12">11</option>
					<option ${cbm13} value="13">12</option>
					<option ${cbm14} value="14">13</option>
				</select> 
			</div>
			<div class="item">
				<label for="age">Возраст: </label>
    			<select id="age" name="age">
					<option ${age0} value="0">16 - 21</option>
					<option ${age1} value="1">22 - 24</option>
					<option ${age2} value="2">25 - 29</option>
					<option ${age3} value="3">30 - 34</option>
					<option ${age4} value="4">35 - 39</option>
					<option ${age5} value="5">40 - 49</option>
					<option ${age6} value="6">50 - 59</option>
					<option ${age7} value="7">старше 59</option>
				</select>
			</div>
			<div class="item">
 				<label for="experience">Стаж (лет): </label>
    			<select id="experience" name="experience">
					<option ${experience0} value="0">0</option>
					<option ${experience1} value="1">1</option>
					<option ${experience2} value="2">2</option>
					<option ${experience3} value="3">3 - 4</option>
					<option ${experience4} value="4">5 - 6</option>
					<option ${experience5} value="5">7 - 9</option>
					<option ${experience6} value="6">10 - 14</option>
					<option ${experience7} value="7">более 14</option>
				</select>
			</div>
			<div class="item">
				<label for="cm">Мощность (л.с.): </label>
    			<select id="cm" name="cm">
					<option ${cm0} value="0">До 50</option>
					<option ${cm1} value="1">От 51 до 70</option>
					<option ${cm2} value="2">От 71 до 100</option>
					<option ${cm3} value="3">От 101 до 120</option>
					<option ${cm4} value="4">От 121 до 150</option>
					<option ${cm5} value="5">От 151</option>
				</select>
			</div>
			<div class="item">
				<label for="pricep">Наличие прицепа: </label>
    			<input type="radio" name="pricep" ${pricep1} required value="1">Да (промокод не учитывается)
    			<input type="radio" name="pricep" ${pricep0} value="-1">Нет
			</div>
			<div class="item">
				<label for="promo">Промокод: </label>
    			<input type="text" name="promo" id="promo" value="${promo}">
			</div>
			<div class="item">
				<label for="price">Стоимость (руб.): </label>
				<input readonly type="text" name="price" id="price" value="${result}">
			</div>
			<div class="item">
            	<input type="submit" name="sign" value="Расчитать">
            </div>
            </form>
            </div>
            <button onclick="generate()">Выгрузить PDF</button>
            
            

<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.3.2/jspdf.debug.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jspdf-autotable/2.3.5/jspdf.plugin.autotable.js"></script>

<script>
 function generate() {
      var doc = new jsPDF('p', 'pt');
      doc.setFont('Courier');
      var e;
      //doc.text(0, 10, 'hello');
      
      e = document.getElementById("category");
	  var category = e.options[e.selectedIndex].value;
	  
	    switch(e){
	      case 0 :
	    	  var category = "A, M Motorcycles, mopeds and light quads";
	    	  break;
	      case 1 :
	    	  var category = "B, BE individuals, sole proprietors";
	    	  break;
	      case 2 :
	    	  var category = "B, BE legal entities";
	    	  break;
	      case 3 :
	    	  var category = "B, BE used as a cab";
	    	  break;
	      case 4 :
	    	  var category = "C, CE with permissible maximum weight of 16 tons or less";
	    	  break;
	      case 5 :
	    	  var category = "C, CE with a permissible maximum mass exceeding 16 tonnes";
	    	  break;
	      case 6 :
	    	  var category = "D, DE with up to and including 16 passenger seats";
	    	  break;
	      case 7 :
	    	  var category = "D, DE with more than 16 passenger seats";
	    	  break;
	      case 8 :
	    	  var category = "D, DE used on scheduled transport services";
	    	  break;
	      case 9 :
	    	  var category = "Tb Trolleybuses";
	    	  break;
	      case 10 :
	    	  var category = "Tm Trams";
	    	  break;
	      case 11 :
	    	  var category = "Tractors, self-propelled road-building and other machines";
	    	  break;
	     }
	  
	  e = document.getElementById("city");
	  var city = e.options[e.selectedIndex].value;
	  
	    switch(e){
          case 0 :
    	    var city = "Ufa ";
    	    break;
          case 1 :
    	    var city = "Voronezh";
    	    break;
          case 2 :
    	    var city = "Omsk";
    	    break;
          case 3 :
    	    var city = "Chelyabinsk";
    	    break;
          case 4 :
    	    var city= "Moscow";
    	    break;
    	  }
	  
	  e = document.getElementById("cbm");
	  var cbm = e.options[e.selectedIndex].value;
	  
	    switch(e){
          case 0 :
    	    var cbm = "M";
    	    break;
          case 1 :
    	    var cbm = "0";
    	    break;
          case 2 :
    	    var cbm = "1";
    	    break;
          case 3 :
    	    var cbm = "2";
    	    break;
          case 4 :
      	    var cbm = "3";
            break;
          case 5 :
    	    var cbm = "4";
    	    break;
          case 6 :
    	    var cbm = "5";
    	    break;
          case 7 :
    	    var cbm = "6";
    	    break;
         case 8 :
    	    var cbm = "7";
    	    break;
          case 9 :
    	    var cbm = "8";
    	    break;
          case 10 :
       	    var cbm = "9";
            break;
          case 11 :
    	    var cbm = "10";
    	    break;
          case 12 :
    	    var cbm = "11";
    	    break;
          case 13 :
    	    var cbm = "12";
    	    break;
          case 14 :
    	    var cbm = "13";
    	    break;
	      }
	  
	  e = document.getElementById("age");
	  var age = e.options[e.selectedIndex].value;
	  
	    switch(e){
          case 0 :
    	    var age = "16 - 21";
    	    break;
          case 1 :
    	    var age = "22 - 24";
    	    break;
          case 2 :
    	    var age = "25 - 29";
    	    break;
          case 3 :
    	    var age = "30 - 34";
    	    break;
          case 4 :
    	    var age = "35 - 39";
    	    break;
          case 5 :
    	    var age = "40 - 49";
    	    break;
          case 6 :
    	    var age = "50 - 59";
    	    break;
         case 7 :
    	    var age = "over 59";
    	    break;
	     }
	  
	  e = document.getElementById("experience");
	  var experience = e.options[e.selectedIndex].value;
	  
	    switch(e){
          case 0 :
  	        var experience = "0";
  	        break;
          case 1 :
  	        var experience = "1";
  	        break;
          case 2 :
  	        var experience = "2";
  	        break;
          case 3 :
  	        var experience = "3 - 4";
  	        break;
          case 4 :
  	        var experience = "5 - 6";
  	        break;
          case 5 :
  	        var experience = "7 - 9";
  	        break;
          case 6 :
  	        var experience = "10 - 14";
  	        break;
          case 7 :
  	        var experience = "over 14";
  	        break;
	      }
	  e = document.getElementById("cm");
	  var cm = e.options[e.selectedIndex].value;
	  
	    switch(e){
          case 0 :
	        var cm = "from 50";
	        break;
          case 1 :
	        var cm = "51 to 70";
	        break;
          case 2 :
	        var cm = "71 to 100";
	        break;
          case 3 :
	        var cm = "101 to 120";
	        break;
          case 4 :
	        var cm = "121 to 150";
	        break;
          case 5 :
	        var cm = "up to 151";
	        break;
	    }
	  
	  e = document.getElementById("pricep);
	  var pricep = e.options[e.selectedIndex].value;
	  
	    switch(e){
          case 0 :
            var cm = "Yes";
            break;
          case 1 :
            ar cm = "No";
            break;
	    }
	  
	  e = document.getElementById("promo");
	  var promo = e.options[e.selectedIndex].text;
	  
	  e = document.getElementById("price");
	  var prise = e.options[e.selectedIndex].text;
	  
	  

        doc.autoTable(
                ['Parameter names', 'Selected parameters'],
                [
                ['Category', category],
                ['City', city],
                ['CBM', cbm],
                ['Age', age],
                ['Experience', experience],
                ['Power', cm],
                ['Pricep', pricep],
                ['Promocode', promo],
                ['Summ', prise],
                ],
              )
		doc.save("OSAGO.pdf");
    }
</script>
        
	</body>

</html>
