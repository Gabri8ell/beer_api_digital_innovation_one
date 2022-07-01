package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockInsufficient extends Exception{

    public BeerStockInsufficient(Long id, int quantityToIncrement) {
        super(String.format("Impossible to decrease the amount %d of beer whit ID %d. Insufficient beer in stock", quantityToIncrement, id));
    }
}
