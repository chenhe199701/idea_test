package com.itcast.service;

import com.itcast.domain.TbCustomer;

/**
 * 用户类的Service层的接口
 */
public interface TbCustomerService {

    //保存用户
    public void saveTbCustomer(TbCustomer customer);

}
