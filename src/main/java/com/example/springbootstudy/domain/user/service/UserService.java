package com.example.springbootstudy.domain.user.service;

import com.example.springbootstudy.domain.user.controller.dto.Request.UserLoginRequest;
import com.example.springbootstudy.domain.user.controller.dto.Request.UserSignUpRequest;
import com.example.springbootstudy.domain.user.domain.User;
import com.example.springbootstudy.domain.user.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.expression.spel.ast.NullLiteral;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import javax.transaction.Transactional;
import javax.validation.constraints.Null;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public void signUp(UserSignUpRequest request) {
        userRepository.save(
                User.builder()
                        .accountId(request.getAccountId())
                        .password(request.getPassword())
                        .name(request.getName())
                        .build());
    }

    public String login(UserLoginRequest request) {
        User user = userRepository.findByAccountId(request.getAccountId());
        if (user == null) {
            return "아이디가 일치하지 않습니다";
        }
        if(!request.getPassword().equals(user.getPassword())){
            return "비밀번호가 일치하지 않습니다";
        }
        return "로그인에 성공하였습니다";
    }


    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
