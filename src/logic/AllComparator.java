package logic;

import java.util.Comparator;

import domain.AbstactVoucher;

/*public class DaysComparator implements Comparator<AbstactVoucher>{
    public int compare(AbstactVoucher v1, AbstactVoucher v2) {
        return v1.getDays() - v2.getDays();
    }
}
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