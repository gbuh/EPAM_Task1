package domain;

/**
 *Trip type voucher
 * 
 * @version 1.11 20 Nov 2017
 * @author  Igor Lipko
 */
public class TripVoucher extends AbstactVoucher {
    public TripVoucher() {
        setType(VoucherType.TRIP);
    }
}
