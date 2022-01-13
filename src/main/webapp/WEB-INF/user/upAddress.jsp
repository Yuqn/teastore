<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="css/upAddress.css"/>
    <link rel="stylesheet" type="text/css" href="css/mdBtm.css"/>
    <script src="js/jquery-3.6.0.min.js" type="text/javascript" charset="UTF-8"></script>
    <script src="js/upAddress.js" type="text/javascript" charset="UTF-8"></script>
</head>
<body>
<div id="wrapper">
    <%--    头部--%>
    <div id="dhl">
        <div id="dhlBef"><a href="goMy.do"> < 返回</a></div>
        <div id="dhlInd"><a href="index.jsp">网站首页</a></div>
    </div>
    <%--    中间页面--%>
        <div id="addDiv">
            <form method="post" action="upAddress.do?address_id=${address.address_id}" id="upAddForm">
                <div class="addText">
                    <div>收件人姓名:</div>
                    <div><input type="text" name="address_name" value="${address.address_name}" id="addName"></div>
                </div>
                <div class="addText">
                    <div>收件人地区</div>
                    <div><input type="text" name="address_area" value="${address.address_area}" id="addArea"></div>
                </div>
                <div class="addText">
                    <div>收件人地址</div>
                    <div><input type="text" name="address_minute" value="${address.address_minute}" id="addMin"></div>
                </div>
                <div class="addText">
                    <div>收件人手机</div>
                    <div><input type="text" name="address_phone" value="${address.address_phone}" id="addPhone"></div>
                </div>
                <div class="addText">
                    <div>收件人编码</div>
                    <div><input type="text" name="address_code" value="${address.address_code}" id="addCode"></div>
                </div>
                <div class="addText">
                    <input type="button" value="点击提交" class="subres" id="upAddBtn">
                    <input type="reset" value="重新填写" class="subres">
                </div>
            </form>
        </div>
    <%--底部区域--%>
    <div id="btm">
        <jsp:include page="../../motherboard/mdBtm.jsp"/>
    </div>
</div>
</body>
</html>
