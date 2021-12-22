package com.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.entity.Product;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author chendb
 * @date 2021/12/10 15:52
 */
@Mapper
public interface ProductMapper extends BaseMapper<Product> {
}
