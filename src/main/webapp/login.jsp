
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
    <script src="js/login.js" type="text/javascript" charset="UTF-8"></script>
</head>
<body>
<div class="bg">
    <div class="drag">
        <div id="dlTop">用户登录</div>
        <form action="login.do" method="post" id="userFrom">
            <div class="logDhl">
                <div>
                    账号:
                </div>
                <div>
                    <input type="text" name="phone" id="userPhone">
                </div>
            </div>
            <div class="logDhl">
                <div>
                    密码:
                </div>
                <div>
                    <input type="password" name="password" id="userPwd">
                </div>
            </div>
            <div class="logDhl">
                <input type="button" value="登录" id="login">
            </div>
        </form>
        <div id="dlBtm">
            <div>
                <a href="backuser.jsp">忘记密码</a>
            </div>
            <div>
                <a href="adduser.jsp">快速注册</a>
            </div>
        </div>
    </div>
</div>
</body>
</html>
