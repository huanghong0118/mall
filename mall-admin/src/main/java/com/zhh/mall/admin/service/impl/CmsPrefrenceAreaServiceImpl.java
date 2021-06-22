package com.zhh.mall.admin.service.impl;

import com.zhh.mall.mapper.CmsPrefrenceAreaMapper;
import com.zhh.mall.model.CmsPrefrenceArea;
import com.zhh.mall.model.CmsPrefrenceAreaExample;
import com.zhh.mall.service.CmsPrefrenceAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品优选Service实现类
 * Created by zhh on 2018/6/1.
 */
@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService {
    @Autowired
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
