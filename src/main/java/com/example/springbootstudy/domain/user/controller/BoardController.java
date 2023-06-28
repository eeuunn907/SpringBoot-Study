package com.example.springbootstudy.domain.user.controller;

import com.example.springbootstudy.domain.user.controller.dto.Request.CreatBoardRequest;
import com.example.springbootstudy.domain.user.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BoardController {
    private final BoardService boardService;

    @PostMapping
    public void createBoard(@RequestBody CreatBoardRequest request) { //유효성 검증 어노테이션 붙여주기
        boardService.save(request);
    }
}
