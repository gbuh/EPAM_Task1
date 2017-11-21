package domain;

/**
 * Voucher type: Trip
 * 
 * @version 1.11 20 Nov 2017
 * @author  Igor Lipko
 */
public class TripVoucher extends AbstactVoucher {
    public TripVoucher() {
        setType(VoucherType.TRIP);
    }
}
