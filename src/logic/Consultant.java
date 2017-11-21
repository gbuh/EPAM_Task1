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
        int indexMeals = 0;
        int indexTransport = 0;
        String typeMeals = null;
        String typeTransport = null;
        Filter meals = null;
        Filter transport = null;

        System.out.println("Здравствуйте, меня зовут " + getName());
        System.out.println("Наше предложение: ");

        Comparator<AbstactVoucher> comarator = new AllComparator();
        FakeVoucherStorage listVouchers = new FakeVoucherStorage();
        List<AbstactVoucher> vouchers = listVouchers.read();
        Collections.sort(vouchers, comarator);
        System.out.println(vouchers.toString());

        while (minDays == 0) {
            System.out.println("\nВведите минимальное количество дней путевки:");

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
            System.out.println("\nВведите максимальное количество дней путевки:");

            try {
                maxDays = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Введите именно ЦИФРУ (не текст)."
                        + " Пожалуйста, будьте внимательней!");
                scanner.next();
                maxDays = 0;
            }     
        }

        while (indexMeals == 0) {
            System.out.println("\nВведите вид питания: ");
            System.out.println("1. Все включено");
            System.out.println("2. Завтрак");
            System.out.println("3. Завтрак и обед");
            System.out.println("4. Ужин");
            System.out.println("5. Обед");
            System.out.println("6. Без питания");

            try {
                indexMeals = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Введите именно ЦИФРУ (не текст)."
                        + " Пожалуйста, будьте внимательней!");
                scanner.next();
                indexMeals = 0;
            }
        }

        switch(indexMeals) {
        case 1:
            typeMeals = MealsType.ALL_INCLUSIVE.getName();
            meals = new MealsFilter(MealsType.ALL_INCLUSIVE);
            break;

        case 2:
            typeMeals = MealsType.BREAKFAST.getName();
            meals = new MealsFilter(MealsType.BREAKFAST);
            break;

        case 3:
            typeMeals = MealsType.BREAKFAST_AND_LUNCH.getName();
            meals = new MealsFilter(MealsType.BREAKFAST_AND_LUNCH);
            break;

        case 4:
            typeMeals = MealsType.DINNER.getName();
            meals = new MealsFilter(MealsType.DINNER);
            break;

        case 5:
            typeMeals = MealsType.LUNCH.getName();
            meals = new MealsFilter(MealsType.LUNCH);
            break;

        case 6:
            typeMeals = MealsType.NOT_MEALS.getName();
            meals = new MealsFilter(MealsType.NOT_MEALS);
            break;

        default:
            System.out.println("Введите цифру из предложенного диапазона");
            break;    
        }

        while (indexTransport == 0) {
            System.out.println("\nВведите вид транспорта: ");
            System.out.println("1. Автобус");
            System.out.println("2. Самолет");
            System.out.println("3. Корабль");
            System.out.println("4. Поезд");

            try {
                indexTransport = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Введите именно ЦИФРУ (не текст)."
                        + " Пожалуйста, будьте внимательней!");
                scanner.next();
                indexTransport = 0;
            }
        }

        switch(indexTransport) {
        case 1:
            typeTransport = TransportType.BUS.getName();
            transport = new TransportFilter(TransportType.BUS);
            break;

        case 2:
            typeTransport = TransportType.PLANE.getName();
            transport = new TransportFilter(TransportType.PLANE);
            break;

        case 3:
            typeTransport = TransportType.SHIP.getName();
            transport = new TransportFilter(TransportType.SHIP);
            break;

        case 4:
            typeTransport = TransportType.TRAIN.getName();
            transport = new TransportFilter(TransportType.TRAIN);
            break;

        default:
            System.out.println("Введите цифру из предложенного диапазона");
            break;    
        }

        System.out.print("\nСписок путевок с количеством дней от "
                + minDays + " до " + maxDays + "\n"
                + "Вид транспорта: " + typeTransport + "\n"
                + "Питание: " + typeMeals + "\n");

        Filter filterDays = new DaysFilter(minDays, maxDays);
        Filter filterTransport = transport;
        Filter filterMeals = meals;

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
