package com.novit.orderpay.domain.service;

import com.github.pagehelper.PageInfo;
import com.novit.orderpay.common.ServerResponse;
import com.novit.orderpay.domain.model.Shipping;


public interface IShippingService {

    ServerResponse add(Integer userId, Shipping shipping);

    ServerResponse<String> del(Integer userId, Integer shippingId);

    ServerResponse update(Integer userId, Shipping shipping);

    ServerResponse<Shipping> select(Integer userId, Integer shippingId);

    ServerResponse<PageInfo> list(Integer userId, int pageNum, int pageSize);
}
