<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>"/>
    <link rel="stylesheet" type="text/css" href="css/addpic.css"/>
    <script src="js/jquery-3.6.0.min.js" type="text/javascript" charset="UTF-8"></script>
    <script src="js/uppic.js" type="text/javascript" charset="UTF-8"></script>
</head>
<body>
<div id="wrapper">
    <div id="dhl">
        <div id="dhlBef"><a href="goAdmMy.do"> < 返回</a></div>
        <div id="dhlInd"><a href="index.jsp">网站首页</a></div>
    </div>
    <div id="admAddPic">
        <form action="admUpPicGo.do?goods_id=${goods_id}" method="post" enctype="multipart/form-data" id="picForm">
            <div class="admAddPic">
                <div>选择图片</div>
                <div><input type="file"  name="picture_one"  accept="image/jpeg,image/jpg,image/png" id="imgOne"></div>
            </div>
            <div class="admAddPic">
                <div>选择图片</div>
                <div><input type="file"  name="picture_two"  accept="image/jpeg,image/jpg,image/png" id="imgTwo"></div>
            </div>
            <div class="admAddPic">
                <div>选择图片</div>
                <div><input type="file"  name="picture_three"  accept="image/jpeg,image/jpg,image/png" id="imgThree"></div>
            </div>
            <div class="admAddPic">
                <div>选择图片</div>
                <div><input type="file"  name="picture_four"  accept="image/jpeg,image/jpg,image/png" id="imgFour"></div>
            </div>
            <div class="admAddPic">
                <div>选择图片</div>
                <div><input type="file"  name="picture_five" accept="image/jpeg,image/jpg,image/png" id="imgFive"></div>
            </div>
            <div class="admAddPic">
                <input type="button" value="提交" width="100px" id="picBtn">
            </div>
        </form>
    </div>
</div>

</body>
</html>
