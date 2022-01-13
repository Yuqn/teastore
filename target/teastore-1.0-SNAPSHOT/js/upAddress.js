$(function (){
    //    表单提交事件
    $("#upAddBtn").click(function (){
        let code=/^[1-9][0-9]{5}$/;
        let phone=/^1[3578]\d{9}$/;
        if(!code.test($("#addCode").val()) ){
            alert("邮政编码错误，请输入正确格式的编码");
        }else if(!phone.test($("#addPhone").val())){
            alert("电话错误，请输入正确的电话号码")
        }else if($("#addName").val().trim().length==0 || $("#addArea").val().trim().length==0 || $("#addMin").val().trim().length==0 || $("#addPhone").val().trim().length==0 || $("#addCode").val().trim().length==0){
            alert("内容不能为空")
        }else {
            $("#upAddForm").submit();
        }
    })
})