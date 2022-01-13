$(function (){
    $("#addBtn").click(function (){
        let val=$('input:radio[name="type_name"]:checked').val();
        let price=/^[0-9]+.?[0-9]*$/;
        if($("#addGoodsName").val().trim().length==0){
            alert("商品名称不能为空");
        }else if(val==null){
            alert("请选择商品类型");
        }else if($("#addGoodsText").val().trim().length==0){
            alert("商品介绍不能为空");
        }else if(!price.test($("#addGoodsPri").val())){
            alert("请输入商品价格");
        }else if($("#file").val()==""){
            alert("请选择一张图片上传");
        }else {
            $("#addForm").submit();
        }
    })
})