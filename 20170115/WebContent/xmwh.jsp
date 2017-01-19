<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="common.jsp"></jsp:include> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
	$('#dg').datagrid({  
   		url:'datagrid_data.json',  
    	columns:[[  
        	{field:'code',title:'Code',width:100},  
        	{field:'name',title:'Name',width:100},  
        	{field:'price',title:'Price',width:100,align:'right'}  
    	]]  
	});  
</script>
<title>项目维护</title>
</head>
<body>
<table class="easyui-datagrid" style="width:1150px;height:450px"  
        data-options="url:'datagrid_data.json',fitColumns:true,singleSelect:true">  
    <thead>  
        <tr>  
            <th data-options="field:'xmbh',width:200">项目名称</th>  
            <th data-options="field:'zjm',width:200">助记码</th>  
            <th data-options="field:'xmmc',width:200,align:'right'">项目名称</th>
            <th data-options="field:'dj',width:200,align:'right'">单价</th>
            <th data-options="field:'cz',width:200">操作</th>  
        </tr>  
    </thead>
    <tbody>  
        <tr>  
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td><a href="">添加</a></td>  
        </tr>  
        <tr>  
            <td></td><td></td><td></td><td></td><td></td>  
        </tr>  
    </tbody>    
</table>    
</body>
</html>