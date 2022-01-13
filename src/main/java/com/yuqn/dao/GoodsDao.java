package com.yuqn.dao;

import com.yuqn.entity.Goods;
import com.yuqn.vo.GoodsDetail;
import com.yuqn.vo.GoodsId;

import java.util.List;

public interface GoodsDao {
//    查看随机六条上架中商品记录
    public List<Goods> selGoods();
//    查询指定商品的信息
    public GoodsDetail GoodsDetails(GoodsId goodsId);
//    搜索商品
    public List<Goods> GoodsSousuo(Goods goods);
//    查询商品价格
    public Goods goodsSel(Goods goods);
//    商家查询商品信息
    public List<Goods> admGoodsSel(Goods goods);
//    商家查询商品有没有指定详情表和图片表
    public List<GoodsDetail> admSelGoods();
//    商家上/下架商品
    public int upGoods(Goods goods);
//    商家添加商品
    public int admAddGoods(Goods goods);
//    商家删除商品
    public Integer admRemGoods(GoodsId goodsId);
}
