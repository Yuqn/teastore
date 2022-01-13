package com.yuqn.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mysql.cj.Session;
import com.yuqn.dao.UserDao;
import com.yuqn.entity.User;
import com.yuqn.service.UserLoginService;
import com.yuqn.utils.CardVer;
import com.yuqn.utils.TextMessage;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.math.BigInteger;
import java.util.List;
import java.util.Random;

@Service
public class UserLoginServiceImpl implements UserLoginService {
    @Resource
    private UserDao userDao;
    @Resource
    private HttpSession session;
//用户注册-----传递电话号码，密码，姓名，返回改用户状态，是否符合注册

    @Override
    public Integer ifHasUser(BigInteger phone) {
        Integer userNum=0;
        User user=new User();
        user.setUser_phone(phone);
        List<User> usersList=userDao.ifHasUser(user);
        for(User user1:usersList){
            if (user1.getUser_phone()!=null){
                userNum+=1;
            }
        }
        if (userNum==0){
            //随机生成四位数验证码
            StringBuilder str1 = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                if (i == 0)
                    str1.append(new Random().nextInt(9) + 1);
                else
                    str1.append(new Random().nextInt(10));
            }
            Integer phone_message=Integer.valueOf(str1.toString());
            TextMessage textMessage=new TextMessage();
            textMessage.TextMes(phone,phone_message);
            session.setAttribute("user_message",phone_message);
        }
        return userNum;
    }
    //    找回密码发送验证消息

    @Override
    public Integer ifHasUserForBack(BigInteger phone) {
        Integer userNum=0;
        User user=new User();
        user.setUser_phone(phone);
        List<User> usersList=userDao.ifHasUser(user);
        for(User user1:usersList){
            if (user1.getUser_phone()!=null){
                userNum+=1;
            }
        }
        if (userNum!=0){
            //随机生成四位数验证码
            StringBuilder str1 = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                if (i == 0)
                    str1.append(new Random().nextInt(9) + 1);
                else
                    str1.append(new Random().nextInt(10));
            }
            Integer phone_message=Integer.valueOf(str1.toString());
            TextMessage textMessage=new TextMessage();
            textMessage.TextMes(phone,phone_message);
            session.setAttribute("user_message",phone_message);
        }
        return userNum;
    }

    //输入密码注册
    @Override
    public String addUser(BigInteger phone, String password,Integer message) {
        String str="注册失败，请联系工作人员";
        if (session.getAttribute("user_message").equals(message)){
            User user=new User();
            user.setUser_phone(phone);
            user.setUser_password(password);
            user.setUser_name("tea新用户");
            Integer integer=userDao.addUser(user);
            if (integer==1){
                str="注册成功，请登录";
            }else {
                str="注册失败";
            }
        }else {
            str="验证码错误";
        }
        return str;
    }

    //    用户找回密码goback

    @Override
    public String goBack(BigInteger phone, String password,Integer message) {
        String str="找回失败，请联系工作人员";
        if (session.getAttribute("user_message").equals(message)){
            User user=new User();
            user.setUser_phone(phone);
            user.setUser_password(password);
            Integer integer=userDao.upUserPaw(user);
            if (integer==1){
                str="修改密码成功，请登录";
            }else {
                str="修改失败失败";
            }
        }else {
            str="验证码错误";
        }
        return str;
    }
//用户登录
    @Override
    public String ifLogin(BigInteger phone, String password) {
        String urlStr="";
        User user=new User();
        user.setUser_phone(phone);
        user.setUser_password(password);
        User users=userDao.ifLogin(user);
        if (users!=null){
            session.setAttribute("user_phone",phone);
            session.setAttribute("user_password",password);
//            urlStr="forward:/index.jsp";
            urlStr="登录成功";
        }
        else {
//            urlStr="forward:/login.jsp";
            urlStr="登录失败";
        }
        return urlStr;
    }
//    修改密码，需要接收原来密码和新密码
    @Override
    public String upUserPaw(String password,String newPad) {
        String upStr="修改失败";
        BigInteger phone=new BigInteger(session.getAttribute("user_phone").toString());
        User user1=new User();
        user1.setUser_phone(phone);
        user1.setUser_password(password);
        User ifUser=userDao.ifLogin(user1);
        if(ifUser!=null){
            User user=new User();
            user.setUser_phone(phone);
            user.setUser_password(newPad);
            Integer upNum=userDao.upUserPaw(user);
            if (upNum==1){
                upStr="修改成功";
            }
        }else {
            upStr="原密码错误";
        }
        return upStr;
    }
//     修改用户昵称

    @Override
    public String upUserName(String name) {
        String upStr="修改失败";
        BigInteger phone=new BigInteger(session.getAttribute("user_phone").toString());
            User user=new User();
            user.setUser_name(name);
            user.setUser_phone(phone);
            Integer upNum=userDao.upUserName(user);
            if(upNum==1){
                upStr="修改成功";
            }else{
                upStr="修改失败";
            }
        return upStr;
    }

    //     修改用户会员资料，需要接收用户电话号码，身份证号码，邮箱，姓名
    @Override
    public String upUserMem(BigInteger phone,BigInteger card, String email, String name) {
        String upStr="修改失败";
        User isMember=new User();
        isMember.setUser_phone(phone);
        User memberUser=userDao.ifLogin(isMember);
        if (memberUser!=null){
            User user=new User();
            user.setUser_phone(phone);
            user.setMember_card(card);
            user.setMember_email(email);
            user.setMember_name(name);
            Integer upNum=userDao.updateUser(user);
            if(upNum==1){
                upStr="修改成功";
            }else {
                upStr="修改失败";
            }
        }else {
            upStr="没有该用户";
        }
        return upStr;
    }
//查询用户个人资料
    @Override
    public User selUser() {
        BigInteger phone=new BigInteger(session.getAttribute("user_phone").toString());
        User user=new User();
        user.setUser_phone(phone);
        User user1=userDao.selUser(user);
        return user1;
    }
//    注册会员

    @Override
    public String addMem(BigInteger member_card,String member_email,String member_name) {
        String str="";
        BigInteger phone=new BigInteger(session.getAttribute("user_phone").toString());
        User user1=new User();
        user1.setUser_phone(phone);
        User user2=userDao.selUser(user1);
        if(user2.getIs_member()==0){
//            api验证是否符合身份证号码和姓名匹配
            CardVer cardVer=new CardVer();
            String str1=cardVer.cardIf("445122200004295958","余其楠");
            JSONObject jsonObject =JSON.parseObject(str1);
            if (jsonObject.get("errcode").toString().equals("00000")){
                User user=new User();
                user.setUser_phone(phone);
                user.setMember_card(member_card);
                user.setMember_email(member_email);
                user.setMember_name(member_name);
                user.setIs_member(1);
                Integer num=userDao.updateMember(user);
                if (num==1){
                    str="注册成功";
                }else {
                    str="注册失败";
                }
            }else if(jsonObject.get("errcode").toString().equals("00064")){
                str="验证不通过";
            }else if(jsonObject.get("errcode").toString().equals("00026")){
                str="身份信息不存在";
            }else if(jsonObject.get("errcode").toString().equals("00082")){
                str="身份证号错误，请核对后重新验证";
            }else if(jsonObject.get("errcode").toString().equals("210J4")){
                str="姓名为空或不标准，请输入合法的姓名";
            }else if (jsonObject.get("errcode").toString().equals("21082")){
                str="身份证为空或不标准，请输入合法的身份证号";
            }else {
                str="身份证认证失败，请联系管理员";
            }
        }else{
            str="已经是会员了";
        }
        return str;
    }

}
