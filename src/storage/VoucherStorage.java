package storage;

import java.util.List;

import domain.AbstactVoucher;


public interface VoucherStorage {
        List<AbstactVoucher> read();
}
