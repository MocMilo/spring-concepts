package eu.sii.pl.api.model;

import java.util.List;

public class Debtor {
    private String name;
    private String surname;
    private String ssn;
    private List<Debt> debts;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSsn() {
        return ssn;
    }

    public List<Debt> getDebts() {
        return debts;
    }

    // may be updated
    public void setDebts(List<Debt> debts) {
        this.debts = debts;
    }

    public Debtor(String name, String surname, String ssn, List<Debt> debts) {
        this.name = name;
        this.surname = surname;
        this.ssn = ssn;
        this.debts = debts;
    }
}
