$(function (){
    $("#detBtn").click(function (){
        let price=/^[0-9]+.?[0-9]*$/;
        if($("#detPic").val().trim().length==0){
            alert("商品价格介绍不能为空");
        }else if($("#detText").val().trim().length==0){
            alert("商品介绍不能为空");
        }else if($("#imgOne").val()=="" || $("#imgTwo").val()=="" || $("#imgThree").val()=="" ||$("#imgFour").val()=="" || $("#imgFive").val()==""){
            alert("请选择图片上传");
        }else {
            $("#detForm").submit();
        }
    })
})