package pl.dmuszynski.factorymethod;

public class SeaLogistics implements Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
