package com.itcast.mapper;

import com.itcast.domain.Customer;

/**
 * 用户类Dao层的接口
 */
public interface CustomerMapper {

    //添加客户
    public void insert(Customer customer);

    //添加用户 ： 如果不为null, 才进行添加
    public  void insertSelective(Customer customer);

}
