<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>"/>
    <link rel="stylesheet" type="text/css" href="css/mdBtm.css"/>
    <link rel="stylesheet" type="text/css" href="css/address.css"/>
    <script src="js/jquery-3.6.0.min.js" type="text/javascript" charset="UTF-8"></script>
    <script src="js/address.js" type="text/javascript" charset="UTF-8"></script>
</head>
<body>
<div id="wrapper">
    <%--    头部--%>
    <div id="dhl">
        <div id="dhlBef"><a href="goMy.do"> < 返回</a></div>
        <div id="dhlInd"><a href="index.jsp">网站首页</a></div>
    </div>
<%--中间--%>
        <div id="cent">
            <div id="addAdd">添加收货地址</div>
            <p id="ts">当前n个，最多能创建m个</p>
            <div id="addList">

            </div>
        </div>
        <%--底部区域--%>
        <div id="btm">
            <jsp:include page="../../motherboard/mdBtm.jsp"/>
        </div>
<%--    添加收货地址--%>
    <div id="addDiv">
        <div id="gb"><div id="gbBtn">x</div></div>
        <form method="post" action="addAddress.do" id="addForm">
            <div class="addText">
                收件人姓名&nbsp;&nbsp;:&nbsp;&nbsp;<input type="text" name="address_name" id="addName">
            </div>
            <div class="addText">
                收件人地区&nbsp;&nbsp;:&nbsp;&nbsp;<input type="text" name="address_area" id="addArea">
            </div>
            <div class="addText">
                收件人地址&nbsp;&nbsp;:&nbsp;&nbsp;<input type="text" name="address_minute" id="addMin">
            </div>
            <div class="addText">
                收件人手机&nbsp;&nbsp;:&nbsp;&nbsp;<input type="text" name="address_phone" id="addPhone">
            </div>
            <div class="addText">
                收件人编码&nbsp;&nbsp;:&nbsp;&nbsp;<input type="text" name="address_code" id="addCode">
            </div>
            <div class="addText">
                <input type="button" value="点击提交" class="subres" id="addBtn">
                <input type="reset" value="重新填写" class="subres">
            </div>

        </form>
    </div>
</div>
</body>
</html>
