$(function (){
    $("#login").click(function (){
        if($("#admId").val().trim().length==0 || $("#admPas").val().trim().length==0){
            alert("账号或密码不能为空");
        }else {
            $("#loginform").submit();
        }
    })
})