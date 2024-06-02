package com.example.mapstructlearn.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(generator = "users_seq")
    @SequenceGenerator(name = "users_seq", sequenceName = "USERS_SEQ", allocationSize = 1)

    @Column(name = "id_user")
    private Long id;

    @NotNull
    @Size(max = 255,min = 3)
    @Column(name = "name_user")
    private String nameUser;

    @Column(name = "date_auth")
    @Builder.Default
    private LocalDateTime dateAuth = LocalDateTime.now();


    @Column(name = "login")
    private String login;


    @Column(name = "pass")
    private String password;

}
