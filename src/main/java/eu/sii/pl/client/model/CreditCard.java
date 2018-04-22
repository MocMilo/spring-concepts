package eu.sii.pl.client.model;

import java.time.LocalDate;

public class CreditCard {
    private String CardId;
    private String cvv;
    private LocalDate expDate;
    private String IssuingNetwork;

    public String getCardId() {
        return CardId;
    }

    public String getCvv() {
        return cvv;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public String getIssuingNetwork() {
        return IssuingNetwork;
    }

    public CreditCard(String cardId, String cvv, LocalDate expDate, String issuingNetwork) {
        CardId = cardId;
        this.cvv = cvv;
        this.expDate = expDate;
        IssuingNetwork = issuingNetwork;
    }
}
