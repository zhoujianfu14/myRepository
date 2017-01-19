$(function(){
	$('#tt').tree({
	    onClick:function(node){
	    	//判断是否为根节点
	    	if($('#tt').tree('isLeaf',node.target)){
	    		if(node.text=="项目维护"){
	    			addTab(node.text,'xmwh.jsp');
	    		}
	    		if(node.text=="药品单位"){
	    			addTab(node.text,'ypdw.jsp');
	    		}
	    		if(node.text=="供应商维护"){
	    			addTab(node.text,'gyswh.jsp');
	    		}
	    		if(node.text=="药品种类维护"){
	    			addTab(node.text,'ypzlwh.jsp');
	    		}
	    		if(node.text=="药品维护"){
	    			addTab(node.text,'ypwh.jsp');
	    		}
	    		if(node.text=="门诊挂号"){
	    			addTab(node.text,'zygl.jsp');
	    		}
	    		if(node.text=="门诊退费"){
	    			addTab(node.text,'cwcx.jsp');
	    		}
	    		if(node.text=="门诊查询"){
	    			addTab(node.text,'yzcx.jsp');
	    		}
	    		if(node.text=="查询中心"){
	    			 window.location="zx.jsp";
	    		}
	    		if(node.text=="发药管理"){
	    			 window.location="zx.jsp";
	    		}
	    		if(node.text=="退药管理"){
	    			 window.location="zx.jsp";
	    		}
	    		if(node.text=="库存管理"){
	    			 window.location="zx.jsp";
	    		}
	    		if(node.text=="查询中心"){
	    			 window.location="zx.jsp";
	    		}
	    		
	    	}
	    },
	    data: [{
			text: '基础维护',
			state: 'closed',
			children: [{
				text: '项目维护'
			},{
				text: '药品单位'
			},{
				text: '供应商维护'
			},{
				text: '药品种类维护'
			},{
				text: '药品维护'
			}]
		},{
			text: '挂号管理',
			state: 'closed',
			children: [{
				text: '门诊挂号'
			},{
				text: '门诊退费'
			},{
				text: '门诊查询'
			},{
				text: '查询中心'
			}]
		},{
			text: '药局管理',
			state: 'closed',
			children: [{
				text: '发药管理'
			},{
				text: '退药管理'
			},{
				text: '库存管理'
			},{
				text: '查询中心'
			}]
		},{
			text: '系统管理',
			state: 'closed',
			children: [{
				text: '修改密码'
			},{
				text: '注销'
			}]
		}]
	});
})
//添加tab工具
function addTab(title,url){
	if($('#tabs').tabs('exists',title)){
		$('#tabs').tabs('select',title);
	}else{
		$('#tabs').tabs('add',{
			title:title,
			iconCls:'icon-save',
			closable:true,
			tools:[{
			    	   iconCls:'',
			    	   handler:function(){
			    		   $('#dg').datagrid('reload');
			    	   }
			       }],
			content:'<iframe src="'+url+'" framebroder=0 height=100% width=100% scrolling=no></iframe>'       
		});
	}
}

























