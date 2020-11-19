package com.hoadd.onlinemarket.interfaces;

import com.hoadd.onlinemarket.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Long> {
    @Query("select user from User user where user.username = :username")
    public User getUserByUsername(@Param("username") String username);
}
