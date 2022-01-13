<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="css/upMyText.css"/>
    <link rel="stylesheet" type="text/css" href="css/mdBtm.css"/>
    <script src="js/jquery-3.6.0.min.js" type="text/javascript" charset="UTF-8"></script>
    <script src="js/upMyText.js" type="text/javascript" charset="UTF-8"></script>
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
        <ul>
            <li id="nam">修改昵称</li>
            <li id="paw">修改密码</li>
            <li id="mem">开通会员</li>
        </ul>
        <div id="myTextName">
            <form action="upName.do" method="post" id="upName">
                <div>请输入新昵称:<input type="text" name="user_name" id="upNameDate"></div>
                <div><input type="button" value="提交" id="upBtn"></div>
            </form>
        </div>
        <div id="myTextPas">
            <form action="up.do" method="post" id="upPas">
                <div>请输入原密码:<input type="password" name="password" id="upPasDate"></div>
                <div>请输入新密码:<input type="password" name="newPassword" id="newUpPasDate"></div>
                <div><input type="button" value="提交" id="upBtnPas"></div>
            </form>
        </div>
        <div id="myTextMem">
            <form action="men.do" method="post" id="upMem">
                <div>请输入真实姓名:<input type="text" name="member_name" id="memName"></div>
                <div>请输入身份证号码:<input type="text" name="member_code" id="memCode"></div>
                <div>请输入邮箱:<input type="text" name="member_email" id="memEmail"></div>
                <div><input type="button" value="提交" id="upBtnMem"></div>
            </form>
        </div>
    </div>
    <%--底部区域--%>
    <div id="btm" style="position: fixed;bottom: 0px;">
        <jsp:include page="../../motherboard/mdBtm.jsp"/>
    </div>
</div>
</body>
</html>
