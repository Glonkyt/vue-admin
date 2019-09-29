package com.qf.dao;

import com.qf.domain.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoginRepository extends JpaRepository<UserLogin,Integer> {

}
