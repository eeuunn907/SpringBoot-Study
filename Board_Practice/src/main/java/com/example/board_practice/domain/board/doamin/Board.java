package com.example.board_practice.domain.board.doamin;


import com.example.board_practice.domain.user.domain.User;
import com.example.board_practice.global.entity.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Board extends BaseTimeEntity {

    @NotNull
    @Size(max = 20)
    private String title;

    @NotNull
    @Size(max = 500)
    private String content;

    @NotNull
    private Integer likeCount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Builder
    public Board(String title, String content, Integer likeCount, User user) {
        this.title = title;
        this.content = content;
        this.likeCount = likeCount;
        this.user = user;
    }

    public void modifyBoard(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void addLikeCount() {
        this.likeCount += 1;
    }

    public void minusLikeCount() {
        this.likeCount -= 1;
    }
}
