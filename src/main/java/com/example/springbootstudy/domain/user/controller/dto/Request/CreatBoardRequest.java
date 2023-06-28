package com.example.springbootstudy.domain.user.controller.dto.Request;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CreatBoardRequest {
    private String title;
    private String content;
    private String author;

}
