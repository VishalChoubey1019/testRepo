package com.testRepo.auth;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "adminUser")
public class AdminUser {
    @Id
    @GeneratedValue
    private Long id;

    @GeneratedValue
    private String adminId;
    
}
