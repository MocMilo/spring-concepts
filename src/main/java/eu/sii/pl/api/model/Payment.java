package eu.sii.pl.api.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Payment {
    private LocalDate date;
    private BigDecimal value;
    private CreditCard creditCard;

    public Payment(LocalDate date, BigDecimal value, CreditCard creditCard) {
        this.date = date;
        this.value = value;
        this.creditCard = creditCard;
    }
}
