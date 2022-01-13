$(function (){
    let str="";
    let arr = ['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'];
    let phone=/^1[3578]\d{9}$/;
    $("#btn").click(function (){
        str="";
        for(let i = 0 ; i < 4 ; i++ ){
            str += ''+arr[Math.floor(Math.random() * arr.length)];
        }
        str.trim();
        $("#btn").text("");
        $("#btn").append(str);
    })
    //提交表单验证
    $("#login").click(function (){
        if (phone.test($("#phone").val()) && str==$("#yzm").val() && $("#yzm").val().trim().length!=0){
            $("#goForm").submit();
        }else {
            alert("注册失败，请检查手机号码或者验证码是否正确！")
        }
    })
})