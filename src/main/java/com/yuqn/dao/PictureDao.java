package com.yuqn.dao;

import com.yuqn.entity.Picture;

public interface PictureDao {
//    商家添加商品图片表
    public Integer admAddPicGo(Picture picture);
//    商家修改商品图片表
    public Integer admUpPicGo(Picture picture);
//    商家删除图片表
    public Integer admDelPicGo(Picture picture);
}
