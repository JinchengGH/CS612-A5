package com.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.entity.Product;
import com.demo.mapper.ProductMapper;
import com.demo.service.ProductServiceApi;

/**
 * @author chendb
 * @date 2021/12/10 16:14
 */
@Service
public class ProductServiceApiImpl extends ServiceImpl<ProductMapper, Product> implements ProductServiceApi{
}
