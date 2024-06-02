package com.example.mapstructlearn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class UserMapperConfig {

    //просто бин для примера того что в утилку маппера можно вставить бины
    @Bean
    public Random randomGenerator() {
        return new Random(System.currentTimeMillis() / 72);
    }
}
