package com.example.springbootstudy.domain.user.domain.repository;

import com.example.springbootstudy.domain.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {

    Boolean existsByAccountId(String accountId);

    User findByAccountId(String accountId);
}
