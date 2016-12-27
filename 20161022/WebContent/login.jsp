<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="common.jsp"></jsp:include>    
<html>
<head>
<title>企业登录</title>
</head>
<body>
	<div class="main">
			<div id="wrong" class="littlepop" style="display:none">&nbsp;用户名或密码错误</div>
    	<form action="testLogin" method="post" name="myform">
    		<ul>
       		<li><input name="username" type="text"  class="user guang" id="username"  /></li>
    		<li><input name="password" type="password"  class="password guang" id="password" value=""/></li>	
         	<li><input id="loginBtn" name="login" type="submit" class="login" /></li>
         	</ul>
    	 </form>
	</div>
	<div><div class="copy">Copyright &copy; 2015 oracle(哈尔滨)培训基地 版权所有</div>
</body>
</html>