package com.example.board_practice.domain.user.exception;

import com.example.board_practice.global.error.exception.CustomException;
import com.example.board_practice.global.error.exception.ErrorCode;

public class UserAlreadyExitsException extends CustomException {

    public static final CustomException EXCEPTION = new UserAlreadyExitsException();

    private UserAlreadyExitsException() {
        super(ErrorCode.ALREADY_USER_EIXTS);
    }
}
