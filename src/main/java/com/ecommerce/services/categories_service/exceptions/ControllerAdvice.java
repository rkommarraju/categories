package com.ecommerce.services.categories_service.exceptions;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.MethodNotAllowedException;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import java.util.InvalidPropertiesFormatException;

public class ControllerAdvice {


    @ExceptionHandler({InvalidPropertiesFormatException.class})
    public static ResponseEntity<String> handleBadRequest(Exception exception){return null;}
    @ExceptionHandler({MethodNotAllowedException.class, NoResourceFoundException.class})
    public static ResponseEntity<String> handleNotFound(Exception exception){return null;}
    @ExceptionHandler(Exception.class)
    public static ResponseEntity<String> handle(Exception exception){return null;}
}
