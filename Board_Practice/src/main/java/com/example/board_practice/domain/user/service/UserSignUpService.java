package com.example.board_practice.domain.user.service;

import com.example.board_practice.domain.user.domain.User;
import com.example.board_practice.domain.user.domain.repository.UserRepository;
import com.example.board_practice.domain.user.presentation.dto.request.SignUpRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class UserSignUpService {
    private final UserRepository userRepository;

    @Transactional
    public void execute(SignUpRequest request) {

        User user = User.builder()
                .accountId(request.getAccountId())
                .name(request.getName())
                .password(request.getPassword())
                .phoneNumber(request.getPhoneNumber())
                .build();

        userRepository.save(user);
    }
}
