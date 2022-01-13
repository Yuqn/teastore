package com.yuqn.entity;

import java.math.BigDecimal;

public class Norms {
//    规格id
    private Integer norms_id;
//    商品id
    private Integer goods_id;
//    规格详细
    private String norms_text;
//    对应价格
    private BigDecimal norms_price;
//    对应图片
    private String norms_img;

    public Integer getNorms_id() {
        return norms_id;
    }

    public void setNorms_id(Integer norms_id) {
        this.norms_id = norms_id;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public String getNorms_text() {
        return norms_text;
    }

    public void setNorms_text(String norms_text) {
        this.norms_text = norms_text;
    }

    public BigDecimal getNorms_price() {
        return norms_price;
    }

    public void setNorms_price(BigDecimal norms_price) {
        this.norms_price = norms_price;
    }

    public String getNorms_img() {
        return norms_img;
    }

    public void setNorms_img(String norms_img) {
        this.norms_img = norms_img;
    }

    public Norms(Integer norms_id, Integer goods_id, String norms_text, BigDecimal norms_price, String norms_img) {
        this.norms_id = norms_id;
        this.goods_id = goods_id;
        this.norms_text = norms_text;
        this.norms_price = norms_price;
        this.norms_img = norms_img;
    }

    public Norms() {
    }

    @Override
    public String toString() {
        return "Norms{" +
                "norms_id=" + norms_id +
                ", goods_id=" + goods_id +
                ", norms_text='" + norms_text + '\'' +
                ", norms_price=" + norms_price +
                ", norms_img='" + norms_img + '\'' +
                '}';
    }
}
