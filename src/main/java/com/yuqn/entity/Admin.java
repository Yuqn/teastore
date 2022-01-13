package com.yuqn.entity;

import java.math.BigInteger;

public class Admin {
//    管理员id
    private Integer admin_id;
//    管理员账号
    private BigInteger admin_card;
//    管理员密码
    private String admin_password;
//    管理员姓名
    private String admin_name;

    public Integer getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Integer admin_id) {
        this.admin_id = admin_id;
    }

    public BigInteger getAdmin_card() {
        return admin_card;
    }

    public void setAdmin_card(BigInteger admin_card) {
        this.admin_card = admin_card;
    }

    public String getAdmin_password() {
        return admin_password;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public Admin(Integer admin_id, BigInteger admin_card, String admin_password, String admin_name) {
        this.admin_id = admin_id;
        this.admin_card = admin_card;
        this.admin_password = admin_password;
        this.admin_name = admin_name;
    }

    public Admin() {
    }

    @Override
    public String toString() {
        return "Admin{" +
                "admin_id=" + admin_id +
                ", admin_card=" + admin_card +
                ", admin_password='" + admin_password + '\'' +
                ", admin_name='" + admin_name + '\'' +
                '}';
    }
}
