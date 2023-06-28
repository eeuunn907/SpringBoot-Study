package com.example.springbootstudy.domain.user.service;

import com.example.springbootstudy.domain.user.controller.dto.Request.UserLoginRequest;
import com.example.springbootstudy.domain.user.controller.dto.Request.UserSignUpRequest;
import com.example.springbootstudy.domain.user.domain.User;
import com.example.springbootstudy.domain.user.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

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
        if (!request.getPassword().equals(user.getPassword())) {
            return "비밀번호가 일치하지 않습니다";
        }
        return "로그인에 성공하였습니다";
    }


    public void delete(Long id) {
        userRepository.deleteById(id);
    }
    /*
    public void changePassword(PasswordChangeRequest request){
        User user = userRepository.findByPassword(request.getPassword());

        if(password; == null){
            return ""
        }
    }
*/

}
