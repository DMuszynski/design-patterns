package pl.dmuszynski.abstractfactory;

/**
 * Concrete product - ModernChair class
 */
public class ModernChair implements Chair {
    private final String DESCRIPTION = "This is a modern chair";
    @Override
    public String description() {
        return DESCRIPTION;
    }
}
