package com.yuqn.dao;

import com.yuqn.entity.User;

import java.math.BigInteger;
import java.util.List;

public interface UserDao {
//    用户注册
    public Integer addUser(User users);
//    用户登录
    public User ifLogin(User user);
//    修改密码
    public Integer upUserPaw(User user);
//    修改昵称
    public int upUserName(User user);
//    管理员修改用户
    public int updateUser(User user);
//    注册会员
    public int updateMember(User user);
//    查询用户
    public User selUser(User user);
//    注册用户查询是否有改用户
    public List<User> ifHasUser(User user);
}
