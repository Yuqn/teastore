$(function (){
    $("#normsBtn").click(function (){
        let price=/^[0-9]+.?[0-9]*$/;
        if($("#normsText").val().trim().length==0){
            alert("商品规格介绍不能为空");
        }else if(!price.test($("#normsPic").val())){
            alert("请输入商品价格");
        }else{
            $("#normsForm").submit();
        }
    })
})