$(function (){
    $("#myTextName").hide();
    $("#myTextPas").hide();
    $("#myTextMem").hide();
    $("#nam").click(function (){
        $("#myTextPas").hide();
        $("#myTextMem").hide();
        $("#myTextName").show();
    })
    $("#paw").click(function (){
        $("#myTextName").hide();
        $("#myTextMem").hide();
        $("#myTextPas").show();
    })
    $("#mem").click(function (){
        $("#myTextName").hide();
        $("#myTextPas").hide();
        $("#myTextMem").show();
    })
    $("#upBtn").click(function (){
        if ($("#upNameDate").val().trim().length==0){
            alert("内容不能为空");
        }else {
            $("#upName").submit();
        }
    })
    $("#upBtnPas").click(function (){
        if ($("#upPasDate").val().trim().length==0 || $("#newUpPasDate").val().trim().length==0){
            alert("内容不能为空");
        }else {
            $("#upPas").submit();
        }
    })
    $("#upBtnMem").click(function (){
        let code=/^(\d{15}$|^\d{18}$|^\d{17}(\d|X|x))$/;
        let email=/^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/;
        if ($("#memName").val().trim().length==0){
            alert("内容不能为空");
        }else if(!code.test($("#memCode").val())){
            alert("身份证号码格式不正确");
        }else if(!email.test($("#memEmail").val())){
            alert("邮箱格式不正确")
        }else {
            $("#upMem").submit();
        }
    })
})