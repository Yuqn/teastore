package com.yuqn.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.org.apache.xpath.internal.operations.Mod;
import com.yuqn.entity.Orders;
import com.yuqn.service.OrdersService;
import com.yuqn.vo.GoodsNo;
import com.yuqn.vo.OrderBefAndAf;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class OrderController {
    @Resource
    private OrdersService ordersService;

    @RequestMapping(value = "/goForm.do",method = RequestMethod.POST,produces="text/plain;charset=utf-8")
    @ResponseBody
    public ModelAndView addOrder(Integer goods_num,Integer norms_id,Integer address_id,Integer goods_id){
        int addNum=ordersService.addOrders(goods_id,norms_id,goods_num,address_id);
        ModelAndView mv=new ModelAndView();
        if (addNum==1){
            mv.addObject("str","添加购物车成功");
        }
        else {
            mv.addObject("str","添加购物车失败");
        }
        mv.setViewName("user/status");
        return mv;
    }
//    查询所有订单
@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
@RequestMapping(value = "/OrderAll.do",method = RequestMethod.POST)
@ResponseBody
public List<GoodsNo> OrderAll(){
    List<GoodsNo> goodsNos=ordersService.SelOrderAll();
    return goodsNos;
}
//    查询未支付订单
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @RequestMapping(value = "/OrderNo.do",method = RequestMethod.POST)
    @ResponseBody
    public List<GoodsNo> OrderNo(){
        List<GoodsNo> goodsNos=ordersService.SelOrderNo();
        return goodsNos;
    }

    //    查询未发货订单
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @RequestMapping(value = "/orderGo.do",method = RequestMethod.POST)
    @ResponseBody
    public List<GoodsNo> orderGo(){
        List<GoodsNo> goodsNos=ordersService.SelOrderGo();
        return goodsNos;
    }

//    查询待收货SelOrderAcc
@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
@RequestMapping(value = "/SelOrderAcc.do",method = RequestMethod.POST)
@ResponseBody
public List<GoodsNo> SelOrderAcc(){
    List<GoodsNo> goodsNos=ordersService.SelOrderAcc();
    return goodsNos;
}
    //    查询待收货SelOrderBef
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @RequestMapping(value = "/SelOrderBef.do",method = RequestMethod.POST)
    @ResponseBody
    public List<GoodsNo> SelOrderBef(){
        List<GoodsNo> goodsNos=ordersService.SelOrderBef();
        return goodsNos;
    }
//    删除未支付订单
@RequestMapping(value = "/reOrders.do")
@ResponseBody
public ModelAndView addOrder(Integer orders_id){
    String str=ordersService.reOrders(orders_id);
    ModelAndView mv=new ModelAndView();
    mv.addObject("str",str);
    mv.setViewName("user/status");
    return mv;
}
    //    商家查询全部未发货订单selOrderBefAndAf
    @RequestMapping(value = "/selOrderBefAndAf.do")
    @ResponseBody
    public List<OrderBefAndAf> selOrderBefAndAf(){
        return ordersService.selOrderBefAndAf(1,0);
    }
    //    商家查询指定商品未发货订单selOrderBefAndAfNum
    @RequestMapping(value = "/selOrderBefAndAfNum.do")
    @ResponseBody
    public List<OrderBefAndAf> selOrderBefAndAfNum(Integer orders_number){
        return ordersService.selOrderBefAndAfNum(1,0,orders_number);
    }

    //    商家查询全部已发货订单selOrderAf
    @RequestMapping(value = "/selOrderAf.do")
    @ResponseBody
    public List<OrderBefAndAf> selOrderAf(){
        List<OrderBefAndAf> orderBefAndAfs=ordersService.selOrderBefAndAf(1,1);
        List<OrderBefAndAf> orderBefAndAfs2=ordersService.selOrderBefAndAf(1,2);
        orderBefAndAfs.addAll(orderBefAndAfs2);
        return orderBefAndAfs;
    }
    //    商家查询指定商品未发货订单selOrderAfNum
    @RequestMapping(value = "/selOrderAfNum.do")
    @ResponseBody
    public List<OrderBefAndAf> selOrderAfNum(Integer orders_number){
        List<OrderBefAndAf> orderBefAndAfs=ordersService.selOrderBefAndAfNum(1,1,orders_number);
        List<OrderBefAndAf> orderBefAndAfs2=ordersService.selOrderBefAndAfNum(1,2,orders_number);
        orderBefAndAfs.addAll(orderBefAndAfs2);
        return orderBefAndAfs;
    }
    //    订单支付payOrder.do
    @RequestMapping(value = "/payOrder.do")
    public ModelAndView payOrder(Integer orders_number){
        System.out.println(orders_number);
        String str=ordersService.payOrder(orders_number);
        ModelAndView mv=new ModelAndView();
        mv.setViewName("/user/status");
        mv.addObject("str",str);
        return mv;
    }
}
