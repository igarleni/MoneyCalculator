package Model;

import java.util.Date;

public class ExchangeRate {
    private final Currency in;
    private final Currency out;
    private final double rate;
    private final Date date;

    public ExchangeRate(Currency in, Currency out, double rate, Date date) {
        this.in = in;
        this.out = out;
        this.rate = rate;
        this.date = date;
    }

    public Currency getIn() {
        return in;
    }

    public Currency getOut() {
        return out;
    }

    public double getRate() {
        return rate;
    }

    public Date getDate() {
        return date;
    }
    
    
}
