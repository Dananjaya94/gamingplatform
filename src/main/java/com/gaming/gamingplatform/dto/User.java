package com.gaming.gamingplatform.dto;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user") // Ensure the table name matches your database
@Data
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String username;
        private String email;

        // Other fields, getters, and setters
}
