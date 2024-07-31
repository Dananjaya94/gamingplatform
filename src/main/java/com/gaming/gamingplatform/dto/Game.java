package com.gaming.gamingplatform.dto;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "game") // Ensure the table name matches your database
@Data
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    // Other fields, getters, and setters
}
