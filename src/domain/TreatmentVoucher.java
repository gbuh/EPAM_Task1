package domain;

/**
 *Treatment type voucher
 * 
 * @version 1.11 20 Nov 2017
 * @author  Igor Lipko
 */
public class TreatmentVoucher extends AbstactVoucher {
    public TreatmentVoucher() {
        setType(VoucherType.TREATMENT);
    }
}
