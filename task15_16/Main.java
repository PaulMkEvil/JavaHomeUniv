package task15_16;

public class Main {
    public static void main(String[] args)
    {
        Bank sberbank = new Bank("SBERBANK");

        ATM atm1 = new ATM("ATM1", sberbank);
        ATM atm2 = new ATM("ATM2", sberbank);

        Thread myThready0 = new Thread(atm1);
        Thread myThready1 = new Thread(atm2);
        myThready0.start();
        myThready1.start();
    }
}
