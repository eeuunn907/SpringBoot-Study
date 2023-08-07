package com.example.board_practice.global.error.exception;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    PASSWORD_MISMATCHED(401, "Password Mismatched"),
    USER_NOT_FOUND(404, "User Not Found"),
    ALREADY_USER_EIXTS(409, "Already User Exits"),

    INTERNAL_SERVER_ERROR(500, "Internal Server Error");


    private final int status;
    private final String message;


}
