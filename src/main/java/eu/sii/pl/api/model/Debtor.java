package eu.sii.pl.api.model;

import java.util.List;

public class Debtor {
    private String name;
    private String surname;
    private String ssn;
    private List<Debt> debts;

    public Debtor(String name, String surname, String ssn, List<Debt> debts) {
        this.name = name;
        this.surname = surname;
        this.ssn = ssn;
        this.debts = debts;
    }
}
