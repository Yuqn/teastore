package com.yuqn.dao;

import com.yuqn.entity.Norms;
import com.yuqn.vo.GoodsId;

import java.util.List;

public interface NormsDao {
//    查询商品的种类
    public List<Norms> selNorms(GoodsId goodsId);
//    根据id查询价格
    public Norms selPri(Norms norms);
//    商家添加规格
    public Integer NormsY(Norms norms);
}
