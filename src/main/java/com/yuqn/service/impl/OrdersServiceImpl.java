package com.yuqn.service.impl;

import com.yuqn.dao.*;
import com.yuqn.entity.*;
import com.yuqn.service.OrdersService;
import com.yuqn.vo.GoodsNo;
import com.yuqn.vo.OrderBefAndAf;
import com.yuqn.vo.OrdersAdd;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class OrdersServiceImpl implements OrdersService {
    @Resource
    private UserDao userDao;
    @Resource
    private NormsDao normsDao;
    @Resource
    private GoodsDao goodsDao;
    @Resource
    private OrdersDao ordersDao;
    @Resource
    private AddressDao addressDao;
    @Resource
    private OraddDao oraddDao;

    @Resource
    private HttpSession session;
//    获取数据加入购物车
    @Override
    public int addOrders(Integer goods_id, Integer norms_id, Integer goods_quantity, Integer address_id) {
        OrdersAdd ordersAdd=null;
        BigInteger bigInteger=new BigInteger(session.getAttribute("user_phone").toString());
//        获取当前时间
        Date date=new Date();
//        获取用户id
        User user=new User();
        user.setUser_phone(bigInteger);
        User user1=userDao.ifLogin(user);
//        生成随意订单号
        StringBuilder str1 = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            if (i == 0)
                str1.append(new Random().nextInt(9) + 1);
            else
                str1.append(new Random().nextInt(10));
        }
        Integer order_number=Integer.valueOf(str1.toString());
//      添加订单地址
        Address address=new Address();
        address.setAddress_id(address_id);
        Address address1=addressDao.selAdd(address);
        System.out.println(address1.getAddress_id());
        System.out.println(address1.getAddress_name());
        System.out.println(address1.getAddress_area());
        System.out.println(address1.getAddress_code());
        System.out.println(address1.getAddress_phone());
        System.out.println(address1.getAddress_minute());
        Oradd oradd=new Oradd();
        BigInteger phone=new BigInteger(address1.getAddress_phone().toString());
        oradd.setOradd_phone(phone);
        oradd.setOradd_name(address1.getAddress_name());
        oradd.setOradd_code(address1.getAddress_code());
        oradd.setOradd_area(address1.getAddress_area());
        oradd.setOradd_minute(address1.getAddress_minute());
        oradd.setOrders_number(order_number);
        Integer aa=oraddDao.UserOrAdd(oradd);
        System.out.println(aa);
//        Address address=new Address();
//        address.setAddress_id(address_id);
//        Address address1=addressDao.selAdd(address);
//
//        Oradd oradd=new Oradd();
//        oradd.setOrders_number(order_number);
//        BigInteger phone=new BigInteger(address1.getAddress_phone().toString());
//        oradd.setOradd_phone(phone);
//        oradd.setOradd_name(address1.getAddress_name());
//        oradd.setOradd_code(address1.getAddress_code());
//        oradd.setOradd_area(address1.getAddress_area());
//        oradd.setOradd_minute(address1.getAddress_minute());
//        oradd.setOrders_number(order_number);
//        oraddDao.addOrAdd(oradd);

//        System.out.println(user1.getUser_id());
//        System.out.println(goods_id);
//        System.out.println(norms_id);
//        System.out.println(goods_quantity);
//        System.out.println(date);
//        System.out.println(address_id);
//        System.out.println(order_number);
        if(norms_id==null){
            Goods goods=new Goods();
            goods.setGoods_id(goods_id);
            Goods goods1=goodsDao.goodsSel(goods);
            BigDecimal bigDecimal=new BigDecimal(goods1.getGoods_price().toString());
            BigDecimal bigDecimal1=new BigDecimal(goods_quantity.toString());
            BigDecimal bigDecimal2=new BigDecimal(bigDecimal.multiply(bigDecimal1).toString());
            ordersAdd=new OrdersAdd(user1.getUser_id(),goods_id,norms_id,goods_quantity,bigDecimal2,date,address_id,order_number);
        }else {
            Norms norms=new Norms();
            norms.setNorms_id(norms_id);
            Norms norms1=normsDao.selPri(norms);
            BigDecimal bigDecimal=new BigDecimal(norms1.getNorms_price().toString());
            BigDecimal bigDecimal1=new BigDecimal(goods_quantity.toString());
            BigDecimal bigDecimal2=new BigDecimal(bigDecimal.multiply(bigDecimal1).toString());
            ordersAdd=new OrdersAdd(user1.getUser_id(),goods_id,norms_id,goods_quantity,bigDecimal2,date,address_id,order_number);
        }
//        添加购物车
        Integer addNum=ordersDao.addOrders(ordersAdd);
        return addNum;
    }
