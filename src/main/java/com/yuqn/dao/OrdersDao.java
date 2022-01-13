package com.yuqn.dao;

import com.yuqn.entity.Orders;
import com.yuqn.vo.GoodsNo;
import com.yuqn.vo.OrderBefAndAf;
import com.yuqn.vo.OrdersAdd;

import java.util.List;

public interface OrdersDao {
//    添加购物车
    public int addOrders(OrdersAdd ordersAdd);
//    查询是否有重复订单号
    public List<OrdersAdd> selOrderNum(OrdersAdd ordersAdd);
//    用户查询查询待支付列表
    public List<GoodsNo> SelGoodsNo(GoodsNo goodsNo);
//    根据删除订单
    public int reOrder(Orders orders);
//    查询未发货和已发货订单
    public List<OrderBefAndAf> selOrderBefAndAf(OrderBefAndAf orderBefAndAf);
//    支付payOrder
    public Integer payOrder(Orders orders);
}
