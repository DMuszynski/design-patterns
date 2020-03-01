package pl.dmuszynski.abstractfactory;

/**
 * Concrete product - VictorianChair class
 */
public class VictorianChair implements Chair {
    private final String DESCRIPTION = "This is a victorian chair";
    @Override
    public String description() {
        return DESCRIPTION;
    }
}
