package pl.dmuszynski.abstractfactory;

/**
 * Abstract factory - FurnitureFactory interface
 */
public interface FurnitureFactory {
    Chair createChair();
    Table createTable();
    Sofa createSofa();
}
