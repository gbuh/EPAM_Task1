package logic;

import java.util.Comparator;

import domain.AbstactVoucher;

/**
 * This class is provides methods to sort vouchers in storage (collection)
 * by amount of days, type of meal and type of transport.
 * 
 * @version 1.11 20 Nov 2017
 * @author  Igor Lipko
 */
public class AllComparator implements Comparator<AbstactVoucher>{
    public int compare(AbstactVoucher v1, AbstactVoucher v2) {
        int flag = v1.getDays() - v2.getDays();

        if (flag == 0) {
            flag = v1.getMeals().compareTo(v2.getMeals());
        }
        if (flag == 0) {
            flag = v1.getTransport().compareTo(v2.getTransport());
        }
        return flag;
    }
}
