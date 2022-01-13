$(function (){
    let goodsName="";
    let goodsList=null;

    //    绑定数据goodsDetails.do
    bindData=function (goodsList){
        $.each(goodsList,function (i,item){
            let str="<div class='goodLi'><div class='goodsImg'><a href='goodsDetails.do?goods_id="+item.goods_id+"'><img src='"+item.def_id+"'/></a></div><a href='goodsDetails.do?goods_id="+item.goods_id+"' class='price'>"+item.goods_price+"</a><a href='goodsDetails.do?goods_id="+item.goods_id+"' class='name'>"+item.goods_suggest+"</a></div>";
            str.trim();
            $("#goodsList").append(str);
        })
    }
    //类型查询商品
    goSousuo=function(goodsType){
        console.log(goodsType)
        $.ajax({
            url:'/goodpriceDivType.do',
            data:{"goods_type":goodsType
            },
            type:"get",
            dataType:"json",
            success:function (resp){
                goodsList=resp;
                $("#goodsList").empty();
                bindData(resp);
            }
        })
    }
    //名称商品列表
    $("#selgooddiv").click(function (){
        goodsName=$("#selgoodinp").val();
        $.ajax({
            url:'/goodpriceDiv.do',
            data:{"goods_name":goodsName
            },
            type:"get",
            dataType:"json",
            success:function (resp){
                goodsList=resp;
                $("#goodsList").empty();
                bindData(resp);
            }
        })
    })

    //价格区间
    $("#goodpriceDiv").click(function(){
        console.log($("#minPri").val)
        console.log($("#maxPri").val)
        console.log(goodsList);
        if($("#minPri").val!=null && $("#minPri").val!=null && goodsList!=null){
            $("#goodsList").empty();
            let str="";
            $.each(goodsList,function (i,item){
                if(item.goods_price>=$("#minPri").val && item.goods_price<=$("#maxPri").val ){
                    str+="<div class='goodLi'><div class='goodsImg'><a href='goodsDetails.do?goods_id="+item.goods_id+"'><img src='"+item.def_id+"'/></a></div><a href='goodsDetails.do?goods_id="+item.goods_id+"' class='price'>"+item.goods_price+"</a><a href='goodsDetails.do?goods_id="+item.goods_id+"' class='name'>"+item.goods_suggest+"</a></div>";
                }
            })
            str.trim();
            $("#goodsList").append(str);
        }
    })



})