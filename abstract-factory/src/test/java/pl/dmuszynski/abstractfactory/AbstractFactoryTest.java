package pl.dmuszynski.abstractfactory;

import pl.dmuszynski.abstractfactory.App.FurnitureFactoryMaker;
import pl.dmuszynski.abstractfactory.App.FurnitureFactoryMaker.FurnitureType;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Testing AbstractFactory pattern
 */
public class AbstractFactoryTest {
    private App app = new App();
    private FurnitureFactory modernFurnitureFactory;
    private FurnitureFactory victorianFurnitureFactory;

    @Before
    public void initFurnitureFactory() {
        this.modernFurnitureFactory = FurnitureFactoryMaker.makeFurnitureFactory(FurnitureType.MODERN);
        this.victorianFurnitureFactory = FurnitureFactoryMaker.makeFurnitureFactory(FurnitureType.VICTORIAN);
    }

    @Test
    public void testChair() {
        final var victorianChair = app.getChair(this.victorianFurnitureFactory);
        assertTrue(victorianChair instanceof VictorianChair);
        assertEquals(VictorianChair.DESCRIPTION, victorianChair.getDescription());

        final var modernChair = app.getChair(this.modernFurnitureFactory);
        assertTrue(modernChair instanceof ModernChair);
        assertEquals(ModernChair.DESCRIPTION, modernChair.getDescription());
    }

    @Test
    public void testTable() {
        final var victorianTable = app.getTable(this.victorianFurnitureFactory);
        assertTrue(victorianTable instanceof VictorianTable);
        assertEquals(VictorianTable.DESCRIPTION, victorianTable.getDescription());

        final var modernTable = app.getTable(this.modernFurnitureFactory);
        assertTrue(modernTable instanceof ModernTable);
        assertEquals(ModernTable.DESCRIPTION, modernTable.getDescription());
    }

    @Test
    public void testSofa() {
        final var victorianSofa = app.getSofa(this.victorianFurnitureFactory);
        assertTrue(victorianSofa instanceof VictorianSofa);
        assertEquals(VictorianSofa.DESCRIPTION, victorianSofa.getDescription());

        final var modernSofa = app.getSofa(this.modernFurnitureFactory);
        assertTrue(modernSofa instanceof ModernSofa);
        assertEquals(ModernSofa.DESCRIPTION, modernSofa.getDescription());
    }

    @Test
    public void testModernFurniture() {
        app.createFurniture(modernFurnitureFactory);
        final var chair = app.getChair();
        final var table = app.getTable();
        final var sofa = app.getSofa();

        assertTrue(chair instanceof ModernChair);
        assertEquals(ModernChair.DESCRIPTION, chair.getDescription());
        assertTrue(table instanceof ModernTable);
        assertEquals(ModernTable.DESCRIPTION, table.getDescription());
        assertTrue(sofa instanceof ModernSofa);
        assertEquals(ModernSofa.DESCRIPTION, sofa.getDescription());
    }

    @Test
    public void testVictorianFurniture() {
        app.createFurniture(victorianFurnitureFactory);
        final var chair = app.getChair();
        final var table = app.getTable();
        final var sofa = app.getSofa();

        assertTrue(chair instanceof VictorianChair);
        assertEquals(VictorianChair.DESCRIPTION, chair.getDescription());
        assertTrue(table instanceof VictorianTable);
        assertEquals(VictorianTable.DESCRIPTION, table.getDescription());
        assertTrue(sofa instanceof VictorianSofa);
        assertEquals(VictorianSofa.DESCRIPTION, sofa.getDescription());
    }
}
