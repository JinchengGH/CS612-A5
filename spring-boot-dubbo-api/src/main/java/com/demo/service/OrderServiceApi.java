package com.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demo.entity.Order;
import com.demo.respones.ApiResult;

/**
 * @author chendb
 * @date 2021/12/10 16:07
 */
public interface OrderServiceApi extends IService<Order> {

    ApiResult getOrder(Integer customerId);

    ApiResult getOrderList(Integer id,Integer orderId);

}
