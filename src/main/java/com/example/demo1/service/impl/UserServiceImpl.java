package com.example.demo1.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo1.entity.User;
import com.example.demo1.mapper.UserMapper;
import com.example.demo1.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wp
 * @since 2019-08-02
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
