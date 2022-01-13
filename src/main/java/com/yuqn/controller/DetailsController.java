package com.yuqn.controller;

import com.yuqn.entity.Details;
import com.yuqn.service.DetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class DetailsController {
    @Resource
    private DetailsService detailsService;

    @RequestMapping(value = "/selDetails.do",method = RequestMethod.POST)
    @ResponseBody
    public Details selDetails(Integer goods_id){
        Details details=detailsService.selDetails(goods_id);
        return details;
    }
//    商家添加详情跳转admAddDet
@RequestMapping(value = "/admAddDet.do")
public ModelAndView admAddDet(Integer goods_id){
    ModelAndView mv=new ModelAndView();
    mv.addObject("goods_id",goods_id);
    mv.setViewName("/admin/adddet");
    return mv;
}
    //    商家修改商品图片
    @RequestMapping(value = "/admAddDetGo.do",method = RequestMethod.POST)
    public ModelAndView admAddDetGo(Integer goods_id, MultipartFile details_one, MultipartFile details_two, MultipartFile details_three, MultipartFile details_four, MultipartFile details_five,String details_text,String  details_price){
        String str=detailsService.admAddDetGo(goods_id, details_one, details_two, details_three, details_four, details_five, details_text, details_price);
        ModelAndView mv=new ModelAndView();
        mv.addObject("str",str);
        mv.setViewName("/admin/status");
        return mv;
    }
    //    商家修改详情跳转admUpDet
    @RequestMapping(value = "/admUpDet.do")
    public ModelAndView admUpDet(Integer goods_id){
        ModelAndView mv=new ModelAndView();
        mv.addObject("goods_id",goods_id);
        mv.setViewName("/admin/updet");
        return mv;
    }
    //    商家修改商品详情
    @RequestMapping(value = "/admUpDetGo.do",method = RequestMethod.POST)
    public ModelAndView admUpDetGo(Integer goods_id, MultipartFile details_one, MultipartFile details_two, MultipartFile details_three, MultipartFile details_four, MultipartFile details_five,String details_text,String details_price){
        String str=detailsService.admUpDetGo(goods_id,details_one,details_two,details_three,details_four,details_five,details_text,details_price);
        ModelAndView mv=new ModelAndView();
        mv.addObject("str",str);
        mv.setViewName("/admin/status");
        return mv;
    }
}
