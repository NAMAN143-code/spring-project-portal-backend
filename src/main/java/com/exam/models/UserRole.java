package com.exam.models;

import jakarta.persistence.*;

@Entity
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userRoleID;

    //user
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;


}
