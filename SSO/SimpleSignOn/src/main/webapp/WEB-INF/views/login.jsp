<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="zh">
	<head>
		<meta name="viewport" content="initial-scale=1.0, width=device-width, user-scalable=no" />
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge,Chrome=1" />
		<meta http-equiv="X-UA-Compatible" content="IE=8" />
		<title>欢迎登录</title>
		<link type="image/x-icon" href="images/favicon.ico" rel="shortcut icon">
		<link rel="stylesheet" href="static/css/main.css" />
	</head>
	<body>
		<div class="wrapper">
			<div class="container">
				<h1>Welcome</h1>
				<form method="post" onsubmit="return true;" class="form">
					<input type="text" value="Taotao" name="account" placeholder="Account"/>
					<input type="password" value="123456789" name="password" placeholder="Password"/>
					<button type="button" id="login-button" onclick="doLogin();">Login</button>
				</form>
			</div>
			<ul class="bg-bubbles">
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
			</ul>
		</div>
		<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-1.8.3.js" ></script>
		<script type="text/javascript">
			var redirectUrl = "${redirect}"; // 浏览器中回显的URL
			function doLogin() {
/* 				var username = "Taotao"; 
				var password = "123456789"; 
				var url = "/user/login?username="+username+"&password="+password;  
				//首先创建精灵对象  
				var xmlHttpReq = createXmlHttpRequest();  
				//指明准备状态改变时回调的函数名  
				xmlHttpReq.onreadystatechange=function(){
						    if(xmlHttpReq.readyState == 4 && xmlHttpReq.status == 200){      
						        var b = xmlHttpReq.responseText.substr(15, 9); */
						       /*  "{\"status\":200,\"msg\":\"OK\",\"data\":\"01a67633-2daa-4961-a2b6-714eb1d56850\"}" */
						      /*  if (b == "msg\":\"OK\""){      
						            alert("登录成功！"); 
						            location.href = "http://localhost:8087/index";
						        }else{      
						            alert("登录失败！");    
						            location.href = "";
						        }             					     
						  }
				};  
				xmlHttpReq.open("POST",url,true);
				//4.发送请求      
			    xmlHttpReq.send(null);  */ 
				//尝试以异步的get方式访问某个URL  
				$.post("/user/login", $(".form").serialize(),function(data){
					if (data.status == 200) {
						if (redirectUrl == "") {
							location.href = "http://localhost:8083/index";
						} else {
							location.href = redirectUrl;
						}
					} else {
						alert("登录失败，原因是：" + data.status + data.msg);
					}
				}); 
			}
/* 			//XmlHttpRequest对象      
			function createXmlHttpRequest(){      
			    if(window.ActiveXObject){ //如果是IE浏览器      
			        return new ActiveXObject("Microsoft.XMLHTTP");      
			    }else if(window.XMLHttpRequest){ //非IE浏览器      
			        return new XMLHttpRequest();      
			    }      
			}  */
       
			  

		</script>
	</body>
</html>