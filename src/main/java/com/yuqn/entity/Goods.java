package com.yuqn.entity;

import java.math.BigDecimal;

public class Goods {
//    商品id
    private Integer goods_id;
//    商品类型
    private String type_name;
//    商品价格
    private BigDecimal goods_price;
//    商品名称
    private String goods_name;
//    商品介绍
    private String goods_suggest;
//    是否上架
    private Integer is_ground;
//    默认图片
    private String def_id;

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public BigDecimal getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(BigDecimal goods_price) {
        this.goods_price = goods_price;
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

    public Integer getIs_ground() {
        return is_ground;
    }

    public void setIs_ground(Integer is_ground) {
        this.is_ground = is_ground;
    }

    public String getDef_id() {
        return def_id;
    }

    public void setDef_id(String def_id) {
        this.def_id = def_id;
    }

    public Goods(Integer goods_id, String type_name, BigDecimal goods_price, String goods_name, String goods_suggest, Integer is_ground, String def_id) {
        this.goods_id = goods_id;
        this.type_name = type_name;
        this.goods_price = goods_price;
        this.goods_name = goods_name;
        this.goods_suggest = goods_suggest;
        this.is_ground = is_ground;
        this.def_id = def_id;
    }

    public Goods() {
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goods_id=" + goods_id +
                ", type_name='" + type_name + '\'' +
                ", goods_price=" + goods_price +
                ", goods_name='" + goods_name + '\'' +
                ", goods_suggest='" + goods_suggest + '\'' +
                ", is_ground=" + is_ground +
                ", def_id='" + def_id + '\'' +
                '}';
    }
}
