<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="common.jsp"></jsp:include> 
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/tree.js"></script>
		<title>医院管理系统</title> 
	</head>
    <body class="easyui-layout">  
        <div data-options="region:'north',title:'North Title',split:true" style="height:50px;">
                        医院管理系统
        </div>  
        <div data-options="region:'west',title:'主菜单',split:true" style="width:200px;">
           <ul id="tt"></ul>
        </div>  
        <div data-options="region:'center',title:'详细信息'" style="padding:5px;background:#eee;">
            <div id="tabs" class="easyui-tabs" style="width:1150px;height:490px;">
            </div> 
        </div>  
    </body> 
</html>