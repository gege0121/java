package DesignPattern.ChainOfResponsibility;

public class DriverClass {

    public static void main(String[] args){
        Dollar10Dispenser dollar10Dispenser=new Dollar10Dispenser();
        Dollar20Dispenser dollar20Dispenser=new Dollar20Dispenser();
        Dollar50Dispenser dollar50Dispenser=new Dollar50Dispenser();

        dollar50Dispenser.setNextChain(dollar20Dispenser);
        dollar20Dispenser.setNextChain(dollar10Dispenser);

        Currency c1=new Currency(100);
        dollar50Dispenser.dispense(c1);
        Currency c2=new Currency(50);
        dollar50Dispenser.dispense(c2);
        Currency c3=new Currency(60);
        dollar50Dispenser.dispense(c3);
    }
}
