package eu.sii.pl.api.model;

import java.time.LocalDate;

public class CreditCard {
    private String CardId;
    private String vvc;
    private LocalDate expDate;

    public CreditCard(String cardId, String vvc, LocalDate expDate) {
        this.CardId = cardId;
        this.vvc = vvc;
        this.expDate = expDate;
    }
}
