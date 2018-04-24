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
import java.util.List;

@Configuration
@ComponentScan("eu.sii.pl.api")
public class ApplicationConfiguration {

    @Autowired
    Repository repository;

    @PostConstruct
    public void init() {


        Debtor debtor1 = new Debtor(new Long("1"),"John", "Smith", "078-05-1120", Arrays.asList(
                new Debt(new Long("1"), new BigDecimal("100"),
                        LocalDate.of(2018, 2, 10),
                        Arrays.asList())));

        Debtor debtor2 = new Debtor(new Long("1"),"Joe", "Doe", "088-04-2750", Arrays.asList(
                new Debt(new Long("1"), new BigDecimal("150"),
                        LocalDate.of(2017, 11, 13),
                        Arrays.asList(
                                new Payment(new Long("1"), LocalDate.of(2018, 03, 15),
                                        new BigDecimal("60"),

                                        new CreditCard(new Long("1"),"4539128673131380", "3234","Visa", "Joe","Doe",
                                                LocalDate.of(2020, 10, 31)))
                        ))));
       List<Debtor> debtors = Arrays.asList(debtor1, debtor2);
       repository.setDebtors(debtors);
    }
}
