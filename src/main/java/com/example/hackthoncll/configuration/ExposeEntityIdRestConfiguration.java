package com.example.hackthoncll.configuration;

import com.example.hackthoncll.entity.*;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;

@Component
public class ExposeEntityIdRestConfiguration implements RepositoryRestConfigurer {
 @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Caisse.class);
        config.exposeIdsFor(KeyCLL.class);
     config.exposeIdsFor(Materiel.class);
     config.exposeIdsFor(MeetingManagment.class);
     config.exposeIdsFor(User.class);
 }
}
