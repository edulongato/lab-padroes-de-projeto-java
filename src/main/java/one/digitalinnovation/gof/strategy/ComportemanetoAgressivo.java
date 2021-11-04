package one.digitalinnovation.gof.strategy;

public class ComportemanetoAgressivo implements Comportamento {


    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente...");
    }
}
