package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xjy
 * @email 704197229@qq.com
 * @date 2020-09-07 11:42:18
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
