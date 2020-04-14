package DesignPattern.ChainOfResponsibility;

public class Dollar50Dispenser implements DispenseChain{
    private DispenseChain chain;

    public void setNextChain(DispenseChain nextChain){
        this.chain=nextChain;
    }

    public void dispense(Currency cur){
        if(cur.getAmount() >= 50){
            int num = cur.getAmount()/50;
            int remainder = cur.getAmount() % 50;
            System.out.println("dispense 50 :" +" "+num);
            if (remainder >0)
            this.chain.dispense(new Currency(remainder));

        }
        else{
            this.chain.dispense(cur);
        }
    }
}
