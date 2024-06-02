package com.example.mapstructlearn.util;

import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;


@Named("UserMapperUtil")
@Component
public class UserMapperUtil {
    @Autowired
    Random randomGenerator;

    //метод с некоторой логикой шифрования
    @Named("getPasswordFromUsername")
    public String passEncryption(String username) {
        return username + " generatedPassword" + randomGenerator.nextInt(5000);
    }
}
