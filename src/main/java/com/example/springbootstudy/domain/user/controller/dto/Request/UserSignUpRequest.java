package com.example.springbootstudy.domain.user.controller.dto.Request;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED) // 파라미터가 없는 기본 생성자를 생성
public class UserSignUpRequest {

    @NotNull(message = "아이디를 입력하세요")
    @Size(min = 8,max = 20,message = "8자 ~ 20자 입력 가능합니다") // 최소,최대 사이즈를 지정할 수 있고 올바르지 않을 경우 Notnull 과 함께 message 를 출력한다
    private String accountId;

    @NotNull(message = "비밀번호를 입력하세요")
    @Pattern(regexp="(?=.*\\d)(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8,20}", message = "비밀번호는 특수기호 숫자 포함 8-20자여야 합니다")
    private String password;

    @NotNull(message = "이름을 입력하세요")
    @Size(min = 1,max = 5,message = "1자 ~ 5자 입력 가능합니다")
    private String name;
}
