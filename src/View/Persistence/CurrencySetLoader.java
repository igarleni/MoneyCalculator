package View.Persistence;

import Model.Currency;
import Model.CurrencySet;

public class CurrencySetLoader {

    public CurrencySetLoader() {
    }
    
    public CurrencySet load() {
        
        CurrencySet currencySet = new CurrencySet();
        currencySet.addCurrency(new Currency ("Euro","€","EUR"));
        currencySet.addCurrency(new Currency ("Euro","£","GBP"));
        currencySet.addCurrency(new Currency ("Euro","$","USD"));
        
        return currencySet;
    }

}
