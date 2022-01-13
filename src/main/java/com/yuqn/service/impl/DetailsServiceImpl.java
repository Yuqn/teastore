package com.yuqn.service.impl;

import com.yuqn.dao.DetailsDao;
import com.yuqn.entity.Details;
import com.yuqn.entity.Picture;
import com.yuqn.excep.NotEnoughException;
import com.yuqn.service.DetailsService;
import com.yuqn.utils.UploadUtils;
import com.yuqn.vo.GoodsId;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

@Service
public class DetailsServiceImpl implements DetailsService {
    @Resource
    private DetailsDao detailsDao;
    @Override
    public Details selDetails(Integer goods_id) {
        GoodsId goodsId=new GoodsId(goods_id);
        Details details=detailsDao.selDetails(goodsId);
//        System.out.println(details);
        return details;
    }

    @Override
    public String admAddDetGo(Integer goods_id, MultipartFile details_one, MultipartFile details_two, MultipartFile details_three, MultipartFile details_four, MultipartFile details_five, String details_text, String details_price) {
        String str="添加失败，请联系管理员";
        UploadUtils uploadUtils=new UploadUtils();
        String str1=uploadUtils.upload(details_one);
        String str2=uploadUtils.upload(details_two);
        String str3=uploadUtils.upload(details_three);
        String str4=uploadUtils.upload(details_four);
        String str5=uploadUtils.upload(details_five);
        Details details=new Details();
        details.setGoods_id(goods_id);
        details.setDetails_one(str1);
        details.setDetails_two(str2);
        details.setDetails_three(str3);
        details.setDetails_four(str4);
        details.setDetails_five(str5);
        details.setDetails_text(details_text);
        details.setDetails_price(details_price);
        Integer integer=detailsDao.admAddDetGo(details);
        if(integer==1){
            str="添加详情成功";
        }
        return str;
    }

    @Override
    public String admUpDetGo(Integer goods_id, MultipartFile details_one, MultipartFile details_two, MultipartFile details_three, MultipartFile details_four, MultipartFile details_five, String details_text, String details_price) {
        String str="修改失败，请联系管理员";
        UploadUtils uploadUtils=new UploadUtils();
        String str1=uploadUtils.upload(details_one);
        String str2=uploadUtils.upload(details_two);
        String str3=uploadUtils.upload(details_three);
        String str4=uploadUtils.upload(details_four);
        String str5=uploadUtils.upload(details_five);
        Details details=new Details();
        details.setGoods_id(goods_id);
        details.setDetails_one(str1);
        details.setDetails_two(str2);
        details.setDetails_three(str3);
        details.setDetails_four(str4);
        details.setDetails_five(str5);
        details.setDetails_text(details_text);
        details.setDetails_price(details_price);
        Integer integer=detailsDao.admUpDetGo(details);
        if(integer==1){
            str="修改详情成功";
        }
        return str;
    }
}
