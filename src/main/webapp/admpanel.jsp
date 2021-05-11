<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
  <meta charset="utf-8" />
  <title>Админская панель</title>
 </head>
 		<body bgcolor="#DAD8FE" leftmargin="40">
			 <style>
               .title{
                 margin: auto;
                 text-align: center;
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
                    <li><a href="/authors.jsp">О нас</a></li>
                    <li><a href="/Form.jsp">Калькулятор</a></li>
                  </ul>
                </nav>
              </div>
 			 <form action="UploadDownloadFileConfServlet" enctype="multipart/form-data" method="post">
					<p>Загрузить новые коэффициенты на сервер</p>
   					<p><input type="file" name="config" requered accept="*.pdf/*.txt">
  				<input type="submit" value="Отправить"></p>
  </form>
 </body>
</html>