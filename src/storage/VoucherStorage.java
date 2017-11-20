package storage;

import java.util.List;

import domain.AbstactVoucher;

/**
 * This class is used to read list of vouchers.
 * 
 * @version 1.11 20 Nov 2017
 * @author  Igor Lipko
 */
public interface VoucherStorage {
        List<AbstactVoucher> read();
}
