package com.example.aservice.controller;

import com.example.aservice.dto.ResponseDto;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

@Configuration
public class ResponseController {

    public ResponseDto successResponse(String message, HttpStatus  status,int code,Object data)
    {
        ResponseDto responseDto = new ResponseDto(message,status,data,code);
        return responseDto;

    }
}
