package com.example.hackthoncll.repository;

import com.example.hackthoncll.entity.MeetingManagment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MeetingManagementRepository extends JpaRepository<MeetingManagment,Long> {
}
