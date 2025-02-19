package com.example.spring_security_6.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class User {

    @Id  // Specify that 'id' is the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-generate the primary key value
    private Integer id;
    
    private String username;
    private String password;

    // Default constructor (required by JPA)
    public User() {
    }

    // Parameterized constructor (optional, for easier object creation)
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter and Setter methods for the fields
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
