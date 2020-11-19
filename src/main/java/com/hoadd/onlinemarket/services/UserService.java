package com.hoadd.onlinemarket.services;

import com.hoadd.onlinemarket.entities.User;
import com.hoadd.onlinemarket.interfaces.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public void save(User user) {
        repo.save(user);
    }
}
