package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockHasNoMoreException extends Exception {

    public BeerStockHasNoMoreException() {
        super("Stock is empty");
    }
}
