package udemi.curso.Exeptions.handler;

import java.util.Date;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import udemi.curso.Exeptions.ExepitionResponse;
import udemi.curso.Exeptions.UnsupportedMathOpera;

@ControllerAdvice
@RestController
public class CustomizedResponseHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ExepitionResponse> handelaAllExepitions(Exception ex, WebRequest request) {

        ExepitionResponse exepitionResponse = new ExepitionResponse(
                new Date(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(exepitionResponse, HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @ExceptionHandler(UnsupportedMathOpera.class)
    public final ResponseEntity<ExepitionResponse> handleBadRequestExeption(Exception ex, WebRequest request) {

        ExepitionResponse exepitionResponse = new ExepitionResponse(
                new Date(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(exepitionResponse, HttpStatus.BAD_REQUEST);

    }

}