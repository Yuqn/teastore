
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>"/>
    <link rel="stylesheet" type="text/css" href="css/addnorms.css"/>
    <script src="js/jquery-3.6.0.min.js" type="text/javascript" charset="UTF-8"></script>
    <script src="js/addnorms.js" type="text/javascript" charset="UTF-8"></script>
</head>
<body>
<div id="wrapper">
    <div id="dhl">
        <div id="dhlBef"><a href="goAdmMy.do"> < 返回</a></div>
        <div id="dhlInd"><a href="index.jsp">网站首页</a></div>
    </div>
    <div id="form">
        <form method="post" action="NormsY.do?goods_id=${goods_id}" id="normsForm">
            <div>
                <div>规格介绍</div>
                <div><input type="text" name="norms_text" id="normsText"></div>
            </div>
            <div>
                <div>规格价格</div>
                <div><input type="text" name="norms_price" id="normsPic"></div>
            </div>
            <div>
                <div><input type="button" value="添加规格" id="normsBtn"></div>
            </div>
        </form>
    </div>
</div>
</body>
</html>
