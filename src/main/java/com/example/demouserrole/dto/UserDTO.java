package com.example.demouserrole.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Long id;
    private String userName;
    private String email;
    private Boolean isSuperAdmin;
    private RoleDTO role;
}
