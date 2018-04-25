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
import java.util.Collections;
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


        CreditCard creditCard = new CreditCard(
                new Long(1),
                "4435",
                "23424234224",
                "VISA",
                "John",
                "Doe",
                LocalDate.of(2020, 10, 11));

        Payment payment = new Payment(2L, LocalDate.of(2018, 10, 10), new BigDecimal("124.0")
                , creditCard);

        Payment payment2 = new Payment(3L, LocalDate.of(2018, 3, 10), new BigDecimal("100.0")
                , creditCard);
        Payment payment3 = new Payment(4L, LocalDate.of(2019, 4, 11), new BigDecimal("120.0")
                , creditCard);
        Payment payment4 = new Payment(5L, LocalDate.of(2017, 3, 9), new BigDecimal("130.0")
                , creditCard);
        Payment payment5 = new Payment(6L, LocalDate.of(2016, 7, 1), new BigDecimal("90.0")
                , creditCard);

        List<Payment> paymentList = Arrays.asList(payment, payment2, payment3);
        List<Payment> paymentList2 = Arrays.asList(payment4, payment3, payment5);

        Debt debt = new Debt(new Long("1"), new BigDecimal("150"),
                LocalDate.of(2017, 11, 13),
                paymentList);

        Debt debt2 = new Debt(2L, new BigDecimal("160"),
                LocalDate.of(2017, 10, 13),
                Collections.emptyList());
        Debt debt3 = new Debt(3L, new BigDecimal("130"),
                LocalDate.of(2017, 9, 13),
                paymentList2);

        Debtor debtor3 = new Debtor(1L,
                "John",
                "Rambo",
                "9999-999-999",
                Arrays.asList(debt, debt2, debt3));

       List<Debtor> debtors = Arrays.asList(debtor1, debtor2, debtor3);
       repository.setDebtors(debtors);
    }
}
