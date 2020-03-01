package pl.dmuszynski.abstractfactory;

/**
 * Concrete factory - VictorianFurnitureFactory class
 */
public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
    @Override
    public Table createTable() {
        return new VictorianTable();
    }
    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
