package domain;

/**
 * This class is the root of the Voucher hierarchy. Provides basic methods
 * to get and set fields values.
 * 
 * @version 1.11 20 Nov 2017
 * @author  Igor Lipko
 */
public abstract class AbstactVoucher {
    private VoucherType type;
    private String description;
    private Integer days;
    private MealsType meals;
    private TransportType transport;
    
    public VoucherType getType() {
        return type;
    }
    
    public void setType(VoucherType type) {
        this.type = type;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public int getDays() {
        return days;
    }
    
    public void setDays(int days) {
        this.days = days;
    }
    
    public MealsType getMeals() {
        return meals;
    }
    
    public void setMeals(MealsType meals) {
        this.meals = meals;
    }
    
    public TransportType getTransport() {
        return transport;
    }
    
    public void setTransport(TransportType transport) {
        this.transport = transport;
    }
    
    @Override
    public String toString() {
        return "\nПутевка " + type + ": " + description + " на " + days
                + " дней c питанием: " + meals + ". Транспорт: " + transport;
    }
}
