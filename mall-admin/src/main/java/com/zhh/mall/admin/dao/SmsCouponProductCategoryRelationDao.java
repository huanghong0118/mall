package com.zhh.mall.admin.dao;

import com.zhh.mall.model.SmsCouponProductCategoryRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 自定义优惠券和商品分类关系管理Dao
 * Created by zhh on 2018/8/28.
 */
public interface SmsCouponProductCategoryRelationDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list")List<SmsCouponProductCategoryRelation> productCategoryRelationList);
}
