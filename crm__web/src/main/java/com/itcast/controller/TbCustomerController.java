package com.itcast.controller;

import com.itcast.domain.TbCustomer;
import com.itcast.service.TbCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户类的Web层的Controller
 */

@Controller
@RequestMapping("/Tb_customer")
public class TbCustomerController {

    //注入Service层
    @Autowired
    private TbCustomerService tbCustomerService;

    /**
     * 跳转到input页面
     *
     * @param
     * @return
     */
    @RequestMapping("/input")
    public String input() {
        System.out.println("执行方法。。。。。。。");
        return "register";
    }


    //保存用户的方法
    @RequestMapping("/save_TbCustometr")
    public String save(TbCustomer customer) {

        try {

            //调用方法
            tbCustomerService.saveTbCustomer(customer);

        } catch (Exception ex) {

            ex.printStackTrace();

            return "error";
        }
        //返回结果视图
        return "success";

    }

}
