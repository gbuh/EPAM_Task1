package logic;

import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import domain.*;
import storage.FakeVoucherStorage;

/**
 * Seller type: Consultant
 * 
 * @version 1.2 21 Nov 2017
 * @author  Igor Lipko
 */
public class Consultant extends AbstractSeller {
    public Consultant(String name) {
        super(name);	
    }

    @Override
    public void offer() {
        Scanner scanner = new Scanner(System.in);
        Integer minDays = 0;
        Integer maxDays = 0;

        System.out.println("Здравствуйте, меня зовут " + getName());
        System.out.println("Наше предложение: ");

        Comparator<AbstactVoucher> comarator = new AllComparator();
        FakeVoucherStorage listVouchers = new FakeVoucherStorage();
        List<AbstactVoucher> vouchers = listVouchers.read();
        Collections.sort(vouchers, comarator);
        System.out.println(vouchers.toString());

        while (minDays == 0) {
            System.out.print("\nВведите минимальное количество дней путевки:");
            try {
                minDays = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Введите именно ЦИФРУ (не текст)."
                        + " Пожалуйста, будьте внимательней!");
                scanner.next();
                minDays = 0;
            }
        }

        while (maxDays == 0) {
            System.out.print("\nВведите максимальное количество дней путевки:");
            try {
                maxDays = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Введите именно ЦИФРУ (не текст)."
                        + " Пожалуйста, будьте внимательней!");
                scanner.next();
                maxDays = 0;
            }     
        }

        System.out.print("\nСписок путевок с количеством дней от "
                + minDays + " до " + maxDays + "\n"
                + "Вид транспорта: " + TransportType.BUS.getName() + "\n"
                + "Питание: " + MealsType.NOT_MEALS.getName() + "\n");

        Filter filterDays = new DaysFilter(minDays, maxDays);
        Filter filterTransport = new TransportFilter(TransportType.BUS);
        Filter filterMeals = new MealsFilter(MealsType.NOT_MEALS);

        for (AbstactVoucher voucher : vouchers) {
            if (filterDays.isSatisfy(voucher)) {
                if (filterTransport.isSatisfy(voucher))
                    if (filterMeals.isSatisfy(voucher))
                        System.out.println(voucher.toString());
            }
        }
        scanner.close();
    }
}
