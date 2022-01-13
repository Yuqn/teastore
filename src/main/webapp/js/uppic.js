$(function (){
    $("#picBtn").click(function (){
        if($("#imgOne").val()=="" || $("#imgTwo").val()=="" || $("#imgThree").val()=="" ||$("#imgFour").val()=="" || $("#imgFive").val()==""){
            alert("上传图片不能有空");
        }else{
            $("#picForm").submit();
        }
    })
})