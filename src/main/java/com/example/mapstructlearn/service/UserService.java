package com.example.mapstructlearn.service;

import com.example.mapstructlearn.dto.UserCreateDto;
import com.example.mapstructlearn.dto.UserDto;
import com.example.mapstructlearn.entity.User;
import com.example.mapstructlearn.exception.CustomExceptions;
import com.example.mapstructlearn.mapper.UserMapper;
import com.example.mapstructlearn.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    @Autowired
    UserMapper mapper;

    public ResponseEntity<UserDto> getUserById(Long id) {
        User entity = userRepo.findById(id).orElseThrow(() -> new CustomExceptions.NoValueException("Нет в Бд"));
        return ResponseEntity.ok(mapper.toDto(entity));
    }

    public ResponseEntity<Long> addUser(UserCreateDto dto) {
        User entity = mapper.userCreateToEntity(dto);
        System.out.println(12);
        return ResponseEntity.ok(userRepo.save(entity).getId());
    }
}
