package eu.sii.pl.api.model;

import java.time.LocalDate;

public class CreditCard {
    private  Long id;
    private String ccNumber;
    private String cvv;
    private String issuingNetwork;
    private String firstName;
    private String lastName;
    private LocalDate expDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getIssuingNetwork() {
        return issuingNetwork;
    }

    public void setIssuingNetwork(String issuingNetwork) {
        this.issuingNetwork = issuingNetwork;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }

    public CreditCard(Long id, String ccNumber, String cvv, String issuingNetwork, String firstName, String lastName, LocalDate expDate) {
        this.id = id;
        this.ccNumber = ccNumber;
        this.cvv = cvv;
        this.issuingNetwork = issuingNetwork;
        this.firstName = firstName;
        this.lastName = lastName;
        this.expDate = expDate;
    }
}
