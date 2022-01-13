package com.yuqn.entity;

import java.math.BigInteger;

public class Address {
//    地址id
    private Integer address_id;
//    用户id
    private Integer user_id;
//    收货电话
    private BigInteger address_phone;
//    收货人姓名
    private String address_name;
//    邮政编码
    private Integer address_code;
//    收货地区
    private String address_area;
//    详细地址
    private String address_minute;

    public Integer getAddress_id() {
        return address_id;
    }

    public void setAddress_id(Integer address_id) {
        this.address_id = address_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public BigInteger getAddress_phone() {
        return address_phone;
    }

    public void setAddress_phone(BigInteger address_phone) {
        this.address_phone = address_phone;
    }

    public String getAddress_name() {
        return address_name;
    }

    public void setAddress_name(String address_name) {
        this.address_name = address_name;
    }

    public Integer getAddress_code() {
        return address_code;
    }

    public void setAddress_code(Integer address_code) {
        this.address_code = address_code;
    }

    public String getAddress_area() {
        return address_area;
    }

    public void setAddress_area(String address_area) {
        this.address_area = address_area;
    }

    public String getAddress_minute() {
        return address_minute;
    }

    public void setAddress_minute(String address_minute) {
        this.address_minute = address_minute;
    }

    public Address(Integer address_id, Integer user_id, BigInteger address_phone, String address_name, Integer address_code, String address_area, String address_minute) {
        this.address_id = address_id;
        this.user_id = user_id;
        this.address_phone = address_phone;
        this.address_name = address_name;
        this.address_code = address_code;
        this.address_area = address_area;
        this.address_minute = address_minute;
    }

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "address_id=" + address_id +
                ", user_id=" + user_id +
                ", address_phone=" + address_phone +
                ", address_name='" + address_name + '\'' +
                ", address_code=" + address_code +
                ", address_area='" + address_area + '\'' +
                ", address_minute='" + address_minute + '\'' +
                '}';
    }
}
