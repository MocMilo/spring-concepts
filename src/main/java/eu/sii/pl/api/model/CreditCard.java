package eu.sii.pl.api.model;

import java.time.LocalDate;

public class CreditCard {
    private String CardId;
    private String cvv;
    private String issuingNetwork;
    private LocalDate expDate;

    public String getCardId() {
        return CardId;
    }

    public String getCvv() {
        return cvv;
    }

    public String getIssuingNetwork() {
        return issuingNetwork;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public CreditCard(String cardId, String cvv, String issuingNetwork, LocalDate expDate) {
        CardId = cardId;
        this.cvv = cvv;
        this.issuingNetwork = issuingNetwork;
        this.expDate = expDate;
    }
}
