package com.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.entity.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author chendb
 * @date 2021/12/10 15:47
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