//      查询全部信息SelOrderAll

    @Override
    public List<GoodsNo> SelOrderAll() {
        BigInteger bigInteger=new BigInteger(session.getAttribute("user_phone").toString());
        GoodsNo goodsNo=new GoodsNo();
        goodsNo.setUser_phone(bigInteger);
        List<GoodsNo> goodsNos=ordersDao.SelGoodsNo(goodsNo);
        return goodsNos;
    }

    //    查询未付款列表
    @Override
    public List<GoodsNo> SelOrderNo() {
        BigInteger bigInteger=new BigInteger(session.getAttribute("user_phone").toString());
        GoodsNo goodsNo=new GoodsNo();
        goodsNo.setUser_phone(bigInteger);
        goodsNo.setIs_pay(0);
        List<GoodsNo> goodsNos=ordersDao.SelGoodsNo(goodsNo);
        return goodsNos;
    }
//    查询未发货列表

    @Override
    public List<GoodsNo> SelOrderGo() {
        BigInteger bigInteger=new BigInteger(session.getAttribute("user_phone").toString());
        GoodsNo goodsNo=new GoodsNo();
        goodsNo.setUser_phone(bigInteger);
        goodsNo.setIs_pay(1);
        goodsNo.setIs_delivery(0);
        List<GoodsNo> goodsNos=ordersDao.SelGoodsNo(goodsNo);
        return goodsNos;
    }
//    查询待收货
    @Override
    public List<GoodsNo> SelOrderAcc() {
        BigInteger bigInteger=new BigInteger(session.getAttribute("user_phone").toString());
        GoodsNo goodsNo=new GoodsNo();
        goodsNo.setUser_phone(bigInteger);
        goodsNo.setIs_pay(1);
        goodsNo.setIs_delivery(1);
        List<GoodsNo> goodsNos=ordersDao.SelGoodsNo(goodsNo);
        return goodsNos;
    }
//    查询已经完成SelOrderBef

    @Override
    public List<GoodsNo> SelOrderBef() {
        BigInteger bigInteger=new BigInteger(session.getAttribute("user_phone").toString());
        GoodsNo goodsNo=new GoodsNo();
        goodsNo.setUser_phone(bigInteger);
        goodsNo.setIs_pay(1);
        goodsNo.setIs_delivery(2);
        List<GoodsNo> goodsNos=ordersDao.SelGoodsNo(goodsNo);
        return goodsNos;
    }
//    删除订单

    @Override
    public String reOrders(Integer orders_id) {
        String str="删除失败";
        Orders orders=new Orders();
        orders.setOrders_id(orders_id);
        Integer num=ordersDao.reOrder(orders);
        if(num==1){
            str="删除成功";
        }
        return str;
    }
//    查询未发货或者已发货商品

    @Override
    public List<OrderBefAndAf> selOrderBefAndAf(Integer is_pay, Integer is_delivery) {
        OrderBefAndAf orderBefAndAf=new OrderBefAndAf();
        orderBefAndAf.setIs_pay(is_pay);
        orderBefAndAf.setIs_delivery(is_delivery);
        List<OrderBefAndAf> orderBefAndAfs=ordersDao.selOrderBefAndAf(orderBefAndAf);
        return orderBefAndAfs;
    }
//指定单号未发货或者已发货列表
    @Override
    public List<OrderBefAndAf> selOrderBefAndAfNum(Integer is_pay, Integer is_delivery, Integer orders_number) {
        OrderBefAndAf orderBefAndAf=new OrderBefAndAf();
        orderBefAndAf.setIs_pay(is_pay);
        orderBefAndAf.setIs_delivery(is_delivery);
        orderBefAndAf.setOrders_number(orders_number);
        List<OrderBefAndAf> orderBefAndAfs=ordersDao.selOrderBefAndAf(orderBefAndAf);
        return orderBefAndAfs;
    }
//    在线支付payOrder

    @Override
    public String payOrder(Integer orders_number) {
        String str="支付失败，请联系管理员";
        Orders orders=new Orders();
        orders.setOrders_number(orders_number);
        Integer integer=ordersDao.payOrder(orders);
        if (integer==1){
            str="支付成功,请及时查看发货状态";
        }else {
            str="支付失败，请联系管理员";
        }
        return str;
    }
}
