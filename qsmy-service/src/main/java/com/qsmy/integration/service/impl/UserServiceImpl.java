package com.qsmy.integration.service.impl;

import com.qsmy.integration.pojo.User;
import com.qsmy.integration.repository.UserRepository;
import com.qsmy.integration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author qsmy
 */
@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> list() {
        return userRepository.findAll();
    }
}
