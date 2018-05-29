package com.itcast.service.impl;

import com.itcast.domain.TbCustomer;
import com.itcast.mapper.TbCustomerMapper;
import com.itcast.service.TbCustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * 用户类的Service层的实现类
 */

@Service //Service层的注解
@Transactional //  事务的注解
public class TbCustomerServiceImpl implements TbCustomerService {

    //注入Dao层的接口
    @Resource
    private TbCustomerMapper tbCustomerMapper;

    //保存用户的方法
    @Override
    public void saveTbCustomer(TbCustomer customer) {

        System.out.println("对象 ：" + customer);

        System.out.println("打印对象：" + tbCustomerMapper);
        //调用方法
        tbCustomerMapper.insert(customer);

    }
}
