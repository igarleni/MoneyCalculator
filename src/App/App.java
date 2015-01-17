//Terminado

package App;

import Control.ExchangeOperation;
import Model.CurrencySet;
import View.Persistence.CurrencySetLoader;
import View.UI.MainFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class App {
    
    public static void main (String[] args) throws SQLException{
        CurrencySet currencySet = new CurrencySetLoader().load();
        MainFrame frame = new MainFrame(currencySet.toArray());
        frame.registerListenerForCalculateButton(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new ExchangeOperation( currencySet, frame.getExchangeDialog(), frame.getExchangeDisplay()).execute();
            }
        });
    }
    
}
