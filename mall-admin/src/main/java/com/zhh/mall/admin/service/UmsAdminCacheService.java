package com.zhh.mall.admin.service;

import com.zhh.mall.model.UmsAdmin;
import com.zhh.mall.model.UmsResource;

import java.util.List;

/**
 * 后台用户缓存操作类
 * Created by zhh on 2020/3/13.
 */
public interface UmsAdminCacheService {
    /**
     * 删除后台用户缓存
     */
    void delAdmin(Long adminId);

    /**
     * 获取缓存后台用户信息
     */
    UmsAdmin getAdmin(Long adminId);

    /**
     * 设置缓存后台用户信息
     */
    void setAdmin(UmsAdmin admin);
}
