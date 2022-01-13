package com.yuqn.vo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class GoodsNo {
    private Integer orders_id;
    private Integer goods_id;
    private Integer user_id;
    private BigInteger user_phone;
    private Integer norms_id;
    private String def_id;
    private String goods_name;
    private String goods_suggest;
    private BigDecimal orders_price;
    private String norms_text;
    private Integer goods_quantity;
    private Date orders_time;
    private Integer is_pay;
    private Integer is_delivery;
    private Integer orders_number;

    public Integer getOrders_id() {
        return orders_id;
    }

    public void setOrders_id(Integer orders_id) {
        this.orders_id = orders_id;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public BigInteger getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(BigInteger user_phone) {
        this.user_phone = user_phone;
    }

    public Integer getNorms_id() {
        return norms_id;
    }

    public void setNorms_id(Integer norms_id) {
        this.norms_id = norms_id;
    }

    public String getDef_id() {
        return def_id;
    }

    public void setDef_id(String def_id) {
        this.def_id = def_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getGoods_suggest() {
        return goods_suggest;
    }

    public void setGoods_suggest(String goods_suggest) {
        this.goods_suggest = goods_suggest;
    }

    public BigDecimal getOrders_price() {
        return orders_price;
    }

    public void setOrders_price(BigDecimal orders_price) {
        this.orders_price = orders_price;
    }

    public String getNorms_text() {
        return norms_text;
    }

    public void setNorms_text(String norms_text) {
        this.norms_text = norms_text;
    }

    public Integer getGoods_quantity() {
        return goods_quantity;
    }

    public void setGoods_quantity(Integer goods_quantity) {
        this.goods_quantity = goods_quantity;
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

    public GoodsNo(Integer orders_id, Integer goods_id, Integer user_id, BigInteger user_phone, Integer norms_id, String def_id, String goods_name, String goods_suggest, BigDecimal orders_price, String norms_text, Integer goods_quantity, Date orders_time, Integer is_pay, Integer is_delivery, Integer orders_number) {
        this.orders_id = orders_id;
        this.goods_id = goods_id;
        this.user_id = user_id;
        this.user_phone = user_phone;
        this.norms_id = norms_id;
        this.def_id = def_id;
        this.goods_name = goods_name;
        this.goods_suggest = goods_suggest;
        this.orders_price = orders_price;
        this.norms_text = norms_text;
        this.goods_quantity = goods_quantity;
        this.orders_time = orders_time;
        this.is_pay = is_pay;
        this.is_delivery = is_delivery;
        this.orders_number = orders_number;
    }

    public GoodsNo() {
    }

    @Override
    public String toString() {
        return "GoodsNo{" +
                "orders_id=" + orders_id +
                ", goods_id=" + goods_id +
                ", user_id=" + user_id +
                ", user_phone=" + user_phone +
                ", norms_id=" + norms_id +
                ", def_id='" + def_id + '\'' +
                ", goods_name='" + goods_name + '\'' +
                ", goods_suggest='" + goods_suggest + '\'' +
                ", orders_price=" + orders_price +
                ", norms_text='" + norms_text + '\'' +
                ", goods_quantity=" + goods_quantity +
                ", orders_time=" + orders_time +
                ", is_pay=" + is_pay +
                ", is_delivery=" + is_delivery +
                ", orders_number=" + orders_number +
                '}';
    }
}
