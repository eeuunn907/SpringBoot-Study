package com.example.board_practice.domain.user.presentation.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SignUpRequest {

    @NotBlank(message = "계정 아이디는 null,공백,띄어쓰기를 허용하지 않습니다.")
    @Size(min = 8, max = 15, message = "최소 8자 ~ 15자 까지 입력 가능합니다.")
    private String accountId;

    @NotBlank(message = "이름은 null,공백,띄어쓰기를 허용하지 않습니다.")
    @Size(min = 1, max = 5, message = "최소 1자 ~ 5자 까지 입력 가능합니다.")
    private String name;

    @NotBlank(message = "비밀번호는 null,공백,띄어쓰기를 허용하지 않습니다.")
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[~!@#$%^&*()+|=])[A-Za-z\\\\\\d~!@#$%^&*()+|=]{8,20}$")
    @Size(min = 8, max = 20, message = "최소 8자 ~ 20자 까지 입력 가능합니다.")
    private String password;

    @NotBlank(message = "전화번호는 null,공백,띄어쓰기를 허용하지 않습니다.")
    @Size(min = 8, max = 20, message = "최소 8자 ~ 20자 까지 입력 가능합니다.")
    private String phoneNumber;
}
