package pl.dmuszynski.abstractfactory;

/**
 * Concrete product - ModernSofa class
 */
public class ModernSofa implements Sofa{
    static final String DESCRIPTION = "This is a modern sofa";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
