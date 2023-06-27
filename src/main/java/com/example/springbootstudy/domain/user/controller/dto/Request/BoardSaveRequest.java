package com.example.springbootstudy.domain.user.controller.dto.Request;

import com.example.springbootstudy.domain.user.domain.Board;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BoardSaveRequest {
    private String title;
    private String content;
    private String author;

}
