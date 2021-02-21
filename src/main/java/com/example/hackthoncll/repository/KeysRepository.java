package com.example.hackthoncll.repository;

import com.example.hackthoncll.entity.KeyCLL;
import com.example.hackthoncll.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface KeysRepository extends JpaRepository<KeyCLL,Long> {
}
