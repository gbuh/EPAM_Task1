package logic;

import domain.AbstactVoucher;
/**
 * This class determines the correspondence of the number of days
 * of the voucher to the selected range.
 * 
 * @version 1.2 21 Nov 2017
 * @author  Igor Lipko
 */

public class DaysFilter implements Filter {
    private Integer minDays;
    private Integer maxDays;

    public DaysFilter(final Integer minDays, final Integer maxDays) {
        if (minDays <= 0 || minDays > maxDays) {
            throw new RuntimeException("Неверно введено количecтво дней!");
        } else {
            this.minDays = minDays;
            this.maxDays = maxDays;
        }
    }

    @Override
    public boolean isSatisfy(AbstactVoucher voucher) {
        Integer days = voucher.getDays();
        return minDays <= days && days <= maxDays;
    }
}
