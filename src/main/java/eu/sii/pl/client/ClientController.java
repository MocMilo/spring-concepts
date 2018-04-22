package eu.sii.pl.client;

import eu.sii.pl.client.model.Debtor;
import eu.sii.pl.client.model.forms.DebtorForm;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;

@Controller
public class ClientController implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/balance").setViewName("balanceform");
    }

    @GetMapping("/")
    public String showForm(DebtorForm debtorForm) {
        return "debtorform";
    }

    @PostMapping("/")
    public String validateDebtorForm(@Valid DebtorForm debtorForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "debtorform";
        }
        // TODO send deptor form attribute to /balance
        return "redirect:/balance";
    }


    @GetMapping("/balance")
    public ModelAndView getDebtorBalance() {

        // TODO some rest client logic

        final String uri = "http://localhost:8090/balances/debtor/088-04-2750";
        RestTemplate restTemplate = new RestTemplate();

        Debtor debtor = restTemplate.getForObject(uri, Debtor.class);

        System.out.println("Debtor fetched form api:" + debtor.getName());

        ModelAndView balance = new ModelAndView("balanceform");
        balance.addObject("debtor", debtor);
        return balance;
    }
}
