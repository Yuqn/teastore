package com.yuqn.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.yuqn.entity.Goods;
import com.yuqn.entity.Norms;
import com.yuqn.entity.Student;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import com.yuqn.service.GoodsService;
import com.yuqn.service.NormsService;
import com.yuqn.utils.UploadUtils;
import com.yuqn.vo.GoodsDetail;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class GoodsSelectController {
    @Resource
    private GoodsService goodsService;
    @Resource
    private NormsService normsService;

//    ajax请求返回五条商品信息
    @RequestMapping(value = "/goodAjax.do")
    @ResponseBody
    public List<Goods> selectGood(){
        List<Goods> goods=goodsService.selectGoods();
        return goods;
    }
//    跳转详情页
    @RequestMapping(value = "/goodsDetails.do")
    public ModelAndView goodsDetails(Integer goods_id){
//        System.out.println("前端传递的参数:"+goods_id);
        GoodsDetail goodsDetail=goodsService.goodsDetail(goods_id);
        List<Norms> norms=normsService.selNorms(goods_id);
        ModelAndView mv=new ModelAndView();
        mv.addObject("goodDet",goodsDetail);
        mv.addObject("norms",norms);
        mv.setViewName("user/details");
        return mv;
    }
//    名称搜索商品
    @RequestMapping(value = "/goodpriceDiv.do",method = RequestMethod.GET)
    @ResponseBody
    public List<Goods> goodssousuo(String goods_name){
        List<Goods> goods=goodsService.GoodsSousuo(goods_name);
        return goods;
    }
//    类型搜索商品
    @RequestMapping(value = "/goodpriceDivType.do",method = RequestMethod.GET)
    @ResponseBody
    public List<Goods> goodssousuoType(String goods_type){
        List<Goods> goods=goodsService.GoodssousuoType(goods_type);
        return goods;
    }

    @RequestMapping(value = "/goods.do",method = RequestMethod.POST)
    public ModelAndView good(){
        List<Goods> goods=goodsService.selectGoods();
        return null;
    }
//商家点击查询全部商品
    @RequestMapping(value = "/admGoodsSel.do",method = RequestMethod.POST)
    @ResponseBody
    public List<Goods> admGoodsSel(){
        List<Goods> goods=goodsService.admGoodsSel();
        return goods;
    }
//    商家点击查询上架商品
    @RequestMapping(value = "/selGoodGro.do",method = RequestMethod.POST)
    @ResponseBody
    public List<Goods> admGoodGro(){
        List<Goods> goods=goodsService.adGoodsGro(1);
        return goods;
    }
//    商家点击查询下架商品 selGoodNoGro
@RequestMapping(value = "/selGoodNoGro.do",method = RequestMethod.POST)
@ResponseBody
public List<Goods> selGoodNoGro(){
    List<Goods> goods=goodsService.adGoodsGro(0);
    return goods;
}
//商家其他操作qtUp
@RequestMapping(value = "/qtUp.do",method = RequestMethod.POST)
@ResponseBody
public List<GoodsDetail> qtUp(){
    List<GoodsDetail> goodsDetails=goodsService.admSelGoods();
    return goodsDetails;
}
//商家下架商品upGro
@RequestMapping(value = "/upGro.do")
public ModelAndView upGro(Integer goods_id){
    String str=goodsService.upGoods(goods_id,0);
    ModelAndView mv=new ModelAndView();
    mv.setViewName("/admin/status");
    mv.addObject("str",str);
    return mv;
}
    //商家上架商品downGro
    @RequestMapping(value = "/downGro.do")
    public ModelAndView downGro(Integer goods_id){
        String str=goodsService.upGoods(goods_id,1);
        ModelAndView mv=new ModelAndView();
        mv.setViewName("/admin/status");
        mv.addObject("str",str);
        return mv;
    }


    //商家跳转添加商品addgoods
    @RequestMapping(value = "/addgoods.do")
    public ModelAndView addgoods(Integer goods_id){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("/admin/addgoods");
        return mv;
    }
    //    商家添加商品goodsAdd
    @RequestMapping(value = "/goodsAdd.do",method = RequestMethod.POST)
    public ModelAndView goodsAdd(String goods_name, String type_name, String goods_suggest, BigDecimal goods_price,MultipartFile def_id){
        String str=goodsService.admAddGoods(type_name,goods_price,goods_name,goods_suggest,def_id);
        ModelAndView mv=new ModelAndView();
        mv.addObject("str",str);
        mv.setViewName("/admin/status");
        return mv;
    }
    //    商家删除商品admRemGood
    @RequestMapping(value = "/admRemGood.do")
    public ModelAndView admRemGood(Integer goods_id){
        String str=goodsService.admRemGoods(goods_id);
        ModelAndView mv=new ModelAndView();
        mv.addObject("str",str);
        mv.setViewName("/admin/status");
        return mv;
    }
    //    商家一键下架admDownGo
    @RequestMapping(value = "/admDownGo.do",method = RequestMethod.POST)
    public ModelAndView admDownGo(Integer[] goods_id){
        String str=goodsService.admDownGo(goods_id);
        ModelAndView mv=new ModelAndView();
        mv.addObject("str",str);
        mv.setViewName("/admin/status");
        return mv;
    }
    //    商家一键上架admUpGo
    @RequestMapping(value = "/admUpGo.do",method = RequestMethod.POST)
    public ModelAndView admUpGo(Integer[] goods_id){
        String str=goodsService.admUpGo(goods_id);
        ModelAndView mv=new ModelAndView();
        mv.addObject("str",str);
        mv.setViewName("/admin/status");
        return mv;
    }

}
