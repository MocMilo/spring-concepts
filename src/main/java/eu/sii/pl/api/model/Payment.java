package eu.sii.pl.api.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Payment {
    LocalDate date;
    BigDecimal value;
    CreditCard creditCard;
}
