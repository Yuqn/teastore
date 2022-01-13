$(function (){
    hideLi=function (){
        $("#one").hide();
        $("#two").hide();
        $("#three").hide();
        $("#four").hide();
        $("#five").hide();
        $("#seven").hide();
    }
    hideLi();
    $("#oneLi").click(function (){
        hideLi();
        $("#one").show();
        $("#ListDate").empty();
    })
    $("#twoLi").click(function (){
        hideLi();
        $("#two").show();
        $("#ListDate").empty();
    })
    $("#threeLi").click(function (){
        hideLi();
        $("#three").show();
        $("#ListDate").empty();
    })
    $("#fourLi").click(function (){
        hideLi();
        $("#four").show();
        $("#ListDate").empty();
    })
    $("#fiveLi").click(function (){
        hideLi();
        $("#five").show();
        $("#ListDate").empty();
    })
    $("#sevenLi").click(function (){
        hideLi();
        $("#seven").show();
        $("#ListDate").empty();
    })
    // 商家点击查询全部商品
    $("#selGoodSel").click(function (){
        $.ajax({
            url:'/admGoodsSel.do',
            data:{
            },
            type:"post",
            dataType:"json",
            success:function (resp){
                let str="";
                let stat="";
                $("#ListDate").empty();
                $.each(resp,function (i,item){
                    if(item.is_ground==0){stat="下架中"}else {stat="上架中"}
                    str="<div class='goodsLi'><div class='imgDiv'><img src='"+item.def_id+"'></div><div class='nameDiv'><p class='goodNam'>"+item.goods_name+item.goods_suggest+"</p><p>"+item.type_name+"</p></div><div class='priDiv'><p>￥"+item.goods_price+"</p></div><div class='statDiv'>"+stat+"</div><div class='rem'><a href='admRemGood.do?goods_id="+item.goods_id+"'>点击删除</a></div></div>";
                    $("#ListDate").append(str);
                })
            }
        })
    })
    // 商家点击查询上架中的商品
    $("#selGoodGro").click(function (){
        $.ajax({
            url:'/selGoodGro.do',
            data:{
            },
            type:"post",
            dataType:"json",
            success:function (resp){
                $("#ListDate").empty();
                let str="<form action='admDownGo.do' method='post' id='downForm'><input type='submit' value='一键下架' id='downGo'></form>";
                $("#ListDate").append(str);
                $.each(resp,function (i,item){
                    str="<div class='goodsLi'><input name='goods_id' type='checkbox' class='checkBox' value='"+item.goods_id+"'><div class='imgDiv'><img src='"+item.def_id+"'></div><div class='nameDiv'><p class='goodNam'>"+item.goods_name+item.goods_suggest+"</p><p>"+item.type_name+"</p></div><div class='priDiv'><p>￥"+item.goods_price+"</p></div><div class='statDiv'>上架中</div><div class='rem'><a href='upGro.do?goods_id="+item.goods_id+"'>点击下架</a></div></div>";
                    $("#ListDate>form").append(str);
                })
            }
        })
    })
    // 商家点击查询下架中的商品
    $("#selGoodNoGro").click(function (){
        $.ajax({
            url:'/selGoodNoGro.do',
            data:{
            },
            type:"post",
            dataType:"json",
            success:function (resp){
                $("#ListDate").empty();
                let str="<form action='admUpGo.do' method='post' id='upForm'><input type='submit' value='一键上架' id='upGo'></form>";
                $("#ListDate").append(str);
                $.each(resp,function (i,item){
                    str="<div class='goodsLi'><input name='goods_id' type='checkbox' class='checkBox' value='"+item.goods_id+"'><div class='imgDiv'><img src='"+item.def_id+"'></div><div class='nameDiv'><p class='goodNam'>"+item.goods_name+item.goods_suggest+"</p><p>"+item.type_name+"</p></div><div class='priDiv'><p>￥"+item.goods_price+"</p></div><div class='statDiv'>已下架</div><div class='rem'><a href='downGro.do?goods_id="+item.goods_id+"'>点击上架</a></div></div>";
                    $("#ListDate>form").append(str);
                })
            }
        })
    })
    // 商家对商品的其他操作
    $("#qtUp").click(function (){
        $.ajax({
            url:'/qtUp.do',
            data:{
            },
            type:"post",
            dataType:"json",
            success:function (resp){
                // console.log(resp)
                let str="";
                let addDet="";
                let addPic="";
                $("#ListDate").empty();
                $.each(resp,function (i,item){
                    if (item.details_id!=null && item.picture_id!=null){
                        addDet="修改详情"
                        addPic="修改图片"
                        str="<div class='goodsLi'><div class='imgDiv'><img src='"+item.def_id+"'></div><div class='nameDiv'><p class='goodNam'>"+item.goods_name+item.goods_suggest+"</p><p>"+item.type_name+"</p></div><div class='addPri'><a href='admUpDet.do?goods_id="+item.goods_id+"'>"+addDet+"</a></div><div class='addImg'><a href='admUpPic.do?goods_id="+item.goods_id+"'>"+addPic+"</a></div><div class='rem'><a href='addNorms.do?goods_id="+item.goods_id+"'>添加规格</a></div></div>";
                    }else if(item.details_id!=null && item.picture_id==null){
                        addDet="修改详情"
                        addPic="添加图片"
                        str="<div class='goodsLi'><div class='imgDiv'><img src='"+item.def_id+"'></div><div class='nameDiv'><p class='goodNam'>"+item.goods_name+item.goods_suggest+"</p><p>"+item.type_name+"</p></div><div class='addPri'><a href='admUpDet.do?goods_id="+item.goods_id+"'>"+addDet+"</a></div><div class='addImg'><a href='admAddPic.do?goods_id="+item.goods_id+"'>"+addPic+"</a></div><div class='rem'><a href='addNorms.do?goods_id="+item.goods_id+"'>添加规格</a></div></div>";
                    }else if(item.details_id==null && item.picture_id!=null){
                        addDet="添加详情"
                        addPic="修改图片"
                        str="<div class='goodsLi'><div class='imgDiv'><img src='"+item.def_id+"'></div><div class='nameDiv'><p class='goodNam'>"+item.goods_name+item.goods_suggest+"</p><p>"+item.type_name+"</p></div><div class='addPri'><a href='admAddDet.do?goods_id="+item.goods_id+"'>"+addDet+"</a></div><div class='addImg'><a href='admUpPic.do?goods_id="+item.goods_id+"'>"+addPic+"</a></div><div class='rem'><a href='addNorms.do?goods_id="+item.goods_id+"'>添加规格</a></div></div>";
                    }else {
                        addDet="添加详情"
                        addPic="添加图片"
                        str="<div class='goodsLi'><div class='imgDiv'><img src='"+item.def_id+"'></div><div class='nameDiv'><p class='goodNam'>"+item.goods_name+item.goods_suggest+"</p><p>"+item.type_name+"</p></div><div class='addPri'><a href='admAddDet.do?goods_id="+item.goods_id+"'>"+addDet+"</a></div><div class='addImg'><a href='admAddPic.do?goods_id="+item.goods_id+"'>"+addPic+"</a></div><div class='rem'><a href='addNorms.do?goods_id="+item.goods_id+"'>添加规格</a></div></div>";
                    }
                    // str="<div class='goodsLi'><div class='imgDiv'><img src='"+item.def_id+"'></div><div class='nameDiv'><p class='goodNam'>"+item.goods_name+item.goods_suggest+"</p><p>"+item.type_name+"</p></div><div class='addPri'><a href='#'>"+addDet+"</a></div><div class='addImg'><a href='#'>"+addPic+"</a></div><div class='rem'><a href='addNorms.do?goods_id="+item.goods_id+"'>添加规格</a></div></div>";
                    $("#ListDate").append(str);
                })
            }
        })
    })
})