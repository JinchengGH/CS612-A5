package com.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.entity.Order;
import com.demo.mapper.OrderMapper;
import com.demo.respones.ApiResult;
import com.demo.service.OrderServiceApi;

import java.util.List;

/**
 * @author chendb
 * @date 2021/12/10 16:13
 */
@Service
public class OrderServiceApiImpl extends ServiceImpl<OrderMapper, Order> implements OrderServiceApi{

    @Override
    public ApiResult getOrder(Integer customerId) {
        QueryWrapper<Order> wrapper = new QueryWrapper<>();
        if (customerId != null) {
            wrapper.eq("customer_id",customerId);
        }
        List<Order> list = baseMapper.selectList(wrapper);
        return ApiResult.success(list);
    }

    @Override
    public ApiResult getOrderList(Integer id, Integer orderId) {
        QueryWrapper<Order> wrapper = new QueryWrapper<>();
        if (id != null) {
            wrapper.eq("customer_id",id);
        }
        if (orderId !=null) {
            wrapper.eq("id",id);
        }
        List<Order> list = baseMapper.selectList(wrapper);
        return ApiResult.success(list);
    }
}
