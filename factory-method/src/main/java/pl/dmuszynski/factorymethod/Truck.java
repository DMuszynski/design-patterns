package pl.dmuszynski.factorymethod;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Truck transport");
    }
}
