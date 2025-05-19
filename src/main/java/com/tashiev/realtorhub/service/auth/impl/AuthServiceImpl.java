package com.tashiev.realtorhub.service.auth.impl;

import com.tashiev.realtorhub.entity.User;
import com.tashiev.realtorhub.service.auth.AuthService;
import org.springframework.stereotype.Service;


@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public User authenticate(String username, String password) {
        return null;
    }
}
