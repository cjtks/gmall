package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xjy
 * @email 704197229@qq.com
 * @date 2020-09-07 15:01:37
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
