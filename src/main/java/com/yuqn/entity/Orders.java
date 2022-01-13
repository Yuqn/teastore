package com.yuqn.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Orders {
//    订单id
    private Integer orders_id;
//    用户id
    private Integer user_id;
//    商品id
    private Integer goods_id;
//    规格id
    private Integer norms_id;
//    商品数量
    private Integer goods_quantity;
//    订单小计
    private BigDecimal orders_price;
//    订单时间
    private Date orders_time;
//    是否支付
    private Integer is_pay;
//    发货状态
    private Integer is_delivery;
//    订单编号
    private Integer orders_number;
//    发货地址id
    private Integer address_id;

    public Integer getOrders_id() {
        return orders_id;
    }

    public void setOrders_id(Integer orders_id) {
        this.orders_id = orders_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public Integer getNorms_id() {
        return norms_id;
    }

    public void setNorms_id(Integer norms_id) {
        this.norms_id = norms_id;
    }

    public Integer getGoods_quantity() {
        return goods_quantity;
    }

    public void setGoods_quantity(Integer goods_quantity) {
        this.goods_quantity = goods_quantity;
    }

    public BigDecimal getOrders_price() {
        return orders_price;
    }

    public void setOrders_price(BigDecimal orders_price) {
        this.orders_price = orders_price;
    }

    public Date getOrders_time() {
        return orders_time;
    }

    public void setOrders_time(Date orders_time) {
        this.orders_time = orders_time;
    }

    public Integer getIs_pay() {
        return is_pay;
    }

    public void setIs_pay(Integer is_pay) {
        this.is_pay = is_pay;
    }

    public Integer getIs_delivery() {
        return is_delivery;
    }

    public void setIs_delivery(Integer is_delivery) {
        this.is_delivery = is_delivery;
    }

    public Integer getOrders_number() {
        return orders_number;
    }

    public void setOrders_number(Integer orders_number) {
        this.orders_number = orders_number;
    }

    public Integer getAddress_id() {
        return address_id;
    }

    public void setAddress_id(Integer address_id) {
        this.address_id = address_id;
    }

    public Orders(Integer orders_id, Integer user_id, Integer goods_id, Integer norms_id, Integer goods_quantity, BigDecimal orders_price, Date orders_time, Integer is_pay, Integer is_delivery, Integer orders_number, Integer address_id) {
        this.orders_id = orders_id;
        this.user_id = user_id;
        this.goods_id = goods_id;
        this.norms_id = norms_id;
        this.goods_quantity = goods_quantity;
        this.orders_price = orders_price;
        this.orders_time = orders_time;
        this.is_pay = is_pay;
        this.is_delivery = is_delivery;
        this.orders_number = orders_number;
        this.address_id = address_id;
    }

    public Orders() {
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orders_id=" + orders_id +
                ", user_id=" + user_id +
                ", goods_id=" + goods_id +
                ", norms_id=" + norms_id +
                ", goods_quantity=" + goods_quantity +
                ", orders_price=" + orders_price +
                ", orders_time=" + orders_time +
                ", is_pay=" + is_pay +
                ", is_delivery=" + is_delivery +
                ", orders_number=" + orders_number +
                ", address_id=" + address_id +
                '}';
    }
}
