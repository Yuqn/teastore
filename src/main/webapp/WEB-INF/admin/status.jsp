<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="css/status.css"/>
    <script src="js/jquery-3.6.0.min.js" type="text/javascript" charset="UTF-8"></script>
</head>
<body>
<div id="wrapper">
    <%--    头部--%>
    <div id="dhl">
        <div id="dhlBef"><a href="goAdmMy.do"> < 返回</a></div>
        <div id="dhlInd"><a href="index.jsp">网站首页</a></div>
    </div>
    <div id="status">
        <div id="statusOne"><p>操作状态</p></div>
        <div id="statusTwo"><p>${str}</p></div>
    </div>
</div>
</body>
</html>
