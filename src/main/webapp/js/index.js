$(function (){
    $.ajax({
        url:'/goodAjax.do',
        // data:{
        // },
        type:"post",
        dataType:"json",
        success:function (resp){
            $.each(resp,function (i,item){
                let str="<li><a href='goodsDetails.do?goods_id="+item.goods_id+"'><img src='"+item.def_id+"'/></a><p><a href='goodsDetails.do?goods_id="+item.goods_id+"'>"+item.goods_name+"</a></p></li>"
                // let str="<li><a href='goodsDetails.do?goods_id=<%=item.goods_id%>'><img src='"+item.def_id+"'/></a><p><a href='goodsDetails.do?goods_id=<%=item.goods_id%>'>"+item.goods_name+"</a></p></li>"
                str.trim();
                $("#showImg>ul").append(str);
            })
            // console.log(resp)
        }
    })
})
