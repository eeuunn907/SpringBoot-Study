package com.example.springbootstudy.domain.user.controller.dto.Request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter // private 을 사용하면 접근을 막는데 외부에서 사용하기 위해서는 getter 가 필요하다
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자를 만듦
public class UserLoginRequest {
    @NotNull(message = "아이디를 입력하세요") // null 을 허용하지 않는다 , "" 은 허용하게 된다.
    private String accountId; // 접근 허용 하지 않고 문자열인 아이디를 입력 받는다

    @NotNull(message = "비밀번호를 입력하세요")
    @Column(length = 30)
    private String password;

}
