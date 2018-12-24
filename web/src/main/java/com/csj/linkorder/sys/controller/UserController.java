package com.csj.linkorder.sys.controller;


import com.csj.linkorder.common.Global;
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
    public void find() {
        System.out.println(Global.getMpDataSourceDriverClassName());
    }
}
