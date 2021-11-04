package one.digitalinnovation.gof.strategy;

public class ComportemanetoDefensivo implements Comportamento {


    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamente...");
    }
}
