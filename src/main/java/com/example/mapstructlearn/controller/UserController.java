package com.example.mapstructlearn.controller;

import com.example.mapstructlearn.dto.UserCreateDto;
import com.example.mapstructlearn.dto.UserDto;
import com.example.mapstructlearn.service.UserService;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController("user")
@RequestMapping("api/v1")
@Tag(name = "Api user", description = "Rest endpoints пользователей")
@Validated
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/user")
    public ResponseEntity<UserDto> getClientById(
            @RequestParam(value = "id") Long id
    ) {
        return userService.getUserById(id);
    }

    @PostMapping("/user")
    public ResponseEntity<Long> addUser(

            @Validated
            @Valid
            @RequestBody
            UserCreateDto dto
    ) {
        return userService.addUser(dto);
    }



}
