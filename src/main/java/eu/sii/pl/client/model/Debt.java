package eu.sii.pl.client.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Debt {
    private BigDecimal debtValue;
    private LocalDate repaymentDate;
    private List<Payment> payments;

    public Debt(BigDecimal debtValue, LocalDate repaymentDate, List<Payment> payments) {
        this.debtValue = debtValue;
        this.repaymentDate = repaymentDate;
        this.payments = payments;
    }

}
