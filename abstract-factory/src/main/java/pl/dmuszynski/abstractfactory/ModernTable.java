package pl.dmuszynski.abstractfactory;

/**
 * Concrete product - ModernTable class
 */
public class ModernTable implements Table{
    static final String DESCRIPTION = "This is a modern table";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
