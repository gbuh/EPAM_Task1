package test;

import logic.AbstractSeller;
import logic.Agent;
import logic.Consultant;

/**
 * This program defines the several types of vouchers, imitates the process of
 * tour selection and of sorts vouchers by amount of days, type of meal and type of transport.
 * 
 * @version 1.11 20 Nov 2017
 * @author  Igor Lipko
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Турагентство \"Путешествие без границ\"");
        AbstractSeller consultant = new Consultant("Марина");
        consultant.offer();
        /* Other variant of seller */
        // AbstractSeller agent = new Agent();
        // agent.offer();
    }
}