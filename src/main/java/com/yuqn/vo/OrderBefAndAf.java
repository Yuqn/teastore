package com.yuqn.vo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class OrderBefAndAf {
    private Integer orders_number;
    private Date orders_time;
    private Integer goods_quantity;
    private BigDecimal orders_price;
    private String goods_name;
    private String norms_text;
    private String oradd_name;
    private BigInteger oradd_phone;
    private String oradd_area;
    private String oradd_minute;
    private Integer is_pay;
    private Integer is_delivery;
    private BigInteger express_number;

    public Integer getOrders_number() {
        return orders_number;
    }

    public void setOrders_number(Integer orders_number) {
        this.orders_number = orders_number;
    }

    public Date getOrders_time() {
        return orders_time;
    }

    public void setOrders_time(Date orders_time) {
        this.orders_time = orders_time;
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

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getNorms_text() {
        return norms_text;
    }

    public void setNorms_text(String norms_text) {
        this.norms_text = norms_text;
    }

    public String getOradd_name() {
        return oradd_name;
    }

    public void setOradd_name(String oradd_name) {
        this.oradd_name = oradd_name;
    }

    public BigInteger getOradd_phone() {
        return oradd_phone;
    }

    public void setOradd_phone(BigInteger oradd_phone) {
        this.oradd_phone = oradd_phone;
    }

    public String getOradd_area() {
        return oradd_area;
    }

    public void setOradd_area(String oradd_area) {
        this.oradd_area = oradd_area;
    }

    public String getOradd_minute() {
        return oradd_minute;
    }

    public void setOradd_minute(String oradd_minute) {
        this.oradd_minute = oradd_minute;
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

    public BigInteger getExpress_number() {
        return express_number;
    }

    public void setExpress_number(BigInteger express_number) {
        this.express_number = express_number;
    }

    public OrderBefAndAf(Integer orders_number, Date orders_time, Integer goods_quantity, BigDecimal orders_price, String goods_name, String norms_text, String oradd_name, BigInteger oradd_phone, String oradd_area, String oradd_minute, Integer is_pay, Integer is_delivery, BigInteger express_number) {
        this.orders_number = orders_number;
        this.orders_time = orders_time;
        this.goods_quantity = goods_quantity;
        this.orders_price = orders_price;
        this.goods_name = goods_name;
        this.norms_text = norms_text;
        this.oradd_name = oradd_name;
        this.oradd_phone = oradd_phone;
        this.oradd_area = oradd_area;
        this.oradd_minute = oradd_minute;
        this.is_pay = is_pay;
        this.is_delivery = is_delivery;
        this.express_number = express_number;
    }

    public OrderBefAndAf() {
    }

    @Override
    public String toString() {
        return "OrderBefAndAf{" +
                "orders_number=" + orders_number +
                ", orders_time=" + orders_time +
                ", goods_quantity=" + goods_quantity +
                ", orders_price=" + orders_price +
                ", goods_name='" + goods_name + '\'' +
                ", norms_text='" + norms_text + '\'' +
                ", oradd_name='" + oradd_name + '\'' +
                ", oradd_phone=" + oradd_phone +
                ", oradd_area='" + oradd_area + '\'' +
                ", oradd_minute='" + oradd_minute + '\'' +
                ", is_pay=" + is_pay +
                ", is_delivery=" + is_delivery +
                ", express_number=" + express_number +
                '}';
    }
}
