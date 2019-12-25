package com.atguigu.gmall0715.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall0715.bean.UserAddress;
import com.atguigu.gmall0715.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {

//    @Autowired
    @Reference
    private UserService userService;

    @RequestMapping("trade")
    @ResponseBody//第一个作用，返回json字符串，第二个作用 将控制器的数据直接输出到空白页
    public List<UserAddress> trade(String userId){
        //得到用户的收货地址列表
       return userService.findUserAddressListByUserId(userId);
    }
}
