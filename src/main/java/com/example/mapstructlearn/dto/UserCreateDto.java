package com.example.mapstructlearn.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor


public class UserCreateDto {

    @NotNull
    @Size(max = 255,min = 3)
    private String nameUser;

    @NotNull
    @Size(max = 255, min = 5)
    private String login;

    @NotNull
    @Size(max = 255, min = 7)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
}
