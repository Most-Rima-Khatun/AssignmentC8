package Problem2;

import Constant.P2Constant;

public class CashRegisterRunner
{
    public static void main(String[] args)
    {
        CashRegisterClassDesign cashRegister = new CashRegisterClassDesign();
        cashRegister.recordPurchasse(2.19);
        cashRegister.recordPurchasse(1.96);
        cashRegister.recordPurchasse(4.91);


       cashRegister.recievePayment(40,P2Constant.DOLLER);

        System.out.printf("Total purchase : $%5.2f\n" +
                        "      Payment :        $%5.2f\n" +
                        "     Change:     $%5.2f\n",
                cashRegister.getTotalPurchase(),
                cashRegister.getTotalPayment(),
                cashRegister.getTotalChange(P2Constant.DOLLER));
                System.out.printf("Numbers of Dollers: %3d\n",(int)cashRegister.giveChange(P2Constant.DOLLER));
                System.out.printf("Numbers of Quarters: %2d\n",(int)cashRegister.giveChange(P2Constant.QUARTER));
                System.out.printf("Numbers of Dime: %5d\n",(int)cashRegister.giveChange(P2Constant.DIME));
                System.out.printf("Numbers of Nickels: %3d\n",(int)cashRegister.giveChange(P2Constant.NICKEL));
                System.out.printf("Numbers of Penney: %3d\n",(int)cashRegister.giveChange(P2Constant.PENNY));


    }

}

