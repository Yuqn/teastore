$(function (){
    //时间戳转换函数
    let timestampToTime=function(timestamp){
        let times=new Date(timestamp);
        return times.toLocaleDateString().replace(/\//g,"-")+" "+times.toTimeString().substr(0,8);
        // console.log(times.toLocaleDateString().replace(/\//g,"-")+" "+times.toTimeString().substr(0,8));
    }
    $.ajax({
        url:'selOrderBefAndAf.do',
        data:{
        },
        type:"post",
        dataType:"json",
        success:function (resp){
            let str="";
            $("#orderLi").empty();
            $.each(resp,function (i,item){
                let time=timestampToTime(item.orders_time);
                if (item.norms_text==null){
                    item.norms_text="默认";
                }
                str="<div class='orderLi'><div class='orderLiTop'><div class='orderLiOne'><div class='orderNumber'>订单号:"+item.orders_number+"</div><div class='expressNumber'>快递单号:暂无，请先发货</div><div class='ordersTime'>下单时间:"+time+"</div></div><div class='orderLiTwo'><div>收件人:"+item.oradd_name+"</div><div>电话:"+item.oradd_phone+"</div></div><div class='orderLiThree'><div>商品名称:"+item.goods_name+"</div><div>规格:"+item.norms_text+"</div></div><div class='orderLiFour'><div>价格:￥"+item.orders_price+"</div><div>数量:x"+item.goods_quantity+"</div></div><div class='orderLiFive'><a href='#'>点击发货</a></div></div><div class='orderLiBottom'>收货地址:"+item.oradd_area+item.oradd_minute+"</div></div>";
                str.trim();
                $("#orderLi").append(str);
            })
        }
    })
    $("#goSousuo").click(function (){
        $.ajax({
            url:'selOrderBefAndAfNum.do',
            data:{"orders_number":$("#orderInp").val()
            },
            type:"post",
            dataType:"json",
            success:function (resp){
                let str="";
                $("#orderLi").empty();
                $.each(resp,function (i,item){
                    let time=timestampToTime(item.orders_time);
                    if (item.norms_text==null){
                        item.norms_text="默认";
                    }
                    str="<div class='orderLi'><div class='orderLiTop'><div class='orderLiOne'><div class='orderNumber'>订单号:"+item.orders_number+"</div><div class='expressNumber'>快递单号:暂无，请先发货</div><div class='ordersTime'>下单时间:"+time+"</div></div><div class='orderLiTwo'><div>收件人:"+item.oradd_name+"</div><div>电话:"+item.oradd_phone+"</div></div><div class='orderLiThree'><div>商品名称:"+item.goods_name+"</div><div>规格:"+item.norms_text+"</div></div><div class='orderLiFour'><div>价格:￥"+item.orders_price+"</div><div>数量:x"+item.goods_quantity+"</div></div><div class='orderLiFive'><a href='#'>点击发货</a></div></div><div class='orderLiBottom'>收货地址:"+item.oradd_area+item.oradd_minute+"</div></div>";
                    str.trim();
                    $("#orderLi").append(str);
                })
            }
        })
    })
})