package com.example.ProjetDigitApi.v2.Domain;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String username;
    private UUID id;

    public User(UUID id, String username) {
        this.id = id;
        this.username = username;
    }
    public UUID getId() {
        return id;
    }

    public void setId(UUID id){
        this.id = id;

    }
    public String getUsername() {
        return username;
    }
}