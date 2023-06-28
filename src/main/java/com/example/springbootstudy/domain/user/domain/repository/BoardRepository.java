package com.example.springbootstudy.domain.user.domain.repository;

import com.example.springbootstudy.domain.user.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board,Long> {
    List<Board> findAll();
}
