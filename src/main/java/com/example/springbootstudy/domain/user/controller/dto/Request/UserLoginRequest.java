package com.example.springbootstudy.domain.user.controller.dto.Request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

@Getter
@Builder
@AllArgsConstructor
public class UserLoginRequest {
    @NotNull(message = "아이디를 입력하세요")
    private String accountId;

    @NotNull(message = "비밀번호를 입력하세요")
    @Column(length = 30)
    private String password;

}
