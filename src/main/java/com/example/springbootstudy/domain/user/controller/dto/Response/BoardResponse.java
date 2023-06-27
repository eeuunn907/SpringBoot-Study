package com.example.springbootstudy.domain.user.controller.dto.Response;


import com.example.springbootstudy.domain.user.domain.Board;
import lombok.Getter;

@Getter
public class BoardResponse {
    private Long id;
    private String title;
    private String content;
    private String author;

    public BoardResponse(Board entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content=entity.getContent();
        this.author=entity.getAuthor();
    }
}
