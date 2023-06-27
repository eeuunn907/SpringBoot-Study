package com.example.springbootstudy.domain.user.controller;

import com.example.springbootstudy.domain.user.controller.dto.Request.PasswordChangeRequest;
import com.example.springbootstudy.domain.user.controller.dto.Request.UserLoginRequest;
import com.example.springbootstudy.domain.user.controller.dto.Request.UserSignUpRequest;
import com.example.springbootstudy.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor // final 이나 @Notnull 인 필드 값만 파라미터로 받는 생성자 만듦
@RequestMapping("/user") // 요청을 특정 매소드와 매핑하기 위해 사용하는 것
@RestController // @RestController = @Controller + @ResponseBody
public class UserController {
    private final UserService userService;

    @PostMapping("/signup") // 서버에 리소스를 등록(저장)
    public void signUp(@Valid @RequestBody UserSignUpRequest request) {
        userService.signUp(request);
    }

    @PostMapping("/login") // 서버에 리소를 등록(저장)
    public void login(@Valid @RequestBody UserLoginRequest request){
        userService.login(request);
    }
    @DeleteMapping("/{user-id}") //서버의 리소스를 삭제 (Q) 괄호 안에 중괄호 왜 쓰는지??
    public void userid(@PathVariable("user-id")Long id){
        userService.delete(id);
    }

    /*
    @PatchMapping("/user/password")
    public void changePassword(@Valid @RequestBody PasswordChangeRequest request){userService.changePassword(request);}

     */
}


