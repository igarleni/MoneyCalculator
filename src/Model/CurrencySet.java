//terminado

package Model;

import java.util.ArrayList;
import java.util.List;

public class CurrencySet{
    
    private final List<Currency> currencyList;

    public CurrencySet() {
        currencyList = new ArrayList<>();
    }
    
    public void addCurrency(Currency currency){
        currencyList.add(currency);
    }
    
    public Currency[] toArray (){
        return currencyList.toArray(new Currency [currencyList.size()]);
    }

}
