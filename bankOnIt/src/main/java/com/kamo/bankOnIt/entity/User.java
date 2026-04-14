package com.kamo.bankOnIt.entity;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.UUID;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(unique = true, nullable = false)
    private String email;

    private String password;

    private String role = "ROLE_USER";

    private boolean isVerified = false;

}
