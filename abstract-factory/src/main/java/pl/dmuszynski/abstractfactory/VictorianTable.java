package pl.dmuszynski.abstractfactory;

/**
 * Concrete product - VictorianTable class
 */
public class VictorianTable implements Table{
    private final String DESCRIPTION = "This is a victorian table";
    @Override
    public String description() {
        return DESCRIPTION;
    }
}
