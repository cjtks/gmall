package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author xjy
 * @email 704197229@qq.com
 * @date 2020-09-07 14:49:11
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
