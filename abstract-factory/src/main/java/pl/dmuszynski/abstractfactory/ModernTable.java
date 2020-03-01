package pl.dmuszynski.abstractfactory;

/**
 * Concrete product - ModernTable class
 */
public class ModernTable implements Table{
    private final String DESCRIPTION = "This is a modern table";
    @Override
    public String description() {
        return DESCRIPTION;
    }
}
