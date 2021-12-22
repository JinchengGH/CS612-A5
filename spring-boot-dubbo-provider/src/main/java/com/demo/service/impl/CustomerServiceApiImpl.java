package com.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.entity.Customer;
import com.demo.mapper.CustomerMapper;
import com.demo.service.CustomerServiceApi;

/**
 * @author chendb
 * @date 2021/12/10 15:54
 */
@Service
public class CustomerServiceApiImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerServiceApi {

}
