package com.yuqn.entity;

import java.math.BigInteger;

public class Oradd {
    private Integer oradd_id;
    private BigInteger oradd_phone;
    private String oradd_name;
    private Integer oradd_code;
    private String oradd_area;
    private String oradd_minute;
    private Integer orders_number;

    public Integer getOradd_id() {
        return oradd_id;
    }

    public void setOradd_id(Integer oradd_id) {
        this.oradd_id = oradd_id;
    }

    public BigInteger getOradd_phone() {
        return oradd_phone;
    }

    public void setOradd_phone(BigInteger oradd_phone) {
        this.oradd_phone = oradd_phone;
    }

    public String getOradd_name() {
        return oradd_name;
    }

    public void setOradd_name(String oradd_name) {
        this.oradd_name = oradd_name;
    }

    public Integer getOradd_code() {
        return oradd_code;
    }

    public void setOradd_code(Integer oradd_code) {
        this.oradd_code = oradd_code;
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

    public Integer getOrders_number() {
        return orders_number;
    }

    public void setOrders_number(Integer orders_number) {
        this.orders_number = orders_number;
    }

    public Oradd(Integer oradd_id, BigInteger oradd_phone, String oradd_name, Integer oradd_code, String oradd_area, String oradd_minute, Integer orders_number) {
        this.oradd_id = oradd_id;
        this.oradd_phone = oradd_phone;
        this.oradd_name = oradd_name;
        this.oradd_code = oradd_code;
        this.oradd_area = oradd_area;
        this.oradd_minute = oradd_minute;
        this.orders_number = orders_number;
    }

    public Oradd() {
    }

    @Override
    public String toString() {
        return "Oradd{" +
                "oradd_id=" + oradd_id +
                ", oradd_phone=" + oradd_phone +
                ", oradd_name='" + oradd_name + '\'' +
                ", oradd_code=" + oradd_code +
                ", oradd_area='" + oradd_area + '\'' +
                ", oradd_minute='" + oradd_minute + '\'' +
                ", orders_number=" + orders_number +
                '}';
    }
}
