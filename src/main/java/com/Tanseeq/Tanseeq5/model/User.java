package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User extends BaseEntity {
    private String username;
    public User() {}
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
}
