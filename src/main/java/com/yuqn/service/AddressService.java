package com.yuqn.service;

import com.yuqn.entity.Address;

import java.math.BigInteger;
import java.util.List;

public interface AddressService {
//    根据用户查看所有
    public List<Address> selAddress();
//    删除地址
    public String reAddress(Integer address_id);
//    添加地址
    public Integer addAddress(String address_name, String address_area, String address_minute, BigInteger address_phone, Integer address_code);
//修改地址
    public Integer upAddress(Integer address_id,String address_name,String address_area,String address_minute,Integer address_code,BigInteger address_phone);
//查某一条记录
    public Address selAdd(Integer address_id);
}
