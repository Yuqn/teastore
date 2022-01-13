package com.yuqn.service;

import com.yuqn.entity.Norms;

import java.math.BigDecimal;
import java.util.List;

public interface NormsService {
//    根据id查询对应种类
    public List<Norms> selNorms(Integer goods_id);
//    商家添加规格,价格，介绍，价钱
    public String NormsY(Integer goods_id, String norms_text, BigDecimal norms_price);
}
