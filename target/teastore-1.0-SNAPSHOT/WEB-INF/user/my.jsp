<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>"/>
    <link rel="stylesheet" type="text/css" href="css/mdIndex.css"/>
    <link rel="stylesheet" type="text/css" href="css/my.css"/>
    <link rel="stylesheet" type="text/css" href="css/mdMy.css"/>
    <link rel="stylesheet" type="text/css" href="css/mdBtm.css"/>
    <script src="js/jquery-3.6.0.min.js" type="text/javascript" charset="UTF-8"></script>
    <script src="js/my.js" type="text/javascript" charset="UTF-8"></script>
</head>
<body>
<div id="wrapper">
    <%--头部导航栏--%>
    <div id="dhlTop">
        <jsp:include page="../../motherboard/mdIndex.jsp"/>
    </div>
    <%--中间部分--%>
        <div id="cent">
            <jsp:include page="../../motherboard/mdMy.jsp"/>
        </div>
    <%--底部区域--%>
    <div id="btm">
        <jsp:include page="../../motherboard/mdBtm.jsp"/>
    </div>
</div>
</body>
</html>
