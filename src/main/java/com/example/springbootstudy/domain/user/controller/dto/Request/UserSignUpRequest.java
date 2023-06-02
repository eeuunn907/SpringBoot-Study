package com.example.springbootstudy.domain.user.controller.dto.Request;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserSignUpRequest {
    private String accountId;
    private String password;
    private String name;
}
