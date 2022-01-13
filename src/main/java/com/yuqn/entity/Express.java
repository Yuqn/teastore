package com.yuqn.entity;

public class Express {
    public Integer express_id;
    public Integer orders_number;
    public Integer express_number;

    public Integer getExpress_id() {
        return express_id;
    }

    public void setExpress_id(Integer express_id) {
        this.express_id = express_id;
    }

    public Integer getOrders_number() {
        return orders_number;
    }

    public void setOrders_number(Integer orders_number) {
        this.orders_number = orders_number;
    }

    public Integer getExpress_number() {
        return express_number;
    }

    public void setExpress_number(Integer express_number) {
        this.express_number = express_number;
    }

    public Express(Integer express_id, Integer orders_number, Integer express_number) {
        this.express_id = express_id;
        this.orders_number = orders_number;
        this.express_number = express_number;
    }

    public Express() {
    }

    @Override
    public String toString() {
        return "Express{" +
                "express_id=" + express_id +
                ", orders_number=" + orders_number +
                ", express_number=" + express_number +
                '}';
    }
}
