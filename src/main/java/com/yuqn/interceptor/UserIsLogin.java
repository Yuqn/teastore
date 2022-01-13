package com.yuqn.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigInteger;

public class UserIsLogin implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        boolean isGo=false;
        System.out.println("拦截器拦截开始");
//        BigInteger bigInteger=new BigInteger(request.getSession().getAttribute("user_phone").toString());
        Object obj=request.getSession().getAttribute("user_phone");

        System.out.println(obj);
        if (obj!=null){
            isGo=true;
        }
        else {
            isGo=false;
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }
        return isGo;
    }
}
