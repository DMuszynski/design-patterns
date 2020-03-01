package pl.dmuszynski.abstractfactory;

/**
 * Concrete product - VictorianTable class
 */
public class VictorianTable implements Table{
    static final String DESCRIPTION = "This is a victorian table";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
