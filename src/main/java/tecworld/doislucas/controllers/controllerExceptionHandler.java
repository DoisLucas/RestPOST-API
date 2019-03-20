package tecworld.doislucas.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import tecworld.doislucas.services.exceptions.ErroClass;
import tecworld.doislucas.services.exceptions.ObjectNotFoundException;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class controllerExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<ErroClass> objectNotFound(ObjectNotFoundException e, HttpServletRequest request) {
        ErroClass err = new ErroClass(HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }

}