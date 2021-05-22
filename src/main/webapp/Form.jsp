<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Калькулятор расчета ОСАГО</title>
<link rel="stylesheet" href="/style.css">
</head>
	<body bgcolor="#DAD8FE" leftmargin="40">
                	<header>
              <div class="container">
              	<a href="/" class="logo">PI221GR5</a>
                <nav>
                  <ul>
                    <li><a href="${pageContext.request.contextPath}/index.jsp">Вход</a></li>
                    <li><a href="${pageContext.request.contextPath}/authors.jsp">О нас</a></li>
                  </ul>
                </nav>
              </div>
            </header>
           <div class="title"><h1>Калькулятор расчета ОСАГО</h1></div>
           <div id="calc" class="form">
           <form action="${pageContext.request.contextPath}/JavaCalc" method="post">
			<div class="item">
    			<label for="category">Категория:</label>
    			<select onchange="ref3()" id="category" name="category">
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
    			<select ${cbm} id="cbm" name="cbm">
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
    			<select onchange="ref1()" id="experience" name="experience">
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
    			<input onchange="ref2()" type="radio" name="pricep" ${pricep1} value="1">Да (промокод не учитывается)
    			<input onchange="ref2()" type="radio" name="pricep" ${pricep0} value="-1">Нет
			</div>
			<div class="item">
				<label for="promo">Промокод: </label>
    			<input type="text" name="promo" id="promo" ${promoog} value="${promo}">
			</div>
			<div class="item">
				<label for="price">Стоимость (руб.): </label>
				<input readonly type="text" name="price" id="price" value="${result}">
			</div>
			<div class="item">
            	<input onclick="ref4()" type="submit" name="sign" value="Расчитать">
            </div>
            </form>
            </div>
            <button onclick="generate()">Выгрузить PDF</button>
            
            <script>
            function ref1() {
              var e = document.getElementById("experience");
          	  var exp = e.options[e.selectedIndex].value;
              e = document.getElementById("cbm");
          	  if (exp === '0') {
          		document.querySelector("#cbm").value = "4";
                e.disabled = true;
          	  } else {
                e.disabled = false;
              }
            }
            </script>
            
            <script>
            function ref2() {
            	var pricep = document.querySelector('input[name="pricep"]:checked').value;
            	var e = document.getElementById("promo");
        	    if (pricep === '1') {
        	    	e.disabled = true;
        	    } else {
        	    	e.disabled = false;
        	    	e = document.getElementById("category").value;
        	    	if (e === "4" || e === "5") {
        	    		document.querySelector("#category").value = "0";
        	    	}
        	    }
            }
            </script>
            
            <script>
            function ref3() {
            	var e = document.getElementById("category");
            	var category = e.options[e.selectedIndex].value;
                e = document.getElementById("pricep");
            	  if (category === '4' || category === '5') {
            		  document.querySelector('input[value="1"]').checked = true;
            	  }
            }
            </script>
            
            <script>
            function ref4() {
            	document.getElementById("cbm").disabled = false;
            	document.getElementById("promo").disabled = false;
            }
            </script>
            

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
	  
	    switch(category){
	      case "0" :
	    	  category = "A, M Motorcycles, mopeds and light quads";
	    	  break;
	      case "1" :
	    	  category = "B, BE individuals, sole proprietors";
	    	  break;
	      case "2" :
	    	  category = "B, BE legal entities";
	    	  break;
	      case "3" :
	    	  category = "B, BE used as a cab";
	    	  break;
	      case "4" :
	    	  category = "C, CE with permissible maximum weight of 16 tons or less";
	    	  break;
	      case "5" :
	    	  category = "C, CE with a permissible maximum mass exceeding 16 tonnes";
	    	  break;
	      case "6" :
	    	  category = "D, DE with up to and including 16 passenger seats";
	    	  break;
	      case "7" :
	    	  category = "D, DE with more than 16 passenger seats";
	    	  break;
	      case "8" :
	    	  category = "D, DE used on scheduled transport services";
	    	  break;
	      case "9" :
	    	  category = "Tb Trolleybuses";
	    	  break;
	      case "10" :
	    	  category = "Tm Trams";
	    	  break;
	      case "11" :
	    	  category = "Tractors, self-propelled road-building and other machines";
	    	  break;
	     }
	  
	  e = document.getElementById("city");
	  var city = e.options[e.selectedIndex].value;
	  
	    switch(city){
          case "0" :
    	    city = "Ufa";
    	    break;
          case "1" :
    	    city = "Voronezh";
    	    break;
          case "2" :
    	    city = "Omsk";
    	    break;
          case "3" :
    	    city = "Chelyabinsk";
    	    break;
          case "4" :
    	    city= "Moscow";
    	    break;
    	  }
	  
	  e = document.getElementById("cbm");
	  var cbm = e.options[e.selectedIndex].value;
	  
	    switch(cbm){
          case "0" :
    	    cbm = "M";
    	    break;
          case "1" :
    	    cbm = "0";
    	    break;
          case "2" :
    	    cbm = "1";
    	    break;
          case "3" :
    	    cbm = "2";
    	    break;
          case "4" :
      	    cbm = "3";
            break;
          case "5" :
    	    cbm = "4";
    	    break;
          case "6" :
    	    cbm = "5";
    	    break;
          case "7" :
    	    cbm = "6";
    	    break;
          case "8" :
    	    cbm = "7";
    	    break;
          case "9" :
    	    cbm = "8";
    	    break;
          case "10" :
       	    cbm = "9";
            break;
          case "11" :
    	    cbm = "10";
    	    break;
          case "12" :
    	    cbm = "11";
    	    break;
          case "13" :
    	    cbm = "12";
    	    break;
          case "14" :
    	    cbm = "13";
    	    break;
	      }
	  
	  e = document.getElementById("age");
	  var age = e.options[e.selectedIndex].value;
	  
	    switch(age){
          case "0" :
    	    age = "16 - 21";
    	    break;
          case "1" :
    	    age = "22 - 24";
    	    break;
          case "2" :
    	    age = "25 - 29";
    	    break;
          case "3" :
    	    age = "30 - 34";
    	    break;
          case "4" :
    	    age = "35 - 39";
    	    break;
          case "5" :
    	    age = "40 - 49";
    	    break;
          case "6" :
    	    age = "50 - 59";
    	    break;
          case "7" :
    	    age = "over 59";
    	    break;
	     }
	  
	  e = document.getElementById("experience");
	  var experience = e.options[e.selectedIndex].value;
	  
	    switch(experience){
          case "0" :
  	        experience = "0";
  	        break;
          case "1" :
  	        experience = "1";
  	        break;
          case "2" :
  	        experience = "2";
  	        break;
          case "3" :
  	        experience = "3 - 4";
  	        break;
          case "4" :
  	        experience = "5 - 6";
  	        break;
          case "5" :
  	        experience = "7 - 9";
  	        break;
          case "6" :
  	        experience = "10 - 14";
  	        break;
          case "7" :
  	        experience = "over 14";
  	        break;
	      }
	  e = document.getElementById("cm");
	  var cm = e.options[e.selectedIndex].value;
	  
	    switch(cm){
          case "0" :
	        cm = "from 50";
	        break;
          case "1" :
	        cm = "51 to 70";
	        break;
          case "2" :
	        cm = "71 to 100";
	        break;
          case "3" :
	        cm = "101 to 120";
	        break;
          case "4" :
	        cm = "121 to 150";
	        break;
          case "5" :
	        cm = "up to 151";
	        break;
	    }
	  
	  var pricep = document.querySelector('input[name="pricep"]:checked').value;
	    switch(pricep){
          case "1" :
            pricep = "Yes";
            break;
          case "-1" :
            pricep = "No";
            break;
	    }
	  
	  var promo = document.getElementById("promo").value;
	  
	  var price = document.getElementById("price").value;
	  
        doc.autoTable(
                ['Parameter names', 'Selected parameters'],
                [
                ['Category', category],
                ['City', city],
                ['CBM', cbm],
                ['Age', age + " years"],
                ['Experience', experience + " years"],
                ['Power', cm + " horsepower"],
                ['Trailer', pricep],
                ['Promo', promo],
                ['Result', price + " rubles"],
                ],
              )
		doc.save("OSAGO.pdf");
    }
</script>
        
	</body>

</html>
