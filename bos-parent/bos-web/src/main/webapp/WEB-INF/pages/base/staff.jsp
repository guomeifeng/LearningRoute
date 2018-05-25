<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- 导入jquery核心类库 -->
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<!-- 导入easyui类库 -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/js/easyui/themes/icon.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/js/easyui/ext/portal.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/css/default.css">	
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/easyui/ext/jquery.portal.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/easyui/ext/jquery.cookie.js"></script>
<script
	src="${pageContext.request.contextPath }/js/easyui/locale/easyui-lang-zh_CN.js"
	type="text/javascript"></script>
<script type="text/javascript">
	function doAdd(){
		//alert("增加...");
		$('#addStaffWindow').window("open");
	}
	
	function doView(){
		alert("查看...");
	}
	
	function doDelete(){
		
 		var rows = $('#grid').datagrid("getSelections");//JSON
 		if (rows.length == 0){
 			$.messager.alert("提示","请选择要删除的条目！","warning");
 		}else{
 			$.messager.confirm("确认","请确认是否要执行删除！",function(r){
 				if(r){
 			 		var arr = new Array();
 			 		
 			 		for(var i=0;i<rows.length;i++){
			 			arr.push(rows[i].id);
 					}
 					var ids = arr.join(",")
 					location.href = "staffAction_deleteByBatch.action?ids="+ids;
 					/* $.post("staffAction_deleteByBatch.action",{"ids":ids},function(data){
 						alert("data");
 					}); */ 
 				}
 			});
 		}

		
	}
	
	function doRestore(){
 		var rows = $('#grid').datagrid("getSelections");//JSON
 		if (rows.length == 0){
 			$.messager.alert("提示","请选择要还原的条目！","warning");
 		}else{
 			$.messager.confirm("确认","请确认是否要执行还原！",function(r){
 				if(r){
 			 		var arr = new Array();
 			 		
 			 		for(var i=0;i<rows.length;i++){
			 			arr.push(rows[i].id);
 					}
 					var ids = arr.join(",")
 					location.href = "staffAction_restoreByBatch.action?ids="+ids;
 					/* $.post("staffAction_deleteByBatch.action",{"ids":ids},function(data){
 						alert("data");
 					}); */ 
 				}
 			});
 		}

		
	}
	//工具栏
	var toolbar = [ {
		id : 'button-view',	
		text : '查询',
		iconCls : 'icon-search',
		handler : doView
	}, {
		id : 'button-add',
		text : '增加',
		iconCls : 'icon-add',
		handler : doAdd
	}, {
		id : 'button-delete',
		text : '删除',
		iconCls : 'icon-cancel',
		handler : doDelete
	},{
		id : 'button-save',
		text : '还原',
		iconCls : 'icon-save',
		handler : doRestore
	}];
	// 定义列
	var columns = [ [ {
		field : 'id',
		checkbox : true,
	},{
		field : 'name',
		title : '姓名',
		width : 120,
		align : 'center'
	}, {
		field : 'telephone',
		title : '手机号',
		width : 120,
		align : 'center'
	}, {
		field : 'haspda',
		title : '是否有PDA',
		width : 120,
		align : 'center',
		formatter : function(data,row, index){
			if(data=="X"){
				return "有";
			}else{
				return "无";
			}
		}
	}, {
		field : 'deltag',
		title : '是否删除',
		width : 120,
		align : 'center',
		formatter : function(data,row, index){
			if(data=="X"){
				return "已删除"
			}else{
				return "正常";
			}
		}
	}, {
		field : 'standard',
		title : '取派标准',
		width : 120,
		align : 'center'
	}, {
		field : 'station',
		title : '所谓单位',
		width : 200,
		align : 'center'
	} ] ];
	
	$(function(){
		// 先将body隐藏，再显示，不会出现页面刷新效果
		$("body").css({visibility:"visible"});
		
		// 取派员信息表格
		$('#grid').datagrid( {
			iconCls : 'icon-forward',
			fit : true,
			border : false,
			rownumbers : true,
			striped : true,
			pageList: [30,50,100],
			pagination : true,
			toolbar : toolbar,
			url : "staffAction_pageQuery.action",
			idField : 'id',
			columns : columns,
			onDblClickRow : doDblClickRow
		});
		
		// 添加取派员窗口
		$('#addStaffWindow').window({
	        title: '添加取派员',
	        width: 400,
	        modal: true,
	        shadow: true,
	        closed: true,
	        height: 400,
	        resizable:false
	    });
		// 修改取派员窗口
		$('#editStaffWindow').window({
	        title: '修改取派员',
	        width: 400,
	        modal: true,
	        shadow: true,
	        closed: true,
	        height: 400,
	        resizable:false
	    });
	});

	function doDblClickRow(rowIndex, rowData){
		$('#editStaffWindow').window("open");
		$('#editStaff').form("load",rowData);
	}
