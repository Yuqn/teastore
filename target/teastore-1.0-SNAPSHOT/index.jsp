<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
<html>
<head>
    <meta charset="utf-8">
    <title>index</title>
    <base href="<%=basePath%>"/>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/mdIndex.css"/>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/index.css"/>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/mdBtm.css"/>
    <script src="<%=basePath%>js/jquery-3.6.0.min.js" type="text/javascript" charset="UTF-8"></script>
    <script src="<%=basePath%>js/index.js" type="text/javascript" charset="UTF-8"></script>
</head>
<body>
<div id="wrapper">
<%--    头部导航栏--%>
    <div id="dhlTop">
        <jsp:include page="motherboard/mdIndex.jsp"/>
    </div>
<%--    轮播图--%>
    <div id="rotation">
        <ul>
            <li><img src="image/lbtOne.jpg"/></li>
            <li><img src="image/lbtTwo.jpg"/></li>
        </ul>
    </div>
<%--    商品展示--%>
    <div id="show">
        <div id="showText">
            <h3>商品展示</h3>
        </div>
        <div id="showImg">
            <ul>

            </ul>
        </div>
    </div>
<%--    会员模块--%>
    <div id="memberDiv">
        <a href="#">
            <img src="image/centTwo.png">
        </a>
    </div>
<%--    茶叶文化--%>
    <div id="teaMind">
        <div id="teaText">
            <h3>茶叶文化</h3>
        </div>
        <p>茶叶源于中国，茶叶最早是被作为祭品使用的。但从春秋后期就被人们作为菜食，在西汉中期发展为药用，西汉后期才发展为宫廷高级饮料，普及民间作为普通饮料那是西晋以后的事。发现最早人工种植茶叶的遗迹在浙江余姚的田螺山遗址，已有6000多年的历史。饮茶始于中国。叶革质，长圆形或椭圆形，可以用开水直接泡饮，依据品种和制作方式以及产品外形分成六大类。依据季节采制可分为春茶、夏茶、秋茶、冬茶。以各种毛茶或精制茶叶再加工形成再加茶，包括分为花茶、紧压茶、萃取茶、药用保健茶、茶食品、含茶饮料等。</p><br/>
        <p>茶树种植的自然条件包括地貌、气候、土壤类型等。地形以丘陵为主，排水条件要好。降水充沛，年温差小、日夜温差大，无霜期长，光照条件好，这样的气候条件适宜各种类型的茶树生长，尤其适合大叶种茶树生长。冬末至夏初日照比较多，夏秋雨多雾大（云南茶区），日照较少利于茶树越冬和养分积累，利于夏秋茶的品质。砖红壤、砖红壤性红壤、山地红壤或山地黄壤、棕色森林土，这些土壤发育程度较深，结构良好，适合茶树生长。</p><br/>
        <p>作为开门七件事（柴米油盐酱醋茶）之一，饮茶在古代中国是非常普遍的。中华茶文化源远流长，博大精深，不但包含物质文化层面，还包含深厚的精神文明层次。唐代茶圣陆羽的茶经在历史上吹响了中华茶文化的号角。从此茶的精神渗透了宫廷和社会，深入中国的诗词、绘画、书法、宗教、医学。好几千年来中国不但积累了大量关于茶叶种植、生产的物质文化、更积累了丰富的有关茶的精神文化，这就是中国特有的茶文化，属于文化学范畴。</p><br/>
        <p>茶叶中富含茶酚、磷儿茶素、维生素E、黄酮类等物质，经常喝茶有益健康。软化血管：茶水可使血管中血清胆固醇和纤维蛋白含量降低，从而降低血脂，软化血管。消炎：茶水有收敛、消炎等作用，能预防肠道传染病。茶水可分解烟草中的某些毒素，尤其能抑制尼古丁对人体健康的影响。抗菌、抗病毒：茶水有抗菌、抗病毒、消毒等作用。对清洗小伤口、止血、止痛等作用相当明显。防龋齿：茶水漱口可防止龋齿生成，有利于口腔卫生。煮沸的茶水冷却后，涂在嘴唇疱疹处，4-5天后嘴唇疱疹即可逐渐消失。茶叶有抑制细胞突变与癌变的作用，而且有抑制癌细胞的生长和扩散作用，长期饮茶能降低食管癌、胃癌、肠癌等消化道肿瘤的发病率。茶水可提神醒脑、清热解毒，具有明目、消滞、减肥之功效。</p><br/><hr/><br/>
        <div id="teaImgOne"><img src="image/teaMindOne.png"></div><br/>
        <div id="teaImgTwo"><img src="image/teaMindFive.jpg"/></div><br/>
        <div id="teaImgThree"><img src="image/teaMindAgt.png"/></div><br/>
<%--        <div id="teaImgFour"><img src="image/teaMindTwo.jpg"/></div>--%>
    </div>
    <div id="btm">
        <jsp:include page="motherboard/mdBtm.jsp"/>
    </div>

</div>

</body>
</html>
