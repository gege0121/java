package DesignPattern.ChainOfResponsibility;

public class Dollar10Dispenser implements DispenseChain{
    private DispenseChain chain;
    public void setNextChain(DispenseChain nextChain){
        this.chain=nextChain;
    }

    public void dispense(Currency cur){
        if(cur.getAmount() >= 10){
            int num = cur.getAmount()/10;
            System.out.println("dispense 10 :" +" "+num);
        }
        else{
            System.out.println("unable to dispense");
        }
    }
}
