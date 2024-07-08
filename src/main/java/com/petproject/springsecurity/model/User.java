package com.petproject.springsecurity.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "FirstName is required")
    @Size(max = 10, message = "FirstName must be <= 10 characters")
    @Column(name = "first_name")
    private String firstName;

    @NotBlank(message = "LastName is required")
    @Size(max = 10, message = "Lastname must be  <= 10 characters")
    @Column(name = "last_name")
    private String lastName;

    @NotBlank(message = "Email is required")
    private String email;

    @NotBlank(message = "FirstName is required")
    @Size(min = 8, max = 20, message = "Password must be 8 =< characters")
    private String password;

    @NotBlank(message = "Country is required")
    private String country;

}

