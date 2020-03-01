package pl.dmuszynski.abstractfactory;

/**
 * Demo class. Everything comes together here.
 */
public class App {

    private Chair chair;
    private Table table;
    private Sofa sofa;

    /**
     * The factory of furniture factories
     */
    public static class FurnitureFactoryMaker {
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
        public static FurnitureFactory makeFurnitureFactory(FurnitureType type) {
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
    private void createFurniture(FurnitureFactory furnitureFactory) {
        this.chair = furnitureFactory.createChair();
        this.table = furnitureFactory.createTable();
        this.sofa = furnitureFactory.createSofa();
    }

    /**
     * Display furniture method
     */
    private void displayFurniture() {
        System.out.println(chair.description());
        System.out.println(table.description());
        System.out.println(sofa.description());
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
