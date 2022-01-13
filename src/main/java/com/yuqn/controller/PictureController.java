package com.yuqn.controller;

import com.yuqn.service.PictureService;
import com.yuqn.utils.UploadUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.math.BigInteger;

@Controller
public class PictureController {
    @Resource
    private PictureService pictureService;
    //    商家添加图片页面跳转admAddPic
    @RequestMapping(value = "/admAddPic.do")
    public ModelAndView admAddPic(Integer goods_id){
        ModelAndView mv=new ModelAndView();
        mv.addObject("goods_id",goods_id);
        mv.setViewName("/admin/addpic");
        return mv;
    }
    //    商家添加商品图片admAddPicGo
    @RequestMapping(value = "/admAddPicGo.do",method = RequestMethod.POST)
    public ModelAndView admAddPicGo(Integer goods_id, MultipartFile picture_one,MultipartFile picture_two,MultipartFile picture_three,MultipartFile picture_four,MultipartFile picture_five){
        String str=pictureService.admAddPicGo(goods_id, picture_one, picture_two, picture_three, picture_four, picture_five);
        ModelAndView mv=new ModelAndView();
        mv.addObject("str",str);
        mv.setViewName("/admin/status");
        return mv;
    }
    //    商家跳转修改商品页面admUpPic
    @RequestMapping(value = "/admUpPic.do")
    public ModelAndView admUpPic(Integer goods_id){
        ModelAndView mv=new ModelAndView();
        mv.addObject("goods_id",goods_id);
        mv.setViewName("/admin/uppic");
        return mv;
    }
    //    商家修改商品图片
    @RequestMapping(value = "/admUpPicGo.do",method = RequestMethod.POST)
    public ModelAndView admUpPicGo(Integer goods_id, MultipartFile picture_one,MultipartFile picture_two,MultipartFile picture_three,MultipartFile picture_four,MultipartFile picture_five){
        String str=pictureService.admUpPicGo(goods_id, picture_one, picture_two, picture_three, picture_four, picture_five);
        ModelAndView mv=new ModelAndView();
        mv.addObject("str",str);
        mv.setViewName("/admin/status");
        return mv;
    }
}
