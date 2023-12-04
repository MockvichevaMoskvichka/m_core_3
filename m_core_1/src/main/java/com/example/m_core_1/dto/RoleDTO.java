package com.example.m_core_1.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor

public class RoleDTO {
    private Long id;
    private String email;
    private String password;


}
