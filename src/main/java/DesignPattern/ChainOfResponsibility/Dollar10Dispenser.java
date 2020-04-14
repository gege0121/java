package DesignPattern.ChainOfResponsibility;

public class Dollar10Dispenser implements DispenseChain{
    private DispenseChain chain;
    public void setNextChain(DispenseChain nextChain){
        this.chain=nextChain;
    }

    public void dispense(Currency cur){
        if(cur.getAmount() >= 10){
            int num = cur.getAmount()/10;
//            int remainder = cur.getAmount() % 10;
            System.out.println("dispense 10 :" +" "+num);
//            this.chain.dispense(new Currency(remainder));
        }
        else{
            System.out.println("unable to dispense");
//            this.chain.dispense(cur);
        }
    }
}
