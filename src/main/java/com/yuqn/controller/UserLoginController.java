package com.yuqn.controller;

import com.yuqn.entity.User;
import com.yuqn.service.UserLoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigInteger;

@Controller
public class UserLoginController {
    @Resource
    private UserLoginService userLoginService;

    @RequestMapping(value = "/login.do",method = RequestMethod.POST)
    public ModelAndView userLogin(HttpServletRequest request, String phone, String password){
//        System.out.println("login........");
        ModelAndView mv=new ModelAndView();
        BigInteger user_phone=new BigInteger(phone);
        String user_password=password;
//        request.getSession().setAttribute("user_phone",phone);
        String str=userLoginService.ifLogin(user_phone,user_password);
            mv.setViewName("/user/status");
            mv.addObject("str",str);
        return mv;
    }
    //    注册新用户短信验证useradd
    @RequestMapping(value = "/useradd.do",method = RequestMethod.POST)
    public ModelAndView useradd(BigInteger phone){
        Integer userNum=userLoginService.ifHasUser(phone);
        ModelAndView mv=new ModelAndView();
        if (userNum==0){
            mv.addObject("user_phone",phone);
            mv.setViewName("/user/useraddPwd");
        }else {
            mv.setViewName("/user/status");
            mv.addObject("str","该号码已经注册过了，请登录");
        }
        return mv;
    }
//    找回密码获取验证码backUser.do
    @RequestMapping(value = "/backUser.do",method = RequestMethod.POST)
    public ModelAndView backUser(BigInteger phone){
        Integer userNum=userLoginService.ifHasUserForBack(phone);
        ModelAndView mv=new ModelAndView();
        if (userNum!=0){
            mv.addObject("user_phone",phone);
            mv.setViewName("/user/backuppwd");
        }else {
            mv.setViewName("/user/status");
            mv.addObject("str","该号码未注册过，请前往注册");
        }
        return mv;
    }
    //    输入新密码找回密码功能goBack.do
    @RequestMapping(value = "/goBack.do",method = RequestMethod.POST)
    public ModelAndView goBack(BigInteger user_phone,Integer message,String password){
        ModelAndView mv=new ModelAndView();
        String str=userLoginService.goBack(user_phone,password,message);
        mv.addObject("str",str);
        mv.setViewName("/user/status");
        return mv;
    }
    //    验证正确后输入密码goAdd注册
    @RequestMapping(value = "/goAdd.do",method = RequestMethod.POST)
    public ModelAndView goAdd(BigInteger user_phone,Integer message,String password){
        ModelAndView mv=new ModelAndView();
        String str=userLoginService.addUser(user_phone,password,message);
        mv.addObject("str",str);
        mv.setViewName("/user/status");
        return mv;
    }

    @RequestMapping(value = "/add.do",method = RequestMethod.POST)
    public ModelAndView adduser(BigInteger phone,String password,String name){
        ModelAndView mv=new ModelAndView();
//        String str=userLoginService.addUser(phone,password,name);
//        System.out.println(str);
        return mv;
    }
//    修改密码
    @RequestMapping(value = "/up.do",method = RequestMethod.POST)
    public ModelAndView uppad(String password,String newPassword){
        ModelAndView mv=new ModelAndView();
        String str=userLoginService.upUserPaw(password,newPassword);
        mv.addObject("str",str);
        mv.setViewName("user/status");
        return mv;
    }
//    修改昵称
@RequestMapping(value = "/upName.do",method = RequestMethod.POST)
public ModelAndView upName(String user_name){
    ModelAndView mv=new ModelAndView();
    String str=userLoginService.upUserName(user_name);
    mv.addObject("str",str);
    mv.setViewName("user/status");
    return mv;
}
//注册会员
@RequestMapping(value = "/men.do",method = RequestMethod.POST)
public ModelAndView men(String member_name,BigInteger member_code,String member_email){
    ModelAndView mv=new ModelAndView();
    String str=userLoginService.addMem(member_code,member_email,member_name);
    mv.setViewName("user/status");
    mv.addObject("str",str);
    return mv;
}
//    个人页的加载
@RequestMapping(value = "/selUser.do",method = RequestMethod.POST)
@ResponseBody
    public User selUser(){
        User user=userLoginService.selUser();
        return user;
    }


}
