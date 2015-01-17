package View.Exchanger;

import Model.Currency;
import Model.Exchange;
import Model.ExchangeRate;
import Model.Money;

public class Exchanger {
    private final Money money;
    private final ExchangeRate exchangeRate;
    private final Currency currency;

    public Exchanger(Exchange exchange, ExchangeRate exchangeRate) {
        this.money = exchange.getMoney();
        this.exchangeRate = exchangeRate;
        this.currency = exchange.getCurrency();
    }
    
    public Money execute(){
        return new Money(calculateAmount(),exchangeRate.getOut());
    }

    private double calculateAmount() {
        return money.getAmount() * exchangeRate.getRate();
    }
}
