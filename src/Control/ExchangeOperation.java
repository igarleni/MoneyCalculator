//Terminado

package Control;

import Model.CurrencySet;
import Model.Exchange;
import Model.ExchangeRate;
import Model.Money;
import View.Exchanger.Exchanger;
import View.Persistence.ExchangeRateLoader;
import View.UI.ExchangeDialog;
import View.UI.ExchangeDisplay;

public class ExchangeOperation {
    private final CurrencySet currencySet;
    private final ExchangeDialog exchangeDialog;
    private final ExchangeDisplay exchangeDisplay;

    public ExchangeOperation(CurrencySet currencySet, ExchangeDialog exchangeDialog, ExchangeDisplay exchangeDisplay) {
        this.currencySet = currencySet;
        this.exchangeDialog = exchangeDialog;
        this.exchangeDisplay = exchangeDisplay;
    }

    
    
    public void execute(){
        
        Exchange exchange = readExchange();
        ExchangeRate exchangeRate = loadRate(exchange);
        Money money = calculateExchangeMoney(exchange, exchangeRate);
        displayMoney(money);
    }

    private Exchange readExchange() {
        return exchangeDialog.getExchange();
    }

    private ExchangeRate loadRate(Exchange exchange) {
        return new ExchangeRateLoader(exchange).load();
    }

    private Money calculateExchangeMoney(Exchange exchange, ExchangeRate exchangeRate) {
        return new Exchanger(exchange,exchangeRate).execute();
    }

    private void displayMoney(Money money) {
        exchangeDisplay.display(money);
    }

    
}