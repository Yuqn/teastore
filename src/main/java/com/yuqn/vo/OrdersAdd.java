package com.yuqn.vo;

import java.math.BigDecimal;
import java.util.Date;

public class OrdersAdd {
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
    //    发货地址id
    private Integer address_id;
//    订单号
    private Integer orders_number;

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

    public Integer getAddress_id() {
        return address_id;
    }

    public void setAddress_id(Integer address_id) {
        this.address_id = address_id;
    }

    public Integer getOrders_number() {
        return orders_number;
    }

    public void setOrders_number(Integer orders_number) {
        this.orders_number = orders_number;
    }

    public OrdersAdd(Integer user_id, Integer goods_id, Integer norms_id, Integer goods_quantity, BigDecimal orders_price, Date orders_time, Integer address_id, Integer orders_number) {
        this.user_id = user_id;
        this.goods_id = goods_id;
        this.norms_id = norms_id;
        this.goods_quantity = goods_quantity;
        this.orders_price = orders_price;
        this.orders_time = orders_time;
        this.address_id = address_id;
        this.orders_number = orders_number;
    }

    public OrdersAdd() {
    }

    @Override
    public String toString() {
        return "OrdersAdd{" +
                "user_id=" + user_id +
                ", goods_id=" + goods_id +
                ", norms_id=" + norms_id +
                ", goods_quantity=" + goods_quantity +
                ", orders_price=" + orders_price +
                ", orders_time=" + orders_time +
                ", address_id=" + address_id +
                ", orders_number=" + orders_number +
                '}';
    }
}
