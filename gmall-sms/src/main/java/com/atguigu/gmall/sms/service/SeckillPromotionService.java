package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.SeckillPromotionEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 秒杀活动
 *
 * @author xjy
 * @email 704197229@qq.com
 * @date 2020-09-07 14:49:11
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageVo queryPage(QueryCondition params);
}

