package com.example.hackthoncll.repository;

import com.example.hackthoncll.entity.Caisse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CaisseRepository extends JpaRepository<Caisse,Long> {
}
