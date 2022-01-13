<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
    <title>goodsDetails</title>
    <base href="<%=basePath%>"/>
    <link rel="stylesheet" type="text/css" href="css/mdIndex.css"/>
    <link rel="stylesheet" type="text/css" href="css/details.css"/>
    <link rel="stylesheet" type="text/css" href="css/mdBtm.css"/>
    <script src="js/jquery-3.6.0.min.js" type="text/javascript" charset="UTF-8"></script>
    <script src="js/details.js" type="text/javascript" charset="UTF-8"></script>
</head>
<body>
    <div id="wrapper">
<%--头部导航栏--%>
        <div id="dhlTop">
            <jsp:include page="../../motherboard/mdIndex.jsp"/>
        </div>
<%--中间区域--%>
        <div id="cent">
            <div id="centImg">
                <div id="centTopImg"><img src="${goodDet.def_id}"/></div>
                <div id="centImgList">
                    <img src="${goodDet.picture_one}"/>
                    <img src="${goodDet.picture_two}"/>
                    <img src="${goodDet.picture_three}"/>
                    <img src="${goodDet.picture_four}"/>
                    <img src="${goodDet.picture_five}"/>
                </div>
            </div>
            <div id="centGoods">
                <p id="goodsDet">${goodDet.goods_name}&nbsp;${goodDet.goods_suggest}</p>
                <p id="goodsName">${goodDet.goods_name}</p><br/>
                <p id="goodsType">类型：&nbsp;${goodDet.type_name}</p>
                <hr/>
                <p id="goodsPri">￥&nbsp;&nbsp;${goodDet.goods_price}</p>
                <p id="goodsDel">状态：&nbsp;有货</p><br/>
<%--                <p id="ifType">选择类型</p>--%>
                <hr/>
                <div id="goodsForm">
                    <form method="post" action="goForm.do" id="ordForm" >
                        <p>选择数量</p>
                        <ul id="num">
                            <li><div id="decNum">-</div></li>
                            <li><input type="text" name="goods_num" value="1" id="goodsNum" style="width: 30px;height: 20px;margin: 0px 5px;" readonly="readonly"></li>
                            <li><div id="addNum">+</div></li>
                        </ul><br/>
                        <p>选择规格</p>
                        <div id="normsList">

                        </div>
                        <div id="addAddress"><a href="goMyAdd.do" style="text-decoration: none;color: black;">没有想要的地址？去添加-></a></div>
                        <div id="addressList">

                        </div>
                        <input name="goods_id" value="${goodDet.goods_id}" type="hidden">
                        <input type="button"  value="添加购物车" id="detailBtm">
                        <input type="reset" value="重新选择">
                    </form>
                </div>
            </div>
<%--            详情页图片--%>
            <div id="ifLive">
                <div>更多图片</div>
            </div>
<%--            详情页商品信息--%>
            <div id="goodsDetails">
                <div>详细信息</div>
            </div>
<%--            详情页价格说明--%>
            <div id="detailsPrice">
                <div>价格说明</div>
            </div>
        </div>
<%--底部区域--%>
        <div id="btm">
            <jsp:include page="../../motherboard/mdBtm.jsp"/>
        </div>
    </div>

</body>
</html>