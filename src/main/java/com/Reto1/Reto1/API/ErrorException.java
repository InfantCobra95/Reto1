package com.Reto1.Reto1.API;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Element Not Found")
public class ErrorException extends RuntimeException {

}
