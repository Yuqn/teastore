$(function (){
    $.ajax({
        url:'selUser.do',
        data:{
        },
        type:"post",
        dataType:"json",
        success:function (resp){
            $("#zl>p").append(resp.user_name);
            if(resp.is_member==0){
                $("#isMember").append("非会员");
            }else{
                $("#isMember").append("会员");
            }
        }
    })
})
