package eu.sii.pl.api;

import eu.sii.pl.api.model.Debtor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.NoSuchElementException;


@RestController
@RequestMapping("/balances")
public class ApiController {

    @Autowired
    private Repository repository;

    @GetMapping("/debtor/{ssn}")
    public Debtor getBalance(@PathVariable(name = "ssn") String ssn) {
        return repository.getDebtors().stream()
                .filter(x -> x.getSsn().equals(ssn))
                .findFirst()
                .orElseThrow(NoSuchElementException::new);
    }
}
