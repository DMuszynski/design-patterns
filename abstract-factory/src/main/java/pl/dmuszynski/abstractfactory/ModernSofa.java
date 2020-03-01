package pl.dmuszynski.abstractfactory;

/**
 * Concrete product - ModernSofa class
 */
public class ModernSofa implements Sofa{
    private final String DESCRIPTION = "This is a modern sofa";
    @Override
    public String description() {
        return DESCRIPTION;
    }
}
