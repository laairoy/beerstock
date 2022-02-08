package me.dio.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BeerNotFoundException extends Exception {
    public BeerNotFoundException(String name) {
        super(String.format("Beer %s Not Found.", name));
    }
    public BeerNotFoundException(Long id) {
        super("Beer Not Found: " + id);
    }
}
