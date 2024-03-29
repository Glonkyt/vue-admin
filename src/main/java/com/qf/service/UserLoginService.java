package com.qf.service;

import com.qf.Response.ResponseUserLogin;
import com.qf.domain.UserLogin;

public interface UserLoginService {

    ResponseUserLogin findAll(Integer page, Integer size);

    UserLogin save(UserLogin userLogin);

    String delete(UserLogin userLogin);

    UserLogin selectById(UserLogin userLogin);

    UserLogin updateData(UserLogin userLogin);

}
