package com.example.hackthoncll.repository;

import com.example.hackthoncll.entity.Materiel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MaterielRepository extends JpaRepository<Materiel,Long> {
}
