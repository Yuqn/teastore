$(function(){
    let phone=/^1[3578]\d{9}$/;
    //提交表单验证
    $("#login").click(function (){
        if (phone.test($("#userPhone").val()) && $("#userPwd").val().trim().length!=0){
            $("#userFrom").submit();
        }else {
            alert("登录失败，请检查账号或密码是否正确！")
        }
    })
})