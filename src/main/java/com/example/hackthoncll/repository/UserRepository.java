package com.example.hackthoncll.repository;

import com.example.hackthoncll.entity.KeyCLL;
import com.example.hackthoncll.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
    public User findUserByKey(KeyCLL keyCLL);
}
