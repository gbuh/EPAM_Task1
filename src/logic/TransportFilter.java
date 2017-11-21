package logic;

import domain.AbstactVoucher;
import domain.TransportType;

/**
 * This class determines the correspondence of the type of transport 
 * of the voucher to the selected type
 * 
 * @version 1.2 21 Nov 2017
 * @author  Igor Lipko
 */
public class TransportFilter implements Filter {
    private TransportType transport;

    public TransportFilter(TransportType transport) {
        this.transport = transport;
    }

    @Override
    public boolean isSatisfy(AbstactVoucher voucher) {
        return voucher.getTransport() == transport;
    }
}
