package com.itcast.controller;

import com.itcast.domain.Customer;
import com.itcast.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 客户类的Controller
 */

@Controller
@RequestMapping("/customer")
public class CustomerController {


    //注入Service层
    @Autowired
    private CustomerService customerService;


    /**
     * 进行页面的跳转
     *
     * @return
     */
    @RequestMapping("/input")
    public String input() {

        System.out.println("跳转方法的执行。。。。");
        return "register";
    }
    //添加用户的方法
    @RequestMapping("/save_Customer")
    public String saveCustomer(Customer customer) {

        try {
            System.out.println("用户类：" + customer);
            customerService.saveCustomer(customer);

        } catch (Exception ex) {
            //添加出现异常
            ex.printStackTrace();
            return "error";
        }

        return "success";
    }


}
