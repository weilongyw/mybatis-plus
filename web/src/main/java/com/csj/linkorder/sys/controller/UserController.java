package com.csj.linkorder.sys.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.csj.linkorder.sys.entity.User;
import com.csj.linkorder.sys.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author yw
 * @since 2018-12-21
 */
@RestController
@RequestMapping("/sys/user")
public class UserController {

    @Autowired
    IUserService iUserService;

    @RequestMapping("find")
    public  void find(){
        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.eq("id","1");
        User one = iUserService.getOne(queryWrapper);
        System.out.println(one);
    }
}
