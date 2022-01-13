package com.yuqn.service.impl;

import com.yuqn.dao.NormsDao;
import com.yuqn.entity.Norms;
import com.yuqn.service.NormsService;
import com.yuqn.vo.GoodsId;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;
@Service
public class NormsServiceImpl implements NormsService {
    @Resource
   private NormsDao normsDao;
    @Override
    public List<Norms> selNorms(Integer goods_id) {
        GoodsId goodsId=new GoodsId(goods_id);
        List<Norms> norms=normsDao.selNorms(goodsId);
        return norms;
    }

    @Override
    public String NormsY(Integer goods_id, String norms_text, BigDecimal norms_price) {
        String str="操作异常，请联系工作人员";
        Norms norms=new Norms();
        norms.setGoods_id(goods_id);
        norms.setNorms_text(norms_text);
        norms.setNorms_price(norms_price);
        Integer integer=normsDao.NormsY(norms);
        if(integer==1){
            str="规格添加成功";
        }
        return str;
    }
}
