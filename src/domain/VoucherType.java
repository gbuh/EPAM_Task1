package domain;

/**
 * Type voucher enumeration
 * 
 * @version 1.11 20 Nov 2017
 * @author  Igor Lipko
 */
public enum VoucherType {
    
    CRUISE    (1, "Круиз"),
    REST      (2, "Отдых"),
    SHOPPING  (3, "Шопинг"),
    TREATMENT (4, "Лечение"),
    TRIP      (5, "Экскурсия");
    
    private int index;
    private String name;
    
    VoucherType(int index, String name) {
        this.index = index;
        this.name = name;
    }
    
    public int getIndex() {
        return index;
    }
    
    public String getName() {
        return name;
    }
}
