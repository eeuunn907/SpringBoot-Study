package com.example.springbootstudy.domain.user.controller;

import com.example.springbootstudy.domain.user.controller.dto.Request.UserLoginRequest;
import com.example.springbootstudy.domain.user.controller.dto.Request.UserSignUpRequest;
import com.example.springbootstudy.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor
@RequestMapping("/user")
@RestController
public class UserController {
    private final UserService userService;

    @PostMapping("/signup")
    public void signUp(@Valid @RequestBody UserSignUpRequest request) {
        userService.signUp(request);
    }

    @PostMapping("/login")
    public void login(@Valid @RequestBody UserLoginRequest request){
        userService.login(request);
    }
    @DeleteMapping("/{user-id}")
    public void deleteuserid(@PathVariable("user-id")Long id){
        userService.delete(id);
    }
}
