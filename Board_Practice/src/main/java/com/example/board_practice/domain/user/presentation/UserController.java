package com.example.board_practice.domain.user.presentation;


import com.example.board_practice.domain.user.presentation.dto.request.SignUpRequest;
import com.example.board_practice.domain.user.service.UserSignUpService;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/user")
@RestController
public class UserController {
    private final UserSignUpService userSignUpService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/signup")
    public void signup(@RequestBody @Valid SignUpRequest request){
        userSignUpService.SignUp(request);
    }

}
