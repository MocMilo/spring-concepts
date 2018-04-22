package eu.sii.pl.api;

import eu.sii.pl.api.model.Debtor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Repository {

    private List<Debtor> debtors;

    public List<Debtor> getDebtors() {
        return debtors;
    }
}
