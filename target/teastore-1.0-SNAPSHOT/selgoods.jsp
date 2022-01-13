<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>"/>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/mdIndex.css"/>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/selgoods.css"/>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/mdBtm.css"/>
    <script src="<%=basePath%>js/jquery-3.6.0.min.js" type="text/javascript" charset="UTF-8"></script>
    <script src="<%=basePath%>js/selgoods.js" type="text/javascript" charset="UTF-8"></script>
</head>
<body>
<div id="wrapper">
    <%--头部导航栏--%>
    <div id="dhlTop">
        <jsp:include page="motherboard/mdIndex.jsp"/>
    </div>
    <div id="sel">
        <div id="selGood">
            <input type="text" name="goods_name" id="selgoodinp" style="width: 83%;height: 100%;border: 2px green solid;float: left">
            <div id="selgooddiv">搜一下</div>
        </div>
    </div>
    <div id="cent">
        <div id="centLeft">
            <ul>
                <li style="background-color: grey;line-height: 60px;color:white;text-align: center;font-size: 20px;">分&nbsp;&nbsp;类</li>
                <li><a onClick='goSousuo("广东乌龙")'>广东乌龙</a></li>
                <li><a onclick='goSousuo("闽南乌龙")'>闽南乌龙</a></li>
                <li><a onclick='goSousuo("闽北乌龙")'>闽北乌龙</a></li>
                <li><a onclick='goSousuo("台湾乌龙")'>台湾乌龙</a></li>
            </ul>
        </div>
        <div id="centRight">
            <div id="goodPrice">
                <p>价格区间&nbsp;&nbsp;:&nbsp;&nbsp;</p>
                <input type="text" id="minPri" name="minPri"/>
                <p>&nbsp;&nbsp;~&nbsp;&nbsp;</p>
                <input type="text" id="maxPri" name="maxPri"/>&nbsp;&nbsp;
                <div id="goodpriceDiv">搜索</div>
            </div>
            <div id="goodsList">
                <p style="text-align: center;line-height: 100px;">暂时还没有结果，去搜索或者点击左边分类可以找到商品哦~</p>

            </div>
        </div>
    </div>
        <%--底部区域--%>
   <div id="btm">
        <jsp:include page="motherboard/mdBtm.jsp"/>
   </div>
</div>
</body>
</html>
