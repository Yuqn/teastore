package com.yuqn.service.impl;

import com.yuqn.dao.PictureDao;
import com.yuqn.entity.Picture;
import com.yuqn.excep.NotEnoughException;
import com.yuqn.service.PictureService;
import com.yuqn.utils.UploadUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

@Service
public class PictureServiceImpl implements PictureService {
    @Resource
    private PictureDao pictureDao;
    @Override
    public String admAddPicGo(Integer goods_id, MultipartFile picture_one, MultipartFile picture_two, MultipartFile picture_three, MultipartFile picture_four, MultipartFile picture_five) {
        String str="添加失败，请联系管理员";
        UploadUtils uploadUtils=new UploadUtils();
        String str1=uploadUtils.upload(picture_one);
        String str2=uploadUtils.upload(picture_two);
        String str3=uploadUtils.upload(picture_three);
        String str4=uploadUtils.upload(picture_four);
        String str5=uploadUtils.upload(picture_five);
        Picture picture=new Picture();
        picture.setGoods_id(goods_id);
        picture.setPicture_one(str1);
        picture.setPicture_two(str2);
        picture.setPicture_three(str3);
        picture.setPicture_four(str4);
        picture.setPicture_five(str5);
        Integer integer=pictureDao.admAddPicGo(picture);
        if(integer==1){
            str="添加图片成功";
        }
        return str;
    }

    @Transactional
    @Override
    public String admUpPicGo(Integer goods_id, MultipartFile picture_one, MultipartFile picture_two, MultipartFile picture_three, MultipartFile picture_four, MultipartFile picture_five) {
        String str="修改失败，请联系管理员";
        Picture picture1=new Picture();
        picture1.setGoods_id(goods_id);
        pictureDao.admDelPicGo(picture1);
        UploadUtils uploadUtils=new UploadUtils();
        String str1=uploadUtils.upload(picture_one);
        String str2=uploadUtils.upload(picture_two);
        String str3=uploadUtils.upload(picture_three);
        String str4=uploadUtils.upload(picture_four);
        String str5=uploadUtils.upload(picture_five);
        Picture picture=new Picture();
        picture.setGoods_id(goods_id);
        picture.setPicture_one(str1);
        picture.setPicture_two(str2);
        picture.setPicture_three(str3);
        picture.setPicture_four(str4);
        picture.setPicture_five(str5);
        Integer integer1=pictureDao.admAddPicGo(picture);
        if(integer1==1){
            str="修改详情成功";
        }
        return str;
    }
}
