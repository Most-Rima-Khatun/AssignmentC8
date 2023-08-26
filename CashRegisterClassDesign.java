package Problem2;

import Constant.Constant;

public class CashRegisterClassDesign {
    private double payment;
    private  double puchase;

    public CashRegisterClassDesign() {
        payment = Constant.ZER0;
        puchase = Constant.ZER0;
    }
    public void recordPurchasse(double amont)
    {
        puchase = puchase + amont;
    }
    public  void recievePayment(int coinCount, CoinCounter coinType)
    {
        payment = payment + coinCount * coinType.getCoinValue();
    }
    public double getTotalPayment()
    {

        return payment;
    }
    public  double getTotalPurchase()
    {

        return puchase;
    }
    public double getTotalChange(CoinCounter doller)
    {

        return (payment - puchase);
    }
    public double giveChange(CoinCounter coinType)
    {
        double coinValue = coinType.getCoinValue();
        double change = payment - puchase ;
        int numberOfCoins;

        numberOfCoins = (int)(change/coinValue);

        payment = payment - (coinValue * numberOfCoins);

        if(coinType.getCoinValue() == 0.01)
        {
            numberOfCoins++;
        }
        return numberOfCoins;
    }
}
