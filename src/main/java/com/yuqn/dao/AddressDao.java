package com.yuqn.dao;

import com.yuqn.entity.Address;
import com.yuqn.entity.User;

import java.util.List;

public interface AddressDao {
//    查看收货地址
    public List<Address> selectAdd(User user);
//    删除收货地址
    public int delAdd(Address address);
//    修改收货地址
    public int upAdd(Address address);
//    添加收货地址
    public int addAdd(Address address);
//    查询某一个地址
    public Address selAdd(Address address);
}
