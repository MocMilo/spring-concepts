package eu.sii.pl.client.model.forms;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class DebtorForm {

    @NotNull
    @Size(min=2, max=30)
    private String name;
    @NotNull
    @Size(min=2, max=40)
    private String surname;
    @NotNull
    private String ssn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


}
