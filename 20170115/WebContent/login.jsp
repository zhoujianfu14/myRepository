<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="common.jsp"></jsp:include>    
<html>
<head>
<title>企业登录</title>
</head>
<body class="setting">
    
	<div class="logo"></div>
	<div class="main">
		<div class="from_bd">
		<h3 class="orange">医院管理系统<!-- 错误提示小气泡 -->
			<div id="wrong" class="littlepop" style="display:none">&nbsp;用户名或密码错误</div>
		</h3>
    
    	<form action="login.do" method="post">
    		<ul class="form_st">
       		<li><input name="username" type="text"  class="user guang" id="username"  /></li>
    		<li><input name="password" type="password"  class="password guang" id="password" value=""/></li>	
         	<li><input id="loginBtn" name="login" type="submit" class="login" /></li>
    	 </form>
		</div>
	</div>
	<div class="foot"><div class="copy">Copyright &copy; 2015 oracle(哈尔滨)培训基地 版权所有</div>
</body>
</html>