package com.yuqn.service;

import com.yuqn.entity.User;

import java.math.BigInteger;
import java.util.List;

public interface UserLoginService {
//    用户注册
    public String addUser(BigInteger phone, String password,Integer message);
//    判断是否登录
    public String  ifLogin(BigInteger phone, String password);
//    修改密码
    public String upUserPaw(String password,String newPad);
//    修改昵称
    public String upUserName(String name);
//    修改信息
    public String upUserMem(BigInteger userPhone,BigInteger card,String email,String name);
//    查询用户资料
    public User selUser();
//    注册会员
    public String addMem(BigInteger member_card,String member_email,String member_name);
//    注册查询是否有该用户的信息
    public Integer ifHasUser(BigInteger phone);
//    查询找回密码是否有该用户信息
    public Integer ifHasUserForBack(BigInteger phone);
//    用户找回密码
    public String goBack(BigInteger phone, String password,Integer message);
}
