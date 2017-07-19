<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="../static/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../static/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="../static/themes/demo.css">
    <script type="text/javascript" src="../static/js/jquery.min.js"></script>
    <script type="text/javascript" src="../static/js/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="../static/js/jquery.easyui.mobile.js"></script>
</head>
<style type="text/css">
    *{
        padding: 0;
        margin: 0;
    }
    .shou{
        float: left;]
        margin-left: 40px;
        margin-top: 30px;
    }
    .shou2{
        float: left;
        margin-left: 120px;
        margin-top: 30px;
    }
    input{
        width: 120px;
    }
    label{
        display:inline;
    }
    .tou{
        background-color: #09b4c2;
        height: 60px;
    }
    .tou2{
        background-color: #09b4c2;
        height: 60px;
    }
    .sh{
        float: left;
        margin-left: 160px;
        margin-top: 15px;

    }
    .sh a{
        margin-left: 30px;
    }
    .sh1{
        float: left;
        margin-left: 270px;
        margin-top: 15px;
    }
</style>
<body>
<div>
   <div class="tou">
         <div class="shou"><label>产品类型</label><select id="cc" class="shou easyui-combobox" name="dept" style="width:120px;">
             <option value="aa">商户</option>
             <option>门店</option>
             <option>菜单</option>
         </select>  </div>
       <div class="shou"><label>产品编号</label><input class="easyui-textbox" style="width:120px;height:25px"></div>
       <div class="shou"><label>产品名称</label><input class="easyui-textbox" style="width:120px;height:25px"></div>
       <div class="shou"><label>审批状态</label><select id="cc1" class="shou easyui-combobox" name="dept" style="width:120px;">
           <option value="aa">通过</option>
           <option>未通过</option>
       </select> </div>
       <div class="shou2">
           <a href="#" class="easyui-linkbutton" data-options="toggle:true,group:'g1'">查询</a>
           <a href="#" class="easyui-linkbutton" data-options="toggle:true,group:'g1'">导出Excel</a></div>
   </div>

    <div class="tou2">

        <div class="sh">
            <span>共有<span>5</span>记录,每页<span>1</span>条，当前1/6页</span>
        </div>
        <div class="sh">
            <a href="#" class="easyui-linkbutton" data-options="toggle:true,group:'g1'">首页</a>
            <a href="#" class="easyui-linkbutton" data-options="toggle:true,group:'g1'">上页</a>
            <a href="#" class="easyui-linkbutton" data-options="toggle:true,group:'g1'">下页</a>
            <a href="#" class="easyui-linkbutton" data-options="toggle:true,group:'g1'">末页</a>
        </div>
        <div class="sh1">
    <span>跳转到<input type="text" style="width: 30px">页</span>
            <a href="#" class="easyui-linkbutton" data-options="toggle:true,group:'g1'">跳转至</a>
        </div>

    </div>



</div>
<table id="dg"></table>
</body>
</html>
<script >
    $(function(){

        $('#dg').datagrid({
            url:'datagrid_data.json',
            columns:[[
                {field:'code',title:'代码',width:100},
                {field:'name',title:'名称',width:100},
                {field:'code',title:'代码',width:100},
                {field:'name',title:'名称',width:100},
                {field:'code',title:'代码',width:100},
                {field:'name',title:'名称',width:100},
                {field:'code',title:'代码',width:100},
                {field:'name',title:'名称',width:100},
                {field:'price',title:'价格',width:100,align:'right'}
            ]]
        });


    })

</script>