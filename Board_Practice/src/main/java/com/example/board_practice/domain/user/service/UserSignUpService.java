package com.example.board_practice.domain.user.service;


import com.example.board_practice.domain.user.domain.User;
import com.example.board_practice.domain.user.domain.repository.UserRepository;
import com.example.board_practice.domain.user.presentation.dto.request.SignUpRequest;

import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserSignUpService {
    private final UserRepository userRepository;

    @Transactional
    public void SignUp(SignUpRequest request){
        User user = User.builder()
                .accountId(request.getAccountId())
                .name(request.getName())
                .password(request.getPassword())
                .phoneNumber(request.getPhoneNumber())
                .build();

        userRepository.save(user);
    }

}
