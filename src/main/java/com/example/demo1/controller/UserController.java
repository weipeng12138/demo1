package com.example.demo1.controller;


import com.example.demo1.entity.User;
import com.example.demo1.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wp
 * @since 2019-08-02
 */
@RestController
@RequestMapping("/demo1/user")
public class UserController {

    @Resource
    private UserMapper userMapper;

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public int insert(User user) {
        return userMapper.insert(user);
    }

    //查找全表
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public List selectAll(@RequestParam("pageNumber") Integer pageNumber){
        //分页核心代码传值，pageNumber
        PageHelper.startPage(pageNumber,6);
        List<User> user = userMapper.selectList(null);
        //输出在控制器窗口
        for (User value : user) {
            System.out.println(value);
            System.out.println(value.getClass());
            System.out.println("==");
        }
        //输出user
        return user;
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public int deleteById(@PathVariable("id") Integer id){
       return userMapper.deleteById(id);
    }


    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public int update(User user){
        return userMapper.updateById(user);

    }



}

