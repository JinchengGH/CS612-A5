package com.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.demo.entity.Customer;
import com.demo.entity.Order;
import com.demo.respones.ApiResult;
import com.demo.service.CustomerServiceApi;
import com.demo.service.OrderServiceApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Assignment 5: RESTful Web Service
 * Implementation + Docker
 * @author hanxuan
 */
@RestController
@RequestMapping
public class RpcApiController {

    @Reference
    private CustomerServiceApi customerServiceApi;
    @Reference
    private OrderServiceApi orderServiceApi;

    @GetMapping("customers")
    public ApiResult get() {
        List<Customer> list = customerServiceApi.list();
        return ApiResult.success(list);
    }

    @GetMapping("customers/{id}")
    public ApiResult get(@PathVariable Integer id) {
        QueryWrapper<Customer> wrapper = new QueryWrapper<>();
        if (id != null) {
            wrapper.eq("id",id);
        }
        Customer list = customerServiceApi.getById(id);
        return ApiResult.success(list);
    }

    @GetMapping("customers/{id}/orders")
    public ApiResult getOrders(@PathVariable Integer id) {
        return orderServiceApi.getOrder(id);
    }

    @GetMapping("customers/{id}/orders/{orderId}")
    public ApiResult getOrders(@PathVariable Integer id,@PathVariable Integer orderId) {
        return orderServiceApi.getOrderList(id,orderId);
    }

}
