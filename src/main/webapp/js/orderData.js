$(function (){
    //时间戳转换函数
    let timestampToTime=function(timestamp){
        let times=new Date(timestamp);
        return times.toLocaleDateString().replace(/\//g,"-")+" "+times.toTimeString().substr(0,8);
        // console.log(times.toLocaleDateString().replace(/\//g,"-")+" "+times.toTimeString().substr(0,8));
    }

    //查看全部详情orderAll
    $("#orderAll").click(function (){
        $("#orderList").empty();
        $.ajax({
            url:'OrderAll.do',
            data:{
            },
            type:"post",
            dataType:"json",
            success:function (resp){
                let str="";
                $.each(resp,function (i,item){
                    let time=timestampToTime(item.orders_time);
                    if(item.is_pay==0){
                        if(item.norms_text==null){
                            item.norms_text="默认规格";
                        }
                        str="<div class='orderList'><div class='orderImg'><img src='"+item.def_id+"'/></div><div class='orderText'> <p class='goodName'>"+item.goods_name+item.goods_suggest+"</p><p >"+item.norms_text+"</p> <p >"+time+"</p> </div> <div class='orderPrice'> <p>￥"+item.orders_price+"</p></div><div class='orderNum'><p>x"+item.goods_quantity+"</p></div><div class='orderDeli'><p style='color: brown;'>待支付</p></div><div class='orderUp'><a href='#' style='color: green;'>查看详情</a></div></div>";
                    }else if(item.is_pay==1 && item.is_delivery==0){
                        if(item.norms_text==null){
                            item.norms_text="默认规格";
                        }
                        str="<div class='orderList'><div class='orderImg'><img src='"+item.def_id+"'/></div><div class='orderText'> <p class='goodName'>"+item.goods_name+item.goods_suggest+"</p><p >"+item.norms_text+"</p> <p >"+time+"</p> </div> <div class='orderPrice'> <p>￥"+item.orders_price+"</p></div><div class='orderNum'><p>x"+item.goods_quantity+"</p></div><div class='orderDeli'><p style='color: goldenrod;'>待发货</p></div><div class='orderUp'><a href='#' style='color: green;'>查看详情</a></div></div>";
                    }else if(item.is_pay==1 && item.is_delivery==1){
                        if(item.norms_text==null){
                            item.norms_text="默认规格";
                        }
                        str="<div class='orderList'><div class='orderImg'><img src='"+item.def_id+"'/></div><div class='orderText'> <p class='goodName'>"+item.goods_name+item.goods_suggest+"</p><p >"+item.norms_text+"</p> <p >"+time+"</p> </div> <div class='orderPrice'> <p>￥"+item.orders_price+"</p></div><div class='orderNum'><p>x"+item.goods_quantity+"</p></div><div class='orderDeli'><p style='color: goldenrod;'>发货中</p></div><div class='orderUp'><a href='#' style='color: green;'>查看详情</a></div></div>";
                    }else if(item.is_pay==1 && item.is_delivery==2){
                        if(item.norms_text==null){
                            item.norms_text="默认规格";
                        }
                        str="<div class='orderList'><div class='orderImg'><img src='"+item.def_id+"'/></div><div class='orderText'> <p class='goodName'>"+item.goods_name+item.goods_suggest+"</p><p >"+item.norms_text+"</p> <p >"+time+"</p> </div> <div class='orderPrice'> <p>￥"+item.orders_price+"</p></div><div class='orderNum'><p>x"+item.goods_quantity+"</p></div><div class='orderDeli'><p style='color: green;'>已完成</p></div><div class='orderUp'><a href='#' style='color: green;'>查看详情</a></div></div>";
                    }
                    str.trim();
                    $("#orderList").append(str);
                })
            }
        })
    })
    //    点击查询未支付订单
    $("#orderNo").click(function (){
        $("#orderList").empty();
        $.ajax({
            url:'OrderNo.do',
            data:{
            },
            type:"post",
            dataType:"json",
            success:function (resp){
                let str="";
                $.each(resp,function (i,item){
                    let time=timestampToTime(item.orders_time);
                    if(item.norms_text==null){
                        item.norms_text="默认规格";
                    }
                    str="<div class='orderList'><div class='orderImg'><img src='"+item.def_id+"'/></div><div class='orderText'> <p class='goodName'>"+item.goods_name+item.goods_suggest+"</p><p >"+item.norms_text+"</p> <p >"+time+"</p> </div> <div class='orderPrice'> <p>￥"+item.orders_price+"</p></div><div class='orderNum'><p>x"+item.goods_quantity+"</p></div><div class='orderDeli'><p>未支付</p></div><div class='orderUp'><a href='payOrder.do?orders_number="+item.orders_number+"' style='color: green'>去支付</a>&nbsp;&nbsp;<a href='reOrders.do?orders_id="+item.orders_id+"' style='color: brown'>取消商品</a>&nbsp;&nbsp;<a href='#' style='color: goldenrod'>修改</a>&nbsp;&nbsp;</div></div>";
                    str.trim();
                    $("#orderList").append(str);
                })
            }
        })
    })
    //    点击查询未发货订单
    $("#orderGo").click(function (){
        $("#orderList").empty();
        $.ajax({
            url:'orderGo.do',
            data:{
            },
            type:"post",
            dataType:"json",
            success:function (resp){
                let str="";
                $.each(resp,function (i,item){
                    let time=timestampToTime(item.orders_time);
                    if(item.norms_text==null){
                        item.norms_text="默认规格";
                    }
                    str="<div class='orderList'><div class='orderImg'><img src='"+item.def_id+"'/></div><div class='orderText'> <p class='goodName'>"+item.goods_name+item.goods_suggest+"</p><p >"+item.norms_text+"</p> <p >"+time+"</p> </div> <div class='orderPrice'> <p>￥"+item.orders_price+"</p></div><div class='orderNum'><p>x"+item.goods_quantity+"</p></div><div class='orderDeli'><p>待发货</p></div><div class='orderUp'><a href='#' style='color: green;'>查看状态</a></div></div>";
                    str.trim();
                    $("#orderList").append(str);
                })
            }
        })
    })
    //    点击查询待收货
    $("#orderAcc").click(function (){
        $("#orderList").empty();
        $.ajax({
            url:'SelOrderAcc.do',
            data:{
            },
            type:"post",
            dataType:"json",
            success:function (resp){
                let str="";
                $.each(resp,function (i,item){
                    let time=timestampToTime(item.orders_time);
                    if(item.norms_text==null){
                        item.norms_text="默认规格";
                    }
                    str="<div class='orderList'><div class='orderImg'><img src='"+item.def_id+"'/></div><div class='orderText'> <p class='goodName'>"+item.goods_name+item.goods_suggest+"</p><p >"+item.norms_text+"</p> <p >"+time+"</p> </div> <div class='orderPrice'> <p>￥"+item.orders_price+"</p></div><div class='orderNum'><p>x"+item.goods_quantity+"</p></div><div class='orderDeli'><p>发货中</p></div><div class='orderUp'><a href='#' style='color: green;'>查看物流信息</a></div></div>";
                    str.trim();
                    $("#orderList").append(str);
                })
            }
        })
    })
    //    点击查询已完成订单
    $("#orderBef").click(function (){
        $("#orderList").empty();
        $.ajax({
            url:'SelOrderBef.do',
            data:{
            },
            type:"post",
            dataType:"json",
            success:function (resp){
                let str="";
                $.each(resp,function (i,item){
                    let time=timestampToTime(item.orders_time);
                    if(item.norms_text==null){
                        item.norms_text="默认规格";
                    }
                    str="<div class='orderList'><div class='orderImg'><img src='"+item.def_id+"'/></div><div class='orderText'> <p class='goodName'>"+item.goods_name+item.goods_suggest+"</p><p >"+item.norms_text+"</p> <p >"+time+"</p> </div> <div class='orderPrice'> <p>￥"+item.orders_price+"</p></div><div class='orderNum'><p>x"+item.goods_quantity+"</p></div><div class='orderDeli'><p>已完成</p></div><div class='orderUp'><a href='#' style='color: brown;'>请求退款</a></div></div>";
                    str.trim();
                    $("#orderList").append(str);
                })
            }
        })
    })
})