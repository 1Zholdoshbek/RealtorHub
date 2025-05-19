package com.tashiev.realtorhub.service.auth;

import com.tashiev.realtorhub.entity.User;

public interface AuthService {

    User authenticate(String username, String password);
}
