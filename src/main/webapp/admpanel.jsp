<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
  <meta charset="utf-8" />
  <title>Админская панель</title>
 </head>
 <body>
			 <style>
               .title{
                 margin: auto;
                 text-align: center;
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
                    <li><a href="">О калькуляторе</a></li>
                    <li><a href="">О нас</a></li>
                    <li><a href="">Калькулятор</a></li>
                  </ul>
                </nav>
              </div>
 			 <form action="UploadDownloadFileConfServlet" enctype="multipart/form-data" method="post">
					<p>Загрузить новые коэффициенты на сервер</p>
   					<p><input type="file" name="config" requered accept="*.pdf/*.txt">
  				<input type="submit" value="Отправить"></p>
	</form>
			<form action="UploadDownloadFileAdminServlet" enctype="multipart/form-data" method="post">
   					<p>Загрузить новые логины с паролем для входа администратором</p>
   					<p><input type="file" name="arch" requered accept="*.pdf/*.txt">
				<input type="submit" value="Отправить"></p>
  </form>
 </body>
</html>