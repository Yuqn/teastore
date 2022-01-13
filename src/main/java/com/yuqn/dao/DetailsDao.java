package com.yuqn.dao;

import com.yuqn.entity.Details;
import com.yuqn.entity.Goods;
import com.yuqn.vo.GoodsId;

public interface DetailsDao {
//    查询商品的详情页
    public Details selDetails(GoodsId goodsId);
//    商家添加详情信息
    public Integer admAddDetGo(Details details);
//    商家修改详情信息
    public Integer admUpDetGo(Details details);
}
