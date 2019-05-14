package cn.itsource.mybatisplusdemo.controller;

import cn.itsource.mybatisplusdemo.domain.User;
import cn.itsource.mybatisplusdemo.service.IUserService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zb
 * @version 1.0
 * @classname UserController
 * @description TODO
 * @date 2019/5/14
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/page")
    public List<User> page(){
        return userService.page(new Page<User>()).getRecords();
    }
}
