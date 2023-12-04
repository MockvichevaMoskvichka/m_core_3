package com.example.m_core_1.dto;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor

public class UserDTO {
    private Long id;
    private String email;
    private String password;
    private Set<RoleDTO> roles;


}
