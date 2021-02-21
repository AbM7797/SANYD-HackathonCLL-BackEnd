package com.example.hackthoncll.entity;

import com.example.hackthoncll.entity.Utils.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Status status;
    private Number phone;
    @Column(unique = true)
    private String username;
    @Column(name = "password", length = 64)
    private String password;
    private String role;
    @OneToOne
    private KeyCLL key;
    @OneToOne
    private Materiel materiel;
}
