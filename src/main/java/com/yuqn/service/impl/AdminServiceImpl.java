package com.yuqn.service.impl;

import com.yuqn.dao.AdminDao;
import com.yuqn.entity.Admin;
import com.yuqn.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.math.BigInteger;
@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminDao adminDao;
    @Resource
    private HttpSession session;
    @Override
    public String adminLogin(BigInteger admin_card, String admin_password) {
        String str="登录失败，请联系工作人员";
        Admin admin=new Admin();
        admin.setAdmin_card(admin_card);
        admin.setAdmin_password(admin_password);
        Admin admin1=adminDao.selAdmin(admin);
        if (admin1==null){
            str="forward:/admlogin.jsp";
        }else{
            session.setAttribute("user_phone",admin1.getAdmin_card());
            System.out.println(session.getAttribute("user_phone"));
            str="admin/index";
        }
        return str;
    }
}
