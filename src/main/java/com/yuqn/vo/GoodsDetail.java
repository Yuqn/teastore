package com.yuqn.vo;

import java.math.BigDecimal;

public class GoodsDetail {
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
    //    图片id
    private Integer picture_id;
    //    详情id
    private Integer details_id;
    //    商品图片
    private String picture_one;
    private String picture_two;
    private String picture_three;
    private String picture_four;
    private String picture_five;
    //    商品详情图片
    private String details_one;
    private String details_two;
    private String details_three;
    private String details_four;
    private String details_five;
    //    详细信息
    private String details_text;
    //    价格说明
    private String details_price;

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

    public Integer getPicture_id() {
        return picture_id;
    }

    public void setPicture_id(Integer picture_id) {
        this.picture_id = picture_id;
    }

    public Integer getDetails_id() {
        return details_id;
    }

    public void setDetails_id(Integer details_id) {
        this.details_id = details_id;
    }

    public String getPicture_one() {
        return picture_one;
    }

    public void setPicture_one(String picture_one) {
        this.picture_one = picture_one;
    }

    public String getPicture_two() {
        return picture_two;
    }

    public void setPicture_two(String picture_two) {
        this.picture_two = picture_two;
    }

    public String getPicture_three() {
        return picture_three;
    }

    public void setPicture_three(String picture_three) {
        this.picture_three = picture_three;
    }

    public String getPicture_four() {
        return picture_four;
    }

    public void setPicture_four(String picture_four) {
        this.picture_four = picture_four;
    }

    public String getPicture_five() {
        return picture_five;
    }

    public void setPicture_five(String picture_five) {
        this.picture_five = picture_five;
    }

    public String getDetails_one() {
        return details_one;
    }

    public void setDetails_one(String details_one) {
        this.details_one = details_one;
    }

    public String getDetails_two() {
        return details_two;
    }

    public void setDetails_two(String details_two) {
        this.details_two = details_two;
    }

    public String getDetails_three() {
        return details_three;
    }

    public void setDetails_three(String details_three) {
        this.details_three = details_three;
    }

    public String getDetails_four() {
        return details_four;
    }

    public void setDetails_four(String details_four) {
        this.details_four = details_four;
    }

    public String getDetails_five() {
        return details_five;
    }

    public void setDetails_five(String details_five) {
        this.details_five = details_five;
    }

    public String getDetails_text() {
        return details_text;
    }

    public void setDetails_text(String details_text) {
        this.details_text = details_text;
    }

    public String getDetails_price() {
        return details_price;
    }

    public void setDetails_price(String details_price) {
        this.details_price = details_price;
    }

    public GoodsDetail(Integer goods_id, String type_name, BigDecimal goods_price, String goods_name, String goods_suggest, Integer is_ground, String def_id, Integer picture_id, Integer details_id, String picture_one, String picture_two, String picture_three, String picture_four, String picture_five, String details_one, String details_two, String details_three, String details_four, String details_five, String details_text, String details_price) {
        this.goods_id = goods_id;
        this.type_name = type_name;
        this.goods_price = goods_price;
        this.goods_name = goods_name;
        this.goods_suggest = goods_suggest;
        this.is_ground = is_ground;
        this.def_id = def_id;
        this.picture_id = picture_id;
        this.details_id = details_id;
        this.picture_one = picture_one;
        this.picture_two = picture_two;
        this.picture_three = picture_three;
        this.picture_four = picture_four;
        this.picture_five = picture_five;
        this.details_one = details_one;
        this.details_two = details_two;
        this.details_three = details_three;
        this.details_four = details_four;
        this.details_five = details_five;
        this.details_text = details_text;
        this.details_price = details_price;
    }

    public GoodsDetail() {
    }

    @Override
    public String toString() {
        return "GoodsDetail{" +
                "goods_id=" + goods_id +
                ", type_name='" + type_name + '\'' +
                ", goods_price=" + goods_price +
                ", goods_name='" + goods_name + '\'' +
                ", goods_suggest='" + goods_suggest + '\'' +
                ", is_ground=" + is_ground +
                ", def_id='" + def_id + '\'' +
                ", picture_id=" + picture_id +
                ", details_id=" + details_id +
                ", picture_one='" + picture_one + '\'' +
                ", picture_two='" + picture_two + '\'' +
                ", picture_three='" + picture_three + '\'' +
                ", picture_four='" + picture_four + '\'' +
                ", picture_five='" + picture_five + '\'' +
                ", details_one='" + details_one + '\'' +
                ", details_two='" + details_two + '\'' +
                ", details_three='" + details_three + '\'' +
                ", details_four='" + details_four + '\'' +
                ", details_five='" + details_five + '\'' +
                ", details_text='" + details_text + '\'' +
                ", details_price='" + details_price + '\'' +
                '}';
    }
}
