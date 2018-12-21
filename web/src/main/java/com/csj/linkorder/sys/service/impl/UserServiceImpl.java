package com.csj.linkorder.sys.service.impl;

import com.csj.linkorder.sys.entity.User;
import com.csj.linkorder.sys.mapper.UserMapper;
import com.csj.linkorder.sys.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author yw
 * @since 2018-12-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
