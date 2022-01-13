$(function (){
    $("#addDiv").hide();
    $("#gbBtn").click(function (){
        $("#addDiv").hide();
    })
    $("#addAdd").click(function (){
        $("#addDiv").show();
    })
    $.ajax({
        url:'selAdd.do',
        data:{
        },
        type:"post",
        dataType:"json",
        success:function (resp){

            let str="";
            $.each(resp,function (i,item){
                str="<div class='addList'><div class='addTitle'><div class='addTitName'>"+item.address_name+"</div><div class='addTitUp'><a href='reAdd.do?address_id="+item.address_id+"'>x</a></div> </div> <div class='addName'><p class='tou'>收件人：</p><p class='wei'>"+item.address_name+"</p></div><div class='addName'><p class='tou'>地区：</p><p class='wei'>"+item.address_area+"</p></div><div class='addName'><p class='tou'>地址：</p><p class='wei'>"+item.address_minute+"</p></div><div class='addName'><p class='tou'>手机：</p><p class='wei'>"+item.address_phone+"</p></div><div class='addName'><p class='tou'>邮编：</p><p class='wei'>"+item.address_code+"</p></div><div class='addName'><a href='goUpAdd.do?address_id="+item.address_id+"'>编辑</a></div></div>";
                str.trim();
                $("#addList").append(str);
            })
        }
    })
    //    表单提交事件
    $("#addBtn").click(function (){
        let code=/^[1-9][0-9]{5}$/;
        let phone=/^1[3578]\d{9}$/;
        if(!code.test($("#addCode").val()) ){
            alert("邮政编码错误，请输入正确格式的编码");
        }else if(!phone.test($("#addPhone").val())){
            alert("电话错误，请输入正确的电话号码")
        }else if($("#addName").val().trim().length==0 || $("#addArea").val().trim().length==0 || $("#addMin").val().trim().length==0 || $("#addPhone").val().trim().length==0 || $("#addCode").val().trim().length==0 || $("#addCode").val().trim().length==0){
            alert("内容不能为空")
        }else {
            $("#addForm").submit();
        }

    })
})