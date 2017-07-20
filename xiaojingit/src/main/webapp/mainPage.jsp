<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>机构</title>
    <link rel="stylesheet" type="text/css"
          href="../static/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css"
          href="../static/themes/icon.css">
    <script type="text/javascript"
            src="../static/js/jquery.min.js"></script>
    <script type="text/javascript"
            src="../static/js/jquery.easyui.min.js"></script>
</head>
<body>
<button id="add">新增</button>
<br/>
<table id="orgList"></table>
</body>
</html>
<script>
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
                    var str = '<a href="javascript:void(0)" name="addchild" class="easyui-linkbutton" ></a><a href="javascript:void(0)" name="update" class="easyui-linkbutton" ></a><a href="javascript:void(0)" name="delete" class="easyui-linkbutton" ></a>';
                    return str;
                },
                onLoadSuccess:function(data){
                    $("a[name='addchild']").linkbutton({text:'下订单',plain:true,iconCls:'icon-add'});
                }
            },

        ]]
    })

</script>