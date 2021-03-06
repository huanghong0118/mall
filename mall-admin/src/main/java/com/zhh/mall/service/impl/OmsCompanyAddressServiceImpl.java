package com.zhh.mall.service.impl;

import com.zhh.mall.mapper.OmsCompanyAddressMapper;
import com.zhh.mall.model.OmsCompanyAddress;
import com.zhh.mall.model.OmsCompanyAddressExample;
import com.zhh.mall.service.OmsCompanyAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 收货地址管理Service实现类
 * Created by zhh on 2018/10/18.
 */
@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {
    @Autowired
    private OmsCompanyAddressMapper companyAddressMapper;
    @Override
    public List<OmsCompanyAddress> list() {
        return companyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}
