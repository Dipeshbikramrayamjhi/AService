package com.example.aservice.exceptionHandler;

import com.example.aservice.controller.ResponseController;
import com.example.aservice.dto.HospitalRequestDto;
import com.example.aservice.service.HospitalService;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptionHandler extends ResponseController {

  private final HospitalService hospitalService;

  public ExceptionHandler(HospitalService hospitalService) {
    this.hospitalService = hospitalService;
  }

  @org.springframework.web.bind.annotation.ExceptionHandler
//@ResponseStatus adi mathi batai status pathauni vaya use garni ho nitra na garni
public ResponseEntity<?> nullPointerHandler(NullPointerException e, WebRequest request, HospitalRequestDto hospitalRequestDto)
{
  return ResponseEntity.ok(successResponse(e.getMessage(), HttpStatus.BAD_REQUEST,HttpStatus.BAD_REQUEST.value(),hospitalService.save(hospitalRequestDto)));
}
@org.springframework.web.bind.annotation.ExceptionHandler
  public ResponseEntity<?> handleValidation (MethodArgumentNotValidException e) {
    Map<String, String> errorMap = new HashMap<>();

    //to get specific error
  //to handler the other exception like notblank notempty and other specific exception valid exception
    e.getAllErrors().forEach(error -> {
      String fieldName = ((FieldError) error).getField();
      String errorMessage = ((FieldError) error).getDefaultMessage();
      errorMap.put(fieldName, errorMessage);
    });
    return new ResponseEntity<>(errorMap, HttpStatus.BAD_REQUEST);
  }

  @org.springframework.web.bind.annotation.ExceptionHandler
  public ResponseEntity<?> dataIntegrityViolationExceptionHandler(DataIntegrityViolationException e)
  {

    String mostSpecificCause = e.getMostSpecificCause().getMessage();
  String field =   mostSpecificCause.substring(mostSpecificCause.indexOf("(")+1,mostSpecificCause.indexOf(")"));
  String value = mostSpecificCause.substring(mostSpecificCause.indexOf("="));
  value = value.substring(value.indexOf("(")+1,value.indexOf(")"));
HospitalRequestDto hospitalRequestDto = new HospitalRequestDto();
//  switch (field){
//    case "email" -> hospitalRequestDto = hospitalService.findByEmail(value);
//  }

    return ResponseEntity.ok().body(field+": " + value +"  is already exists" + "already exists data are" + hospitalRequestDto);
  }
}
