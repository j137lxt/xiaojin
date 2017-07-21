<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
<meta charset="UTF-8">
<title>机构</title>
<link rel="stylesheet" type="text/css"
	href="../static/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="../static/themes/icon.css">
<script type="text/javascript" src="../static/js/jquery.min.js"></script>
<script type="text/javascript" src="../static/js/jquery.easyui.min.js"></script>
<script type="text/javascript" src="../static/js/jquery.json-2.4.js"></script>
</head>
<body>
	<button id="add" class="easyui-linkbutton" onclick="addchild(0)">新增</button>
	<br />
	<div style="width: 1000px">
		<table id="orgList"></table>
	</div>
	<div id="addframe" class="easyui-panel" title="添加或删除机构"   
        style="width:500px;height:150px;padding:10px;background:#fafafa;" top="150" left="150"  data-options="closed:true,closable:true,style:{position:'absolute',left:150,top:150}">
        
上级机构：<input type="text" id="grandOrg"/>
机构名称：<input type="text" id="orgName"/><br>
机构编码：<input type="text" id="orgCode"/>
状态：<input type="text" id="state"/><br>
排序：<input type="text" id="sort"/>
备注：<input type="text" id="remark"/><br>
        <button id="addOrg" onclick="addOrg()">添加</button>
        <button id="updateOrg" onclick="updateOrg()">修改</button>
        <button id="cancle">取消</button>
        </div>
        
       <div class="easyui-panel" style="width: 1000px">
		<div id="page" class="easyui-pagination" data-options="total:0"></div>
	</div>
</body>
</html>
<script>
$(function(){
	$.ajax({
		type: 'POST',
		url:'organization/findOrgNum',
		dataType: "json",
		success:function(data){
		$("#page").pagination({total:data.tolPoint})
		}
	})
})

    $('#orgList').datagrid({
        url:'organization/findAll',
        
        columns:[[
            {field:'orgName',title:'机构名称',width:100},
            {field:'orgCode',title:'机构编码',width:150},
            {field:'grandOrg',title:'上级机构',width:100},
            {field:'sort',title:'排序',width:100},
            {field:'state',title:'状态',width:100},
            {field:'remark',title:'备注',width:180},
            {field:'operate',title:'操作',align:'center' ,width:$(this).width()*0.1,
                formatter:function(value, row, index){
                    var str = '<a href="javascript:void(0)" onclick="addchild('+row.id+')" class="easyui-linkbutton" >添加下级</a>&nbsp;<a href="javascript:void(0)" onclick="update('+row.id+')" class="easyui-linkbutton" >修改</a>&nbsp;<a href="javascript:void(0)" onclick="deleteOrg('+row.id+')" class="easyui-linkbutton" >删除</a>';
                    return str;
                }
            },
        ]]
    })
	function addchild(id){
    	$("#addframe").panel("open");
    	$("#addOrg").show();
    	$("#updateOrg").hide();
    }
    function update(id){
    	$("#addframe").panel("open");
    	$("#addOrg").hide();
    	$("#updateOrg").show();
    }
    function deleteOrg(id){
    	$("#page").pagination('options').pageNumber;//分页插件的当前页数
    } 
    function addOrg(){
    	var Org={id:"",grandOrg:$("#grandOrg").val(),orgName:$("#orgName").val(),orgCode:$("#orgCode").val(),state:$("#state").val(),sort:$("#sort").val(),remark:$("#remark").val()}
		var json=$.toJSON(Org);
    	$.ajax({
			type:'Post',
			data:json,
			contentType:"application/json",
			url:"organization/addOrg",
			success:function(data){
				alert("成功");
			}
		})
    
    }
    function updateOrg(){
    	
    }
</script>