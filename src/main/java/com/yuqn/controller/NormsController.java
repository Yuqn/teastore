package com.yuqn.controller;

import com.yuqn.entity.Norms;
import com.yuqn.service.NormsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@Controller
public class NormsController {
    @Resource
    private NormsService normsService;
    @RequestMapping(value = "/normsAjax.do",method = RequestMethod.POST)
    @ResponseBody
    public List<Norms> normsAjAX(Integer goods_id){
        List<Norms> norms=normsService.selNorms(goods_id);
        return norms;
    }
    //    商家添加规格页面跳转addNorms
    @RequestMapping(value = "/addNorms.do")
    public ModelAndView addNorms(Integer goods_id){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("/admin/addnorms");
        mv.addObject("goods_id",goods_id);
        return mv;
    }
//    商家添加商品规格NormsY
@RequestMapping(value = "/NormsY.do",method = RequestMethod.POST)
@ResponseBody
public ModelAndView NormsY(Integer goods_id, String norms_text, BigDecimal norms_price){
        String str=normsService.NormsY(goods_id,norms_text,norms_price);
        ModelAndView mv=new ModelAndView();
        mv.addObject("str",str);
        mv.setViewName("/admin/status");
    return mv;
}
}
