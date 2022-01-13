package com.yuqn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GoMyController {
    @RequestMapping(value = "/goMy.do")
    public ModelAndView goMy(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("user/my");
        return mv;
    }
    @RequestMapping(value = "/goMyOrderData.do")
    public ModelAndView goMyOrderData(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("user/orderData");
        return mv;
    }
    //    修改资料页面goMyText
    @RequestMapping(value = "/goMyText.do")
    public ModelAndView goMyText(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("user/upMyText");
        return mv;
    }
}
