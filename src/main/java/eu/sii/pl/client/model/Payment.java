package eu.sii.pl.client.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Payment {
    private LocalDate date;
    private BigDecimal value;
    private CreditCard creditCard;

    public LocalDate getDate() {
        return date;
    }

    public BigDecimal getValue() {
        return value;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public Payment() {
    }

    public Payment(LocalDate date, BigDecimal value, CreditCard creditCard) {
        this.date = date;
        this.value = value;
        this.creditCard = creditCard;
    }
}
