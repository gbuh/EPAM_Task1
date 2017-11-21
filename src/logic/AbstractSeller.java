package logic;

/**
 * This class is the root of the Seller hierarchy. Provides basic methods
 * to get and set fields values.
 * 
 * @version 1.2 21 Nov 2017
 * @author  Igor Lipko
 */
public abstract class AbstractSeller {
    private String name;

    public AbstractSeller() {};

    public AbstractSeller(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void offer() {};
}