</script>	
</head>
<body class="easyui-layout" style="visibility:hidden;">
	<div region="center" border="false">
    	<table id="grid"></table>
	</div>
	<div class="easyui-window" title="对收派员进行添加或者修改" id="addStaffWindow" collapsible="false" minimizable="false" maximizable="false" style="top:20px;left:200px">
		<div region="north" style="height:31px;overflow:hidden;" split="false" border="false" >
			<div class="datagrid-toolbar">
				<a id="save" icon="icon-save" href="#" class="easyui-linkbutton" plain="true">保存</a>
			</div>
		</div>
		
		<div region="center" style="overflow:auto;padding:5px;" border="false">
			<form id="addStaff" action="staffAction_addStaff" method="post">
				<table class="table-edit" width="80%" align="center">
					<tr class="title">
						<td colspan="2">收派员信息</td>
					</tr>
					<!-- TODO 这里完善收派员添加 table -->
					<tr>
						<td>姓名</td>
						<td><input type="text" name="name" class="easyui-validatebox" required="true"/></td>
					</tr>
					<tr>
						<td>手机</td>
						<td>
							<script type="text/javascript">
							$(function(){
								var reg=/^[1][3,4,5,7,8][0-9]{9}$/;  
								$.extend($.fn.validatebox.defaults.rules, { 
									telephone: { 
										validator: function(value,param){ 
										return reg.test(value);
									}, 
										message: '手机号输入有误！' 
									}
									}); 
								$("#save").click(function(){
									var v =  $("#addStaff").form("validate");
									if (v){
										$("#addStaff").submit();
									}
								});
							
								});
							</script>
						
						<input type="text" data-options="validType:'telephone'" name="telephone" class="easyui-validatebox" required="true"/></td>
				
						
					</tr>
					<tr>
						<td>单位</td>
						<td><input type="text" name="station" class="easyui-validatebox" required="true"/></td>
					</tr>
					<tr>
						<td colspan="2">
						<input type="checkbox" name="haspda" value="X" />
						是否有PDA</td>
					</tr>
					<tr>
						<td>取派标准</td>
						<td>
							<input type="text" name="standard" class="easyui-validatebox" required="true"/>  
						</td>
					</tr>
					</table>
			</form>
		</div>
	</div>
	<div class="easyui-window" title="对收派员进行添加或者修改" id="editStaffWindow" collapsible="false" minimizable="false" maximizable="false" style="top:20px;left:200px">
		<div region="north" style="height:31px;overflow:hidden;" split="false" border="false" >
			<div class="datagrid-toolbar">
				<a id="edit" icon="icon-edit" href="#" class="easyui-linkbutton" plain="true">保存</a>
			</div>
		</div>
		<!-- 收派员修改窗口 -->
		<div region="center" style="overflow:auto;padding:5px;" border="false">
			<form id="editStaff" action="staffAction_editStaff" method="post">
				<table class="table-edit" width="80%" align="center">
					<tr class="title">
						<td colspan="2">收派员信息</td>
					</tr>
					<!-- TODO 这里完善收派员添加 table -->
					<tr>
						<td><input type="hidden" name="id" /></td>
					<tr>
						<td>姓名</td>
						<td><input type="text" name="name" class="easyui-validatebox" required="true"/></td>
					</tr>
					<tr>
						<td>手机</td>
						<td>
							<script type="text/javascript">
							$(function(){
								var reg=/^[1][3,4,5,7,8][0-9]{9}$/;  
								$.extend($.fn.validatebox.defaults.rules, { 
									telephone: { 
										validator: function(value,param){ 
										return reg.test(value);
									}, 
										message: '手机号输入有误！' 
									}
									}); 
								$("#edit").click(function(){
									var v =  $("#editStaff").form("validate");
									if (v){
										$("#editStaff").submit();
									}
								});
							
								});
							</script>
						
						<input type="text" data-options="validType:'telephone'" name="telephone" class="easyui-validatebox" required="true"/></td>
				
						
					</tr>
					<tr>
						<td>单位</td>
						<td><input type="text" name="station" class="easyui-validatebox" required="true"/></td>
					</tr>
					<tr>
						<td colspan="2">
						<input type="checkbox" name="haspda" value="X" />
						是否有PDA</td>
					</tr>
					<tr>
						<td>取派标准</td>
						<td>
							<input type="text" name="standard" class="easyui-validatebox" required="true"/>  
						</td>
					</tr>
					</table>
			</form>
		</div>
	</div>	
</body>
</html>	