/**
 * Created by Administrator on 17-5-26.
 */

$(function(){

    $('#one').dialog({
          title:"登录对话框",
          width:400,
          height:200,
         collapsible:true,
          minimizable:true,
          maximizable:true,
          resizable:true,
          toolbar:[{
              text:'编辑',
              iconCls:'icon-search',
              handler:function(){
                  alert('我被点击了');
              } }
          ],
        buttons:[
            {
                text:"保存",
                iconCls:"icon-save",
                iconAlign:"right",
                width:100,
                handler:function(){
                    alert("保存");
                }


            },
            {
                text:"取消",
                iconCls:"icon-cancel"
            }
        ]
    });


});