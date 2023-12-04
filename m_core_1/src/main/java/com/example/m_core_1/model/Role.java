package com.example.m_core_1.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
    @Setter
    @Entity
    @Table(name = "role")
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode()
    public class Role {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String email;

        @ManyToMany(mappedBy = "roles")
private Set<User> users;

    }
