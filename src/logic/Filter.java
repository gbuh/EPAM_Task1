package logic;

import domain.AbstactVoucher;

/**
 * This class is used to determine the compliance of the voucher
 * with the specified conditions.
 * 
 * @version 1.2 21 Nov 2017
 * @author  Igor Lipko
 */
public interface Filter {
    boolean isSatisfy(AbstactVoucher voucher);
}
