package storage;

import java.util.ArrayList;
import java.util.List;

import domain.*;

/**
 * Class FakeVoucherStorage consists of a set of fake vouchers. It provides
 * methods to add vouchers into storage (collection).
 * 
 * @version 1.11 20 Nov 2017
 * @author  Igor Lipko
 */
public class FakeVoucherStorage implements VoucherStorage {

    @Override
    public List<AbstactVoucher> read() {
        List<AbstactVoucher> vouchers = new ArrayList<>();
        // Voucher #1
        AbstactVoucher firstVoucher = new RestVoucher();
        firstVoucher.setDescription("Пляж Таиланда");
        firstVoucher.setDays(12);
        firstVoucher.setMeals(MealsType.DINNER);
        firstVoucher.setTransport(TransportType.PLANE);
        vouchers.add(firstVoucher);
        // Voucher #2
        AbstactVoucher secondVoucher = new TripVoucher();
        secondVoucher.setDescription("Экскурсия по замкам Австрии");
        secondVoucher.setDays(5);
        secondVoucher.setMeals(MealsType.LUNCH);
        secondVoucher.setTransport(TransportType.BUS);
        vouchers.add(secondVoucher);
        // Voucher #3
        AbstactVoucher thirdVoucher = new TreatmentVoucher();
        thirdVoucher.setDescription("Санаторий \"Летцы\"");
        thirdVoucher.setDays(21);
        thirdVoucher.setMeals(MealsType.BREAKFAST_AND_LUNCH);
        thirdVoucher.setTransport(TransportType.TRAIN);
        vouchers.add(thirdVoucher);
        // Voucher #4
        AbstactVoucher fourthVoucher = new CruiseVoucher();
        fourthVoucher.setDescription("Круиз по средиземному морю");
        fourthVoucher.setDays(30);
        fourthVoucher.setMeals(MealsType.ALL_INCLUSIVE);
        fourthVoucher.setTransport(TransportType.SHIP);
        vouchers.add(fourthVoucher);
        // Voucher #5
        AbstactVoucher fifthVoucher = new ShoppingVoucher();
        fifthVoucher.setDescription("Гипермаркеты Литвы");
        fifthVoucher.setDays(3);
        fifthVoucher.setMeals(MealsType.NOT_MEALS);
        fifthVoucher.setTransport(TransportType.BUS);
        vouchers.add(fifthVoucher);
        // Voucher #6
        AbstactVoucher sixthVoucher = new RestVoucher();
        sixthVoucher.setDescription("Пляж Турции");
        sixthVoucher.setDays(12);
        sixthVoucher.setMeals(MealsType.ALL_INCLUSIVE);
        sixthVoucher.setTransport(TransportType.PLANE);
        vouchers.add(sixthVoucher);
        // Voucher #7
        AbstactVoucher seventhVoucher = new RestVoucher();
        seventhVoucher.setDescription("Пляж Краснодара");
        seventhVoucher.setDays(12);
        seventhVoucher.setMeals(MealsType.DINNER);
        seventhVoucher.setTransport(TransportType.TRAIN);
        vouchers.add(seventhVoucher);
        // Voucher #8
        AbstactVoucher eighthVoucher = new TripVoucher();
        eighthVoucher.setDescription("Экскурсия по музеям Амсердама");
        eighthVoucher.setDays(3);
        eighthVoucher.setMeals(MealsType.BREAKFAST_AND_LUNCH);
        eighthVoucher.setTransport(TransportType.TRAIN);
        vouchers.add(eighthVoucher);
        // Voucher #9
        AbstactVoucher ninthVoucher = new RestVoucher();
        ninthVoucher.setDescription("Пляж Городокского района");
        ninthVoucher.setDays(15);
        ninthVoucher.setMeals(MealsType.NOT_MEALS);
        ninthVoucher.setTransport(TransportType.BUS);
        vouchers.add(ninthVoucher);
        
        return vouchers;
    }
}
