package pl.dmuszynski.abstractfactory;

/**
 * Concrete product - VictorianChair class
 */
public class VictorianChair implements Chair {
    static final String DESCRIPTION = "This is a victorian chair";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
