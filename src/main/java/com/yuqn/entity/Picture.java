package com.yuqn.entity;

public class Picture {
//    种类id
    private Integer picture_id;
//    商品id
    private Integer goods_id;
//    商品图片
    private String picture_one;
    private String picture_two;
    private String picture_three;
    private String picture_four;
    private String picture_five;

    public Integer getPicture_id() {
        return picture_id;
    }

    public void setPicture_id(Integer picture_id) {
        this.picture_id = picture_id;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
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

    public Picture(Integer picture_id, Integer goods_id, String picture_one, String picture_two, String picture_three, String picture_four, String picture_five) {
        this.picture_id = picture_id;
        this.goods_id = goods_id;
        this.picture_one = picture_one;
        this.picture_two = picture_two;
        this.picture_three = picture_three;
        this.picture_four = picture_four;
        this.picture_five = picture_five;
    }

    public Picture() {
    }

    @Override
    public String toString() {
        return "Picture{" +
                "picture_id=" + picture_id +
                ", goods_id=" + goods_id +
                ", picture_one='" + picture_one + '\'' +
                ", picture_two='" + picture_two + '\'' +
                ", picture_three='" + picture_three + '\'' +
                ", picture_four='" + picture_four + '\'' +
                ", picture_five='" + picture_five + '\'' +
                '}';
    }
}
