package com.yuqn.service.impl;

import com.yuqn.dao.GoodsDao;
import com.yuqn.entity.Goods;
import com.yuqn.service.GoodsService;
import com.yuqn.utils.UploadUtils;
import com.yuqn.vo.GoodsDetail;
import com.yuqn.vo.GoodsId;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsDao goodsDao;

    @Override
    public List<Goods> selectGoods() {
        List<Goods>goods=goodsDao.selGoods();
        return goods;
    }

    @Override
    public GoodsDetail goodsDetail(Integer goodId) {
        GoodsId goodsId=new GoodsId(goodId);
        GoodsDetail goodsDetail= goodsDao.GoodsDetails(goodsId);
//        System.out.println(goodsDetail);
//        System.out.println(goodsDetail);
        if (goodsDetail==null){
//            System.out.println("找不到商品");
        }
        return goodsDetail;
    }

    @Override
    public List<Goods> GoodsSousuo(String goods_name) {
        Goods goods=new Goods();
        goods.setGoods_name(goods_name);
        List<Goods> goods1=goodsDao.GoodsSousuo(goods);
        return goods1;
    }

    @Override
    public List<Goods> GoodssousuoType(String type_name) {
        Goods goods=new Goods();
        goods.setType_name(type_name);
        List<Goods> goods1=goodsDao.GoodsSousuo(goods);
        return goods1;
    }

    @Override
    public List<Goods> admGoodsSel() {
        Goods goods=new Goods();
        List<Goods> goods1=goodsDao.admGoodsSel(goods);
        return goods1;
    }

    @Override
    public List<Goods> adGoodsGro(Integer is_ground) {
        Goods goods=new Goods();
        goods.setIs_ground(is_ground);
        List<Goods> goods1=goodsDao.admGoodsSel(goods);
        return goods1;
    }

    @Override
    public List<GoodsDetail> admSelGoods() {
        List<GoodsDetail> goodsDetails=goodsDao.admSelGoods();
        return goodsDetails;
    }

    @Override
    public String upGoods(Integer goods_id, Integer is_ground) {
        String str="修改失败，请联系工作人员";
        Goods goods=new Goods();
        goods.setGoods_id(goods_id);
        goods.setIs_ground(is_ground);
        Integer integer=goodsDao.upGoods(goods);
        if(integer==1){
            str="操作成功，请返回查看";
        }
        return str;
    }

    @Override
    public String admAddGoods(String type_name, BigDecimal goods_price, String goods_name, String goods_suggest, MultipartFile def_id) {
        String str1="添加失败，请联系管理员";
        UploadUtils uploadUtils=new UploadUtils();
        String str=uploadUtils.upload(def_id);
        Goods goods=new Goods();
        goods.setDef_id(str);
        goods.setGoods_name(goods_name);
        goods.setType_name(type_name);
        goods.setGoods_suggest(goods_suggest);
        goods.setGoods_price(goods_price);
        Integer integer=goodsDao.admAddGoods(goods);
        if(integer!=1){
            str1="添加失败，请联系管理员";
        }else {
            str1="添加成功";
        }
        return str1;
    }

    @Override
    public String admRemGoods(Integer goods_id) {
        String str="";
        GoodsId goodsId=new GoodsId(goods_id);
        Integer integer=goodsDao.admRemGoods(goodsId);
        if(integer!=1){
            str="删除失败，请联系管理员";
        }else {
            str="删除成功";
        }
        return str;
    }
//商家一键下架
    @Override
    public String admDownGo(Integer[] goods_id) {
        Goods goods=new Goods();
        goods.setIs_ground(0);
        for (Integer goods_id1:goods_id){
            goods.setGoods_id(goods_id1);
            goodsDao.upGoods(goods);
        }
        return "下架成功";
    }
//商家一键上架
    @Override
    public String admUpGo(Integer[] goods_id) {
        Goods goods=new Goods();
        goods.setIs_ground(1);
        for (Integer goods_id1:goods_id){
            goods.setGoods_id(goods_id1);
            goodsDao.upGoods(goods);
        }
        return "上架成功";
    }
}
