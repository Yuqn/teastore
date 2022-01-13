
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>"/>
    <link rel="stylesheet" type="text/css" href="css/admlogin.css"/>
    <script src="js/jquery-3.6.0.min.js" type="text/javascript" charset="UTF-8"></script>
    <script src="js/admlogin.js" type="text/javascript" charset="UTF-8"></script>
</head>
<body>
<div id="bg">
    <div id="drag">
        <div id="logindiv">登录</div>
        <form action="admLogin.do" method="post" id="loginform">
            <div class="admGo">
                <div class="admGoLi">商家账号:</div>
                <div class="admGoLi"><input type="text" name="admin_card" id="admId"></div>
            </div>
            <div class="admGo">
                <div class="admGoLi">商家密码:</div>
                <div class="admGoLi"><input type="password" name="admin_password" id="admPas"></div>
            </div>
            <div class="admGo">
                <div  class="admGoDl"><input type="button" value="登录" id="login"></div>
            </div>
        </form>
        <div id="kszc">
            <a href="#">----</a>&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="#">----</a>
        </div>
    </div>
</div>
</body>
</html>
