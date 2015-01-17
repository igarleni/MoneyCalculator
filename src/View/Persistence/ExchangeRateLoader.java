package View.Persistence;

import Model.Exchange;
import Model.ExchangeRate;
import java.util.Date;

public class ExchangeRateLoader {
    
    private final Exchange exchange;

    public ExchangeRateLoader(Exchange exchange) {
        this.exchange = exchange;
    }
    
    public ExchangeRate load() {
        return createExchangeRate();
    }

    private ExchangeRate createExchangeRate() {
        return new ExchangeRate(exchange.getMoney().getCurrency(), exchange.getCurrency(), 0.8, new Date());
    }
    
}
