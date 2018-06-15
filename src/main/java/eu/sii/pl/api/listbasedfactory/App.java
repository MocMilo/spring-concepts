package eu.sii.pl.api.listbasedfactory;


import eu.sii.pl.api.listbasedfactory.product.CurrencyLoan;
import eu.sii.pl.api.listbasedfactory.product.Product;
import eu.sii.pl.api.listbasedfactory.product.StandardLoan;
import eu.sii.pl.api.listbasedfactory.strategies.CurrencyLoanPricingStrategy;
import eu.sii.pl.api.listbasedfactory.strategies.PricingStrategy;
import eu.sii.pl.api.listbasedfactory.strategies.StandardLoanPricingStrategy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        /**
         *  inspired by:
         *  https://dzone.com/articles/design-patterns-the-strategy-and-factory-patterns
         */

        /**
         * 1. HARDCODED LIST
         * (simulates part of external service that provides "Pricing algorithms as strategies")
         */

        List<PricingStrategy> pricingStrategies = new ArrayList<>();
        pricingStrategies.add(new CurrencyLoanPricingStrategy());
        pricingStrategies.add(new StandardLoanPricingStrategy());

        /**
         * 2. Injecting List to factory
         *    Factory doesn't have hardcoded map, so factory doesn't have to be changed
         *    when adding extra strategies (flexible way of "configuring" factory)
         */
        PricingStrategyFactory pricingStrategyFactory = new PricingStrategyFactory(pricingStrategies);

        /**
         *  3. HARDCODED
         *  preparation products to process
         */
        List<Product> products = new ArrayList<>();
        CurrencyLoan currencyLoan = new CurrencyLoan("Speed Currency Loan", 20);
        StandardLoan standardLoan = new StandardLoan("standard loan", LocalDate.of(2000, 10, 10));
        products.add(currencyLoan);
        products.add(standardLoan);

        /**
         * 4. EXECUTION USING FACTORY
         * foreach Product in list PricingStrategyFactory produces strategy (separate algorithm)
         * to get pricing result
         */
        products.forEach(x -> {
            PricingStrategy pricingStrategy = pricingStrategyFactory.produce(x.getClass());
            System.out.println("product" + x.getClass() + "Pricing Strategy result:"
                    + pricingStrategy.calculatePrice());
        });
    }
}
