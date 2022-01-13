<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>"/>
    <link rel="stylesheet" type="text/css" href="css/login.css"/>
    <script src="js/jquery-3.6.0.min.js" type="text/javascript" charset="UTF-8"></script>
    <script src="js/backuppwd.js" type="text/javascript" charset="UTF-8"></script>
</head>
<body>
<div class="bg">
    <div class="drag">
        <div id="dlTop">找回密码</div>
        <form action="goBack.do?user_phone=${user_phone}" method="post" id="addForm">
            <div class="logDhl">
                <div style="width: 30%;">
                    短信验证码:
                </div>
                <div style="width: 67%;margin-left: 2%;">
                    <input type="text" name="message" id="message">
                </div>
            </div>
            <div class="logDhl">
                <div style="width: 30%;">
                    输入新密码:
                </div>
                <div style="width: 67%;margin-left: 2%;">
                    <input type="password" name="password" id="password">
                </div>
            </div>
            <div class="logDhl">
                <input type="button" value="确认" id="login">
            </div>
        </form>
        <div id="dlBtm">
            <div>
                <a href="login.jsp">已有密码</a>
            </div>
            <div>
                <a href="adduser.jsp">快速注册</a>
            </div>
        </div>
    </div>
</div>
</body>
</html>
