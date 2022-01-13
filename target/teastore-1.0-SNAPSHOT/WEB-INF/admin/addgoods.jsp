
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>"/>
    <link rel="stylesheet" type="text/css" href="css/addgoods.css"/>
    <script src="js/jquery-3.6.0.min.js" type="text/javascript" charset="UTF-8"></script>
    <script src="js/addgoods.js" type="text/javascript" charset="UTF-8"></script>
</head>
<body>
<div id="wrapper">
    <div id="dhl">
        <div id="dhlBef"><a href="goAdmMy.do"> < 返回</a></div>
        <div id="dhlInd"><a href="index.jsp">网站首页</a></div>
    </div>
    <div id="form">
        <form method="post" action="goodsAdd.do" enctype="multipart/form-data" id="addForm">
            <div class="addGoods">
                <div class="addGoodsLi">
                    商品名称:
                </div>
                <div  class="addGoodsLi">
                    <input type="text" name="goods_name" id="addGoodsName"/>
                </div>
            </div>
            <div class="addGoods">
                <div class="addGoodsLi">
                    商品类型:
                </div>
                <div class="addGoodsLi" style="font-size: 14px">
                    <input type="radio" name="type_name" value="广东乌龙"/>广东乌龙&nbsp;&nbsp;
                    <input type="radio" name="type_name" value="闽南乌龙"/>闽南乌龙&nbsp;&nbsp;
                    <input type="radio" name="type_name" value="闽北乌龙"/>闽北乌龙&nbsp;&nbsp;
                    <input type="radio" name="type_name" value="台湾乌龙"/>台湾乌龙
                </div>
            </div>
            <div class="addGoods">
                <div class="addGoodsLi">
                    商品介绍:
                </div>
                <div class="addGoodsLi">
                    <input type="text" name="goods_suggest" id="addGoodsText"/>
                </div>
            </div>
            <div class="addGoods">
                <div class="addGoodsLi">
                    商品价格:
                </div>
                <div class="addGoodsLi">
                    <input type="text" name="goods_price" id="addGoodsPri"/>
                </div>
            </div>
            <div class="addGoods">
                <div class="addGoodsLi">
                    商品图片:
                </div>
                <div class="addGoodsLi">
                    <input type="file" name="def_id" id="file" accept="image/jpeg,image/jpg,image/png">
                </div>
            </div>
            <div class="addGoods">
                <div class="addGoodsLi"><input type="button" value="添加商品" id="addBtn"></div>
                <div class="addGoodsLi"><input type="reset" value="重新填写"></div>
            </div>

        </form>
    </div>
</div>
</body>
</html>
