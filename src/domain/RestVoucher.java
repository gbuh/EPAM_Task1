package domain;

/**
 * Voucher type: Rest
 * 
 * @version 1.11 20 Nov 2017
 * @author  Igor Lipko
 */
public class RestVoucher extends AbstactVoucher {
    public RestVoucher() {
        setType(VoucherType.REST);
    }
}
