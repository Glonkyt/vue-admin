package com.qf.controller;

import com.qf.Response.ResponseUserLogin;
import com.qf.domain.UserLogin;
import com.qf.service.UserLoginService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;

    @RequestMapping("/findAll/{page}/{size}")
    public ResponseUserLogin findAll(@PathVariable("page")Integer page,@PathVariable("size")Integer size){
        return userLoginService.findAll(page,size);
    }

    @RequestMapping("/insertUser")
    public UserLogin save(@RequestBody UserLogin userLogin){
        return userLoginService.save(userLogin);
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(@RequestBody UserLogin userLogin){
        return userLoginService.delete(userLogin);
    }

    @RequestMapping("/updateData")
    public UserLogin updateUser(@RequestBody UserLogin userLogin){
        return userLoginService.updateData(userLogin);
    }

    @RequestMapping("/selectById")
    public UserLogin selectById(@RequestBody UserLogin userLogin){
        return userLoginService.selectById(userLogin);
    }

}
