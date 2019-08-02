package com.example.demo1.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo1.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import javafx.scene.control.Pagination;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wp
 * @since 2019-08-02
 */

@Mapper
public interface UserMapper extends BaseMapper<User> {



}
