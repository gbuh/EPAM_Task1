package domain;

/**
 * Voucher type: Shopping
 * 
 * @version 1.11 20 Nov 2017
 * @author  Igor Lipko
 */
public class ShoppingVoucher extends AbstactVoucher {
    public ShoppingVoucher() {
        setType(VoucherType.SHOPPING);
    }
}
