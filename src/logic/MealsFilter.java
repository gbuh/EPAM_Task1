package logic;

import domain.AbstactVoucher;
import domain.MealsType;

/**
 * This class determines the correspondence of the type of meals 
 * of the voucher to the selected type
 * 
 * @version 1.2 21 Nov 2017
 * @author  Igor Lipko
 */
public class MealsFilter implements Filter {
    private MealsType meals;

    public MealsFilter(MealsType meals) {
        this.meals = meals;
    }

    @Override
    public boolean isSatisfy(AbstactVoucher voucher) {
        return voucher.getMeals() == meals;
    }

}
