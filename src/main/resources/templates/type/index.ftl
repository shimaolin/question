<#include "../common/header.ftl">
<script type="text/html" id="toolMenu">
    <a class="layui-btn layui-btn-xs" lay-event="detail">查看</a>
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
  <div class="layui-body">
      <div>
          <table id="type" lay-filter="type"></table>
      </div>
  </div>
<#include "../common/footer.ftl">
<script>
    layui.use('table', function(){
        let table = layui.table;
        table.render({
            elem: '#type'
            ,height: 500
            ,url: '/type/list' //数据接口
            ,page: true //开启分页
            ,cols: [[ //表头
                {field: 'id', title: 'ID', width:80}
                ,{field: 'pid', title: '父级ID', width:80}
                ,{field: 'type', title: '名称', width:500}
                ,{fixed: 'right', width:400, align:'center', toolbar: '#toolMenu'}
            ]]
        });

        table.on('tool(type)', function(obj){
            var data = obj.data; //获得当前行数据
            var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
            var tr = obj.tr; //获得当前行 tr 的DOM对象

            if(layEvent === 'detail'){ //查看
                //do somehing
            } else if(layEvent === 'del'){ //删除
                layer.confirm('真的删除行么', function(index){
                    obj.del(); //删除对应行（tr）的DOM结构，并更新缓存
                    layer.close(index);
                    //向服务端发送删除指令
                });
            } else if(layEvent === 'edit'){ //编辑
                //do something

                //同步更新缓存对应的值
                obj.update({
                    username: '123'
                    ,title: 'xxx'
                });
            }
        });
    });
</script>
