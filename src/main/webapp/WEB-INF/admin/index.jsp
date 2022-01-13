<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>"/>
    <link rel="stylesheet" type="text/css" href="css/mdAdminIndex.css"/>
    <link rel="stylesheet" type="text/css" href="css/mdAdminLeft.css"/>
    <link rel="stylesheet" type="text/css" href="css/adminIndex.css"/>
    <link rel="stylesheet" type="text/css" href="css/mdBtm.css"/>
    <script src="js/jquery-3.6.0.min.js" type="text/javascript" charset="UTF-8"></script>
    <script src="js/adminIndex.js" type="text/javascript" charset="UTF-8"></script>
</head>
<body>
<div id="wrapper">
    <div id="dhlTop">
        <jsp:include page="../../motherboard/mdAdminIndex.jsp"/>
    </div>
    <div id="cent">
        <div id="centLeft">
            <jsp:include page="../../motherboard/mdAdminLeft.jsp"/>
        </div>
        <div id="centRight">
            <ul id="one">
                <li id="selGoodSel">全部商品</li>
                <li id="selGoodGro">已上架</li>
                <li id="selGoodNoGro">未上架</li>
            </ul>
            <ul id="two">
                <li><a href="addgoods.do" style="color: black;text-decoration: none;">添加物品</a></li>
                <li id="qtUp">其他操作</li>
            </ul>
            <ul id="three">
                <li>修改规格</li>
                <li>删除规格</li>
            </ul>
            <ul id="four">
                <li><a href="orderbef.do" style="color:black;text-decoration: none;">未发货</a></li>
                <li><a href="orderaf.do" style="color:black;text-decoration: none;">已发货</a></li>
            </ul>
            <ul id="five">
                <li>申请列表</li>
            </ul>
            <ul id="seven">
                <li>全部用户</li>
                <li>会员用户</li>
            </ul>
            <div id="ListDate">
                <p style="line-height: 300px;text-align: center">点击左边或者上边按钮获取信息</p>
            </div>
        </div>
    </div>
</div>
</body>
</html>
