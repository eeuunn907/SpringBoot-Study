package com.example.board_practice.domain.user.exception;

import com.example.board_practice.global.error.exception.CustomException;
import com.example.board_practice.global.error.exception.ErrorCode;

public class UserNotFoundException extends CustomException {

    public static final CustomException EXCEPTION = new UserNotFoundException();

    private UserNotFoundException(){
        super(ErrorCode.USER_NOT_FOUND);
    }
}

