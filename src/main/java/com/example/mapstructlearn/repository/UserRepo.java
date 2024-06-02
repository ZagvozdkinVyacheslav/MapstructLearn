package com.example.mapstructlearn.repository;

import com.example.mapstructlearn.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    @Query(value = "SELECT count(*) FROM users WHERE login = ?1", nativeQuery = true)
    Integer findByLogin(String nameUser);

}
