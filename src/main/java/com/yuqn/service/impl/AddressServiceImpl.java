package com.yuqn.service.impl;

import com.yuqn.dao.AddressDao;
import com.yuqn.dao.UserDao;
import com.yuqn.entity.Address;
import com.yuqn.entity.User;
import com.yuqn.service.AddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.math.BigInteger;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Resource
    private AddressDao addressDao;
    @Resource
    private UserDao userDao;
    @Resource
    private HttpSession session;
    @Override
    public List<Address> selAddress() {
            BigInteger bigInteger=new BigInteger(session.getAttribute("user_phone").toString());
            User user=new User();
            user.setUser_phone(bigInteger);
            List<Address> addresses=addressDao.selectAdd(user);
        return addresses;
    }

    @Override
    public String reAddress(Integer address_id) {
        String str="";
        Address address=new Address();
        address.setAddress_id(address_id);
        Integer reAddNum=addressDao.delAdd(address);
        System.out.println("删除了"+reAddNum);
        str="user/address";
        return str;
    }

    @Override
    public Integer addAddress(String address_name, String address_area, String address_minute, BigInteger address_phone, Integer address_code) {
        BigInteger bigInteger=new BigInteger(session.getAttribute("user_phone").toString());
        User user=new User();
        user.setUser_phone(bigInteger);
        User user1=userDao.selUser(user);
        Address address=new Address();
        address.setUser_id(user1.getUser_id());
        address.setAddress_name(address_name);
        address.setAddress_area(address_area);
        address.setAddress_minute(address_minute);
        address.setAddress_phone(address_phone);
        address.setAddress_code(address_code);
        Integer addNum=addressDao.addAdd(address);
        return addNum;
    }

    @Override
    public Integer upAddress(Integer address_id, String address_name, String address_area, String address_minute, Integer address_code, BigInteger address_phone) {
        Address address=new Address();
        address.setAddress_id(address_id);
        address.setAddress_name(address_name);
        address.setAddress_area(address_area);
        address.setAddress_minute(address_minute);
        address.setAddress_code(address_code);
        address.setAddress_phone(address_phone);
        Integer upNum=addressDao.upAdd(address);
        return upNum;
    }

    @Override
    public Address selAdd(Integer address_id) {
        Address address=new Address();
        address.setAddress_id(address_id);
        Address address1=addressDao.selAdd(address);
        return address1;
    }
}
