package com.example.springbootstudy.domain.user.service;


import com.example.springbootstudy.domain.user.controller.dto.Request.BoardSaveRequest;
import com.example.springbootstudy.domain.user.domain.Board;
import com.example.springbootstudy.domain.user.domain.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor // 생성자로 Bean 을 받는다
@Service
public class BoardService {
    private final BoardRepository boardRepository;

    @Transactional
    public void save(BoardSaveRequest request) {
        boardRepository.save(
                Board.builder()
                        .title(request.getTitle())
                        .content(request.getContent())
                        .author(request.getAuthor())
                        .build());
    }
}
