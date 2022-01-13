package com.yuqn.service;

import org.springframework.web.multipart.MultipartFile;

public interface PictureService {
//    商家添加商品图片
    public String admAddPicGo(Integer goods_id, MultipartFile picture_one, MultipartFile picture_two, MultipartFile picture_three, MultipartFile picture_four, MultipartFile picture_five);
//    商家修改商品图片
    public String admUpPicGo(Integer goods_id, MultipartFile picture_one, MultipartFile picture_two, MultipartFile picture_three, MultipartFile picture_four, MultipartFile picture_five);
}
