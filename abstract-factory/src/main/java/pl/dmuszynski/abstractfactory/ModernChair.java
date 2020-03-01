package pl.dmuszynski.abstractfactory;

/**
 * Concrete product - ModernChair class
 */
public class ModernChair implements Chair {
    static final String DESCRIPTION = "This is a modern chair";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
