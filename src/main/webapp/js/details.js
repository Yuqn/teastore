$(function(){
    let con_name = getUrlParam("goods_id"); //接收con_name
    function getUrlParam(name) {
        let reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
        let r = window.location.search.substr(1).match(reg);  //匹配目标参数
        if (r != null) return unescape(r[2]); return null; //返回参数值
    }
    $.ajax({
        url:"normsAjax.do",
        data:{goods_id:con_name
        },
        type:"post",
        dataType:"json",
        success:function (resp){
            // console.log(resp)
            $.each(resp,function (i,item){
                let str="<input type='radio' name='norms_id' value='"+item.norms_id+"'/>"+item.norms_text+"&nbsp;&nbsp;&nbsp;&nbsp;&#65509;"+item.norms_price+"<br/>";
                $("#normsList").append(str);
            })
            $("#normsList").append("<br/>");
        }
    })
    $.ajax({
        url:"selAdd.do",
        data:{
        },
        type:"post",
        dataType:"json",
        success:function (resp){
            // console.log(resp);
            $.each(resp,function (i,item){
                // let str="<input type='radio' name='address_id' value='"+item.address_id+"'/>"+"电话"+"&nbsp;&nbsp;:&nbsp;&nbsp;"+item.address_phone+"&nbsp;&nbsp;"+"收件人姓名"+"&nbsp;&nbsp;:&nbsp;&nbsp;"+item.address_name+"&nbsp;&nbsp;"+"收货地址"+"&nbsp;&nbsp;:&nbsp;&nbsp;"+item.address_area+item.address_minute+"<br/>";
                let str="<input type='radio' name='address_id' value='"+item.address_id+"'/>"+item.address_phone+"&nbsp;&nbsp;;&nbsp;&nbsp;"+item.address_name+"&nbsp;&nbsp;;&nbsp;&nbsp;"+item.address_area+item.address_minute+"<br/>";
                $("#addressList").append(str);
            })
            $("#addressList").append("<br/>");
        }
    })
    $.ajax({
        url:"selDetails.do",
        data:{"goods_id":con_name
        },
        type:"post",
        dataType:"json",
        success:function (resp){
            let str="";
            if(resp.details_one!=null){
                str+="<img src='"+resp.details_one+"'>";
            }
            if(resp.details_two!=null){
                str+="<img src='"+resp.details_two+"'>";
            }
            if(resp.details_three!=null){
                str+="<img src='"+resp.details_three+"'>";
            }
            if(resp.details_four!=null){
                str+="<img src='"+resp.details_four+"'>";
            }
            if(resp.details_five!=null){
                str+="<img src='"+resp.details_five+"'>";
            }
            $("#ifLive").append(str);
            $("#goodsDetails").append("<p>"+resp.details_text+"</p>");
            $("#detailsPrice").append("<p>"+resp.details_price+"</p>");
        }
    })
    //添加按钮
    let goodNum=parseInt($("#goodsNum").val());
    $("#addNum").click(function (){
        goodNum+=1;
        $("#goodsNum").val(goodNum);
    })
    $("#decNum").click(function (){
        if (goodNum==1){
            alert("选择数量最少为1");
        }
        else {
            goodNum-=1;
            $("#goodsNum").val(goodNum);
        }
    })
    //    提交订单时判定
    $("#detailBtm").click(function (){
        let val=$('input:radio[name="address_id"]:checked').val();
        if(val==null){
            alert("请选择地址信息!如果没有地址，请前往添加地址信息");
        }
        else{
            $("#ordForm").submit();
        }
    })

})

