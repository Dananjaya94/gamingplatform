package com.gaming.gamingplatform.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

@Entity
@Table(name = "users")
@Data
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String username;
        private String email;

        @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
        private String password;

        @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE, orphanRemoval = true)
        @JsonIgnore
        @ToString.Exclude
        @EqualsAndHashCode.Exclude
        private List<Score> scores;
}