package com.yuqn.service;

import com.yuqn.entity.Details;
import org.springframework.web.multipart.MultipartFile;

public interface DetailsService {
//    查询商品详情介绍
    public Details selDetails(Integer goods_id);
//    商家添加详情
    public String admAddDetGo(Integer goods_id, MultipartFile details_one, MultipartFile details_two, MultipartFile details_three, MultipartFile details_four, MultipartFile details_five, String details_text, String details_price);
//    商家修改详情
    public String admUpDetGo(Integer goods_id, MultipartFile details_one, MultipartFile details_two, MultipartFile details_three, MultipartFile details_four, MultipartFile details_five, String details_text, String details_price);
}
