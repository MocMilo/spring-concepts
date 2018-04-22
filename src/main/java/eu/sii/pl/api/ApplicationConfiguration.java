package eu.sii.pl.api;

import eu.sii.pl.api.model.CreditCard;
import eu.sii.pl.api.model.Debt;
import eu.sii.pl.api.model.Debtor;
import eu.sii.pl.api.model.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

@Configuration
@ComponentScan("eu.sii.pl.api")
public class ApplicationConfiguration {

    @Autowired
    Repository repository;

    @PostConstruct
    void init() {


        Debtor debtor1 = new Debtor("John", "Smith", "342342342", Arrays.asList(
                new Debt(new BigDecimal("100"),
                        LocalDate.of(2018, 2, 10),
                        Arrays.asList())));

        Debtor debtor2 = new Debtor("Joe", "Doe", "555553435", Arrays.asList(
                new Debt(new BigDecimal("100"),
                        LocalDate.of(2017, 11, 13),
                        Arrays.asList(
                                new Payment(LocalDate.of(2018, 03, 15),
                                        new BigDecimal("60"),

                                        new CreditCard("2142342", "3234",
                                                LocalDate.of(2020, 10, 31)))
                        ))));
       repository.getDebtors().add(debtor1);
       repository.getDebtors().add(debtor2);
    }
}
