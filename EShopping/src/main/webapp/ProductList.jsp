<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.*" %>
<%@ page import="domain.Product" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>产品清单</title>
</head>
<link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="/js/jquery-2.1.0.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="/js/bootstrap.min.js"></script>    
<body>
    <div class="container-fluid">
    	<div class="row" align="left" >
    		<div class="col-lg-6 col-md-9 col-xs-8" style="padding-left: 50px;">
    			<img src="img/logo2.png" />
    		</div>
    		<div class="col-lg-4 hidden-xs hidden-md hidden-sm"> 
    			<img src="img/header.png"/>
    		</div>
    		<div class="col-lg-2 col-xs-4 col-md-3" style="padding-top: 20px;">
    			<a href="#">登录</a>
    			<a href="#">注册</a>
    			<a href="#">退出</a>
    		</div>
    	</div>
    
    </div>
	<div class="container-fluid" style="padding-top: 10px;">
		<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
				        <span class="sr-only">Toggle navigation</span>
				        <span class="icon-bar"></span>
				        <span class="icon-bar"></span>
				        <span class="icon-bar"></span>
				      </button>
					<a class="navbar-brand" href="#">首頁</a>
				</div>
	
				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active">
							<a href="#">家用電器 <span class="sr-only">(current)</span></a>
						</li>
						<li>
							<a href="#">珠寶玉器</a>
						</li>
						<li>
							<a href="#">運動器材</a>
						</li>
						<li>
							<a href="#">戶外活動</a>
						</li>
						<li>
							<a href="#">實用家居</a>
						</li>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">更多分類 <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li>
									<a href="#">手機數碼</a>
								</li>
								<li>
									<a href="#">床上用品</a>
								</li>
								<li>
									<a href="#">辦公用品</a>
								</li>
								<li role="separator" class="divider"></li>
								<li>
									<a href="#">書畫珍品</a>
								</li>
								<li role="separator" class="divider"></li>
								<li>
									<a href="#">電腦周邊</a>
								</li>
								<li>
									<a href="#">鞋靴箱包</a>
								</li>
							</ul>
						</li>
					</ul>
					<form class="navbar-form navbar-right">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="Search">
						</div>
						<button type="submit" class="btn btn-default">查找</button>
					</form>
				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid -->
		</nav>
	</div>
	<div class="container-fluid">
		<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
		  <!-- Indicators -->
		  <ol class="carousel-indicators">
		    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
		    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
		    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
		  </ol>
		
		  <!-- Wrapper for slides -->
		  <div class="carousel-inner" role="listbox">
		    <div class="item active">
		      <img src="img/1.jpg" alt="...">
		      <div class="carousel-caption">

		      </div>
		    </div>
		    <div class="item">
		      <img src="img/2.jpg" alt="...">
		      <div class="carousel-caption">

		      </div>
		    </div>
		    <div class="item">
		      <img src="img/3.jpg" alt="...">
		      <div class="carousel-caption">

		      </div>
		    </div>
				
		  </div>
		
		  <!-- Controls -->
		  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
		    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
		    <span class="sr-only">Previous</span>
		  </a>
		  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
		    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
		    <span class="sr-only">Next</span>
		  </a>
		</div>		
	</div>
	<div class="container-fluid">
		<div class="row" style="font-size: 22px; padding-left: 20px;">
			熱門商品&nbsp;&nbsp;&nbsp;&nbsp  <img src="img/title2.jpg"  /> 
		</div>
	
		<div class="row" >
			<div class="col-lg-2 hidden-md hidden-sm hidden-xs" >
				<img src="img/big01.jpg" />
			</div>
			<div class="col-lg-9">
				<div class="col-lg-6 hidden-md hidden-sm hidden-xs" >
					<img src="img/middle01.jpg" width="100%" />
				</div>
				<!-- 以下为jsp直接编写java代码，循环实现图片和数据库内容的输出 -->
				<%
				List<Product> productlist = (List<Product>)request.getAttribute("productlist");
				if (productlist!=null){
					for(Product product : productlist){
						out.write("<div class='col-lg-2 col-md-3 col-sm-4 col-xs-6' style='padding-top: 30px; padding-left: 40px;'>");
						out.write("<img src='"+product.getPimage()+"' height='100%' width ='100%' />");
						out.write("<a href='#'><p style='padding-left: 30px;'>"+product.getPname()+"</p></a>");
						out.write("<p style='padding-left: 30px;'>"+product.getMarket_price()+"</p>");
						out.write("</div>");
					}
				}
				request.setAttribute("Company", "testrequestscope");
				%>
				<!-- 以下未EL表达式测试，必须写在JSP文档中，无需引入其他js或类 -->
				${requestScope.Company }
				${Company }
			</div>	
		</div>
	</div>

	<div class="container-fluid">
		<img src="img/footer.jpg" class="img-responsive"/>
	</div>
	<div class="container-fluid">
		<ul class="list-inline">
			<li><a href="#">关于我们</a></li>
			<li><a href="#">联系我们</a></li>
			<li><a href="#">招贤纳士</a></li>
			<li><a href="#">法律声明</a></li>
			<li><a href="#">友情链接</a></li>
			<li><a href="#">支付方式</a></li>
			<li><a href="#">配送方式</a></li>
			<li><a href="#">服务声明</a></li>
			<li><a href="#">广告声明</a></li>
		</ul>
		<p>Copyright © 2005-2016 传智商城 版权所有</p>
	</div>
</body>
</html>