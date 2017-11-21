package domain;

/**
 * Type transport enumeration
 * 
 * @version 1.11 20 Nov 2017
 * @author  Igor Lipko
 */
public enum TransportType {
    
    BUS   (1, "Автобус"),
    PLANE (2, "Самолет"),
    SHIP  (3, "Корабль"),
    TRAIN (4, "Поезд");
    
    private int index;
    private String name;
    
    TransportType(int index, String name) {
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
