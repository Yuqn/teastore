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
    <script src="js/useraddPwd.js" type="text/javascript" charset="UTF-8"></script>
</head>
<body>
<div class="bg">
    <div class="drag">
        <div id="dlTop">用户注册</div>
        <form action="goAdd.do?user_phone=${user_phone}" method="post" id="addForm">
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
                <input type="button" value="注册" id="login">
            </div>
        </form>
        <div id="dlBtm">
            <div>
                <a href="login.jsp">已有密码</a>
            </div>
            <div>
                <a href="#">忘记密码</a>
            </div>
        </div>
    </div>
</div>
</body>
</html>
