package logic;

import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import domain.*;
import storage.FakeVoucherStorage;

/**
 * Seller type: Agent
 * 
 * @version 1.11 20 Nov 2017
 * @author  Igor Lipko
 */
public class Agent extends AbstractSeller {
    public Agent(String name) {
        super(name);
    }

    @Override
    public void offer() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        System.out.println("Здравствуйте, меня зовут " + getName());

        while (choice != 0) {
            System.out.println("\nКакую путевку Вы  желаете приобрести?"
                    + "(выберите соответствующую цифру): ");
            System.out.println("1. Отдых");
            System.out.println("2. Экскурсия");
            System.out.println("3. Лечение");
            System.out.println("4. Шоппинг");
            System.out.println("5. Круиз");
            System.out.println("0. Выход");

            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Введите именно ЦИФРУ (не текст)."
                        + " Пожалуйста, будьте внимательней!");
                scanner.next();
                choice = -1;
            }

            System.out.println("Наше предложение: ");

            Comparator<AbstactVoucher> comarator = new AllComparator();
            FakeVoucherStorage listVouchers = new FakeVoucherStorage();
            List<AbstactVoucher> vouchers = listVouchers.read();
            Collections.sort(vouchers, comarator);

            switch(choice) {
            case 1:
                for (AbstactVoucher voucher : vouchers) {
                    if (voucher instanceof RestVoucher)
                        System.out.println(voucher);
                }
                break;

            case 2:
                for (AbstactVoucher voucher : vouchers) {
                    if (voucher instanceof TripVoucher)
                        System.out.println(voucher);
                }
                break;

            case 3:
                for (AbstactVoucher voucher : vouchers) {
                    if (voucher instanceof TreatmentVoucher)
                        System.out.println(voucher);
                }
                break;

            case 4:
                for (AbstactVoucher voucher : vouchers) {
                    if (voucher instanceof ShoppingVoucher)
                        System.out.println(voucher);
                }
                break;

            case 5:
                for (AbstactVoucher voucher : vouchers) {
                    if (voucher instanceof CruiseVoucher)
                        System.out.println(voucher);
                }
                break;

            case 0:
                System.out.println("До свидания! Будем рады Вас видеть снова");
                System.exit(0);
                break;

            default:
                System.out.println("Введите цифру из предложенного диапазона");
                break;    
            }
        }
        scanner.close();
    }
}
