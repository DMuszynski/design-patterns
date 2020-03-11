package pl.dmuszynski.factorymethod;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Ship transport");
    }
}
