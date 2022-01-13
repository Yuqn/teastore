package com.yuqn.entity;

public class Details {
//    详情表id
    private Integer details_id;
//    商品id
    private Integer goods_id;
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

    public Integer getDetails_id() {
        return details_id;
    }

    public void setDetails_id(Integer details_id) {
        this.details_id = details_id;
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

    public Details(Integer goods_id, Integer details_id, String details_one, String details_two, String details_three, String details_four, String details_five, String details_text, String details_price) {
        this.goods_id = goods_id;
        this.details_id = details_id;
        this.details_one = details_one;
        this.details_two = details_two;
        this.details_three = details_three;
        this.details_four = details_four;
        this.details_five = details_five;
        this.details_text = details_text;
        this.details_price = details_price;
    }

    public Details() {
    }

    @Override
    public String toString() {
        return "Details{" +
                "goods_id=" + goods_id +
                ", details_id=" + details_id +
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
