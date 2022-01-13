package com.yuqn.entity;

import java.math.BigInteger;

public class User {
//    用户id
    private Integer user_id;
//    用户电话
    private BigInteger user_phone;
//    用户密码
    private String user_password;
//    用户昵称
    private String user_name;
//    用户头像
    private String user_img;
//    用户是否会员
    private Integer is_member;
//    用户积分
    private Integer member_integral;
//    用户身份证
    private BigInteger member_card;
//    用户邮箱
    private String member_email;
//    用户姓名
    private String member_name;

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

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_img() {
        return user_img;
    }

    public void setUser_img(String user_img) {
        this.user_img = user_img;
    }

    public Integer getIs_member() {
        return is_member;
    }

    public void setIs_member(Integer is_member) {
        this.is_member = is_member;
    }

    public Integer getMember_integral() {
        return member_integral;
    }

    public void setMember_integral(Integer member_integral) {
        this.member_integral = member_integral;
    }

    public BigInteger getMember_card() {
        return member_card;
    }

    public void setMember_card(BigInteger member_card) {
        this.member_card = member_card;
    }

    public String getMember_email() {
        return member_email;
    }

    public void setMember_email(String member_email) {
        this.member_email = member_email;
    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public User(Integer user_id, BigInteger user_phone, String user_password, String user_name, String user_img, Integer is_member, Integer member_integral, BigInteger member_card, String member_email, String member_name) {
        this.user_id = user_id;
        this.user_phone = user_phone;
        this.user_password = user_password;
        this.user_name = user_name;
        this.user_img = user_img;
        this.is_member = is_member;
        this.member_integral = member_integral;
        this.member_card = member_card;
        this.member_email = member_email;
        this.member_name = member_name;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_phone=" + user_phone +
                ", user_password='" + user_password + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_img='" + user_img + '\'' +
                ", is_member=" + is_member +
                ", member_integral=" + member_integral +
                ", member_card=" + member_card +
                ", member_email='" + member_email + '\'' +
                ", member_name='" + member_name + '\'' +
                '}';
    }
}
