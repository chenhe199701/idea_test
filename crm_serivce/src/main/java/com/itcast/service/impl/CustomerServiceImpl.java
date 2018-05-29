package com.itcast.service.impl;

import com.itcast.domain.Customer;
import com.itcast.mapper.CustomerMapper;
import com.itcast.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户类的Service层的实现类
 */
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{


    //注入Dao层的接口
    @Autowired
    private CustomerMapper customerMapper;

    //保存的方法
    @Override
    public void saveCustomer(Customer customer) {

        customerMapper.insertSelective(customer);
    }


}
