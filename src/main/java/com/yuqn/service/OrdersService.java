package com.yuqn.service;

import com.yuqn.vo.GoodsNo;
import com.yuqn.vo.OrderBefAndAf;

import java.util.List;

public interface OrdersService {
//    添加购物车
    public int addOrders(Integer goods_id,Integer norms_id,Integer goods_quantity,Integer address_id);
//    用户全部信息
    public List<GoodsNo> SelOrderAll();
//    用户查询未付款信息
    public List<GoodsNo> SelOrderNo();
//    用户查询待发货信息
    public List<GoodsNo> SelOrderGo();
    //    用户查询待收货信息
    public List<GoodsNo> SelOrderAcc();
    //    用户查询待发货信息
    public List<GoodsNo> SelOrderBef();
//    用户删除未支付订单
    public String reOrders(Integer orders_id);
//    商家查询全部未发货和已发货订单selOrderBefAndAf
    public List<OrderBefAndAf> selOrderBefAndAf(Integer is_pay,Integer is_delivery);
//    商家查询指定编号未发货或者已发货订单selOrderBefAndAfNum
    public List<OrderBefAndAf> selOrderBefAndAfNum(Integer is_pay,Integer is_delivery,Integer orders_number);
//    在线支付
    public String payOrder(Integer orders_number);
}
