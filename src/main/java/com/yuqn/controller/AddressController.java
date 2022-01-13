package com.yuqn.controller;

import com.yuqn.entity.Address;
import com.yuqn.service.AddressService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.List;

@Controller
public class AddressController {
    @Resource
    private AddressService addressService;

    @RequestMapping(value = "/selAdd.do",method = RequestMethod.POST)
    @ResponseBody
    public List<Address> selAddress(){
        List<Address> addresses=addressService.selAddress();
        return addresses;
    }
//    跳转地址详情页goMyAdd
@RequestMapping(value = "/goMyAdd.do")
public ModelAndView goMyAdd(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("user/address");
    return mv;
}
//删除地址
@RequestMapping(value = "/reAdd.do")
public ModelAndView reAdd(Integer address_id){
        String str=addressService.reAddress(address_id);
    ModelAndView mv=new ModelAndView();
    mv.setViewName(str);
    return mv;
}
//添加地址addAddress
@RequestMapping(value = "/addAddress.do",method = RequestMethod.POST)
public ModelAndView addAddress(String address_name, String address_area, String address_minute, BigInteger address_phone,Integer address_code){
        Integer addAum=addressService.addAddress(address_name,address_area,address_minute,address_phone,address_code);
        ModelAndView mv=new ModelAndView();
        mv.setViewName("user/address");
        return mv;
}
//修改地址
@RequestMapping(value = "/goUpAdd.do")
public ModelAndView goUpAdd(Integer address_id){
    Address address=addressService.selAdd(address_id);
    ModelAndView mv=new ModelAndView();
    mv.setViewName("user/upAddress");
    mv.addObject("address",address);
    return mv;
}
@RequestMapping(value = "/upAddress.do",method = RequestMethod.POST)
public ModelAndView upAddress(Integer address_id,String address_name,String address_area,String address_minute,BigInteger address_phone,Integer address_code){
        Address address=new Address();
        Integer upNum=addressService.upAddress(address_id,address_name,address_area,address_minute,address_code,address_phone);
        ModelAndView mv=new ModelAndView();
        if (upNum==1){
            mv.setViewName("user/address");
        }else {
            mv.setViewName("user/upAddress");
        }

    return mv;
}

}
