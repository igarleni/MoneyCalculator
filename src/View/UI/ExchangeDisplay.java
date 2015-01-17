package View.UI;

import Model.Money;
import javax.swing.JLabel;

public class ExchangeDisplay extends JLabel{

    public ExchangeDisplay(){
        super();
    }
    
    public void display(Money money) {
        this.setText(" The result is : "+money.getAmount()+" "+money.getCurrency().getSymbol());
    }
    
}