package domain;

/**
 *Cruise type voucher
 * 
 * @version 1.11 20 Nov 2017
 * @author  Igor Lipko
 */
public class CruiseVoucher extends AbstactVoucher {
    public CruiseVoucher() {
        setType(VoucherType.CRUISE);
    }
}
