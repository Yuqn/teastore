package com.yuqn.service;

import com.yuqn.entity.Goods;
import com.yuqn.vo.GoodsDetail;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.util.List;

public interface GoodsService {
//    查询六条商品信息，并且返回到控制器
    public List<Goods> selectGoods();
//    返回商品的基本信息，图片信息和详情信息
    public GoodsDetail goodsDetail(Integer goodsId);
//    名称搜索商品
    public List<Goods> GoodsSousuo(String goods_name);
//    类型搜索商品
    public List<Goods> GoodssousuoType(String type_name);
//    商家点击查询全部商品
    public List<Goods> admGoodsSel();
//    查询已上/下架的商品
    public List<Goods> adGoodsGro(Integer is_ground);
//  商家其他操作
    public List<GoodsDetail> admSelGoods();
//    商家上架、下架商品
    public String upGoods(Integer goods_id,Integer is_ground);
//    商家添加商品
    public String admAddGoods(String type_name, BigDecimal goods_price, String goods_name, String goods_suggest, MultipartFile def_id);
//    商家删除物品
    public String admRemGoods(Integer goods_id);
//    商家一键下架商品
    public String admDownGo(Integer[]goods_id);
//    商家一键上架商品
    public String admUpGo(Integer[]goods_id);
}
