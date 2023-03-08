package com.example.aservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto {

    private  String message;
    private HttpStatus status;
    private  Object data;
    private  int code;
}
