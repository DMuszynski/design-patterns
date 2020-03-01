package pl.dmuszynski.abstractfactory;

/**
 * Concrete product - VictorianSofa class
 */
public class VictorianSofa implements Sofa{
    static final String DESCRIPTION = "This is a victorian sofa";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
