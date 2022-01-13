<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="myData">
    <div id="perData">
        <div id="myImg"><img src="image/myImg.jpg"/></div>
        <div id="zl">
            <p></p>
            <div id="isMember"></div>
            <div id="upData">
                <a href="goMyAdd.do">地址管理</a>&nbsp;|
                <a href="goMyText.do">修改资料</a>
            </div>
        </div>
    </div>
    <div id="stateData">
        <ul>
            <li><a href="goMyOrderData.do">待付款</a></li>
            <li><a href="goMyOrderData.do">待发货</a></li>
            <li><a href="goMyOrderData.do">待发货</a></li>
            <li style="border-right: none"><a href="goMyOrderData.do">退款</a></li>
        </ul>
        <div style="width: 100%;height: 50px;line-height: 50px;text-align: center;margin-top: 170px"><p>点击上面按钮可以查看订单状态</p></div>
    </div>
</div>