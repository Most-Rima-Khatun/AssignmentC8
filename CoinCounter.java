package Problem2;

public class CoinCounter {

    private double coinValue ;
    private String coinName ;

    public CoinCounter(double value ,String name)
    {
        coinValue = value;
        coinName = name;
    }

    public double getCoinValue()
    {
        return coinValue;
    }
    public String getCoinName()
    {
        return coinName;
    }
}

