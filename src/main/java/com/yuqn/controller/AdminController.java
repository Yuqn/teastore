package com.yuqn.controller;

import com.yuqn.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.Random;

@Controller
public class AdminController {
    @Resource
    private AdminService adminService;
    @RequestMapping(value = "/admLogin.do",method = RequestMethod.POST)
    public ModelAndView admlogin(BigInteger admin_card,String admin_password){
        String str=adminService.adminLogin(admin_card,admin_password);
        ModelAndView mv=new ModelAndView();
        mv.setViewName(str);
        return mv;
    }
//    返回主页goAdmMy
@RequestMapping(value = "/goAdmMy.do")
public ModelAndView goAdmMy(){
    ModelAndView mv=new ModelAndView();
    mv.setViewName("/admin/index");
    return mv;
}
//跳转查询未发货订单页面orderbef.do
@RequestMapping(value = "/orderbef.do")
public ModelAndView orderbef(){
    ModelAndView mv=new ModelAndView();
    mv.setViewName("/admin/orderbef");
    return mv;
}

    //跳转查询以发货页面orderaf.do
    @RequestMapping(value = "/orderaf.do")
    public ModelAndView orderaf(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("/admin/orderaf");
        return mv;
    }
}
