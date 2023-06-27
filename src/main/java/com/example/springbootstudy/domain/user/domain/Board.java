package com.example.springbootstudy.domain.user.domain;

import com.example.springbootstudy.global.entity.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "posts")
public class Board extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "Text", nullable = false)
    private String content;

    private String author;

    @Builder
    public Board(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void updateBoard(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
