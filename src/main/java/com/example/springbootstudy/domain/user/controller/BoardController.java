package com.example.springbootstudy.domain.user.controller;

import com.example.springbootstudy.domain.user.controller.dto.Request.BoardSaveRequest;
import com.example.springbootstudy.domain.user.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BoardController {
    private final BoardService boardService;
    @PostMapping("/api/v1/board")
    public void save(@RequestBody BoardSaveRequest request){
            boardService.save(request);
        }
}
