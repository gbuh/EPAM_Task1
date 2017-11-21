package domain;

/**
 * Type meals enumeration
 * 
 * @version 1.11 20 Nov 2017
 * @author  Igor Lipko
 */
public enum MealsType {
    
    ALL_INCLUSIVE       (1, "Все включено"),
    BREAKFAST           (2, "Завтрак"),
    BREAKFAST_AND_LUNCH (3, "Завтрак и обед"),
    DINNER              (4, "Ужин"),
    LUNCH               (5, "Обед"),
    NOT_MEALS           (6, "Без питания");
    
    private int index;
    private String name;
    
    MealsType(int index, String name) {
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
