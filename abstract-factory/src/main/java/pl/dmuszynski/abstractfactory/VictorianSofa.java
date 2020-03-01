package pl.dmuszynski.abstractfactory;

/**
 * Concrete product - VictorianSofa class
 */
public class VictorianSofa implements Sofa{
    private final String DESCRIPTION = "This is a victorian sofa";
    @Override
    public String description() {
        return DESCRIPTION;
    }
}
