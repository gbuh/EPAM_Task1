package domain;

/**
 * Voucher type: Cruise
 * 
 * @version 1.11 20 Nov 2017
 * @author  Igor Lipko
 */
public class CruiseVoucher extends AbstactVoucher {
    public CruiseVoucher() {
        setType(VoucherType.CRUISE);
    }
}
