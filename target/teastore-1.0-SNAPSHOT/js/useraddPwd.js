$(function (){
    $("#login").click(function (){
        let message=/^[0-9]\d{5}$/;
        if ($("#message").val().trim().length==0 || $("#password").val().trim().length==0 ){
            alert("内容不能为空");
        }else if(!message.test($("#message").val())){
            alert("验证码格式不正确");
        }else {
            $("#addForm").submit();
        }
    })
})