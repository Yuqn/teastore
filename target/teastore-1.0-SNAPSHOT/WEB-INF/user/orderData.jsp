<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>"/>
    <link rel="stylesheet" type="text/css" href="css/orderData.css"/>
    <link rel="stylesheet" type="text/css" href="css/mdBtm.css"/>
    <script src="js/jquery-3.6.0.min.js" type="text/javascript" charset="UTF-8"></script>
    <script src="js/orderData.js" type="text/javascript" charset="UTF-8"></script>
</head>
<body>
<div id="wrapper">
<%--    头部--%>
    <div id="dhl">
        <div id="dhlBef"><a href="goMy.do"> < 返回</a></div>
        <div id="dhlInd"><a href="index.jsp">网站首页</a></div>
    </div>
<%--    中间页面--%>
    <div id="cent">
        <div id="gnUl">
            <ul>
                <li id="orderAll">全部</li>
                <li id="orderNo">待付款</li>
                <li id="orderGo">待发货</li>
                <li id="orderAcc">待收货</li>
                <li id="orderBef" style="border-right: none">退款</li>
            </ul>
        </div>
        <div id="orderList">
            <div style="width: 100%;height: 500px; line-height: 450px;text-align: center;"><p>请点击上面订单的状态进行查询</p></div>
        </div>
    </div>
    <%--底部区域--%>
    <div id="btm">
        <jsp:include page="../../motherboard/mdBtm.jsp"/>
    </div>
</div>
</body>
</html>
