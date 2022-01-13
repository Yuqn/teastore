
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
    <script src="js/adduser.js" type="text/javascript" charset="UTF-8"></script>
</head>
<body>
<div class="bg">
    <div class="drag">
        <div id="dlTop">用户注册</div>
        <form action="useradd.do" method="post" id="goForm">
            <div class="logDhl">
                <div>
                    手机号码:
                </div>
                <div>
                    <input type="text" name="phone" id="phone">
                </div>
            </div>
            <div class="logDhl">
                <div style="width: 30%;height: 100%;">
                    输入验证码:
                </div>
                <div style="width: 43%;float: left;margin-right: 5%;">
                    <input type="text" name="yzm" id="yzm">
                </div>
                <div id="btn" style="width: 20%;height: 20px;float: left;border: 1px solid white; line-height: 20px;text-align: center;font-size: 13px;">
                    点击刷新
                </div>
            </div>
            <div class="logDhl">
                <input type="button" value="发送短信" id="login">
            </div>
        </form>
        <div id="dlBtm">
            <div>
                <a href="login.jsp">已有密码</a>
            </div>
            <div>
                <a href="backuser.jsp">找回密码</a>
            </div>
        </div>
    </div>
</div>
</body>
</html>
