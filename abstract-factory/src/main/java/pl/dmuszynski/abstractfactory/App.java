package pl.dmuszynski.abstractfactory;

/**
 * Demo class. Everything comes together here.
 */
public class App {

    private Chair chair;
    private Table table;
    private Sofa sofa;

    Chair getChair(final FurnitureFactory furnitureFactory) {
        return furnitureFactory.createChair();
    }

    Table getTable(final FurnitureFactory furnitureFactory) {
        return furnitureFactory.createTable();
    }

    Sofa getSofa(final FurnitureFactory furnitureFactory) {
        return furnitureFactory.createSofa();
    }

    Chair getChair() {
        return chair;
    }

    Table getTable() {
        return table;
    }

    Sofa getSofa() {
        return sofa;
    }

    /**
     * The factory of furniture factories
     */
    static class FurnitureFactoryMaker {
        /**
         * Enumeration for the different types of furniture
         */
        public enum FurnitureType {
            VICTORIAN, MODERN
        }

        /**
         * The factory method to create FurnitureFactory concrete objects;
         *
         * @param type furniture type
         * @return concrete object of FurnitureFactory
         */
        static FurnitureFactory makeFurnitureFactory(FurnitureType type) {
            switch (type) {
                case VICTORIAN:
                    return new VictorianFurnitureFactory();
                case MODERN:
                    return new ModernFurnitureFactory();
                default:
                    throw new IllegalArgumentException("FurnitureType not supported.");
            }
        }
    }

    /**
     * Furniture creator method
     *
     * @param furnitureFactory concrete furniture factory object
     */
    void createFurniture(FurnitureFactory furnitureFactory) {
        this.chair = furnitureFactory.createChair();
        this.table = furnitureFactory.createTable();
        this.sofa = furnitureFactory.createSofa();
    }

    /**
     * Display furniture method
     */
    private void displayFurniture() {
        System.out.println(chair.getDescription());
        System.out.println(table.getDescription());
        System.out.println(sofa.getDescription());
        System.out.println(" ");
    }

    /**
     * Program shows the operation of an abstract factory
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        App app = new App();

        System.out.println("Victorian Furniture");
        app.createFurniture(new VictorianFurnitureFactory());
        app.displayFurniture();

        System.out.println("Modern Furniture");
        app.createFurniture(new ModernFurnitureFactory());
        app.displayFurniture();
    }
}
