package nl.hu.taxcalculator;

public class TaxCalculator {

    private static final int TIER_1_UPPER_VALUE = 20143;
    private static final int TIER_2_UPPER_VALUE = 33995;
    private static final int TIER_3_UPPER_VALUE = 68507;
    private static final int MAX_TIER_1_COST = 7362;
    private static final int MAX_TIER_2_COST = 5658;
    private static final int MAX_TIER_3_COST = 14098;
    private static final int MAX_TIER_COST_COMBINED = 27118;




    public Integer calculate(int income) {
        if (income == 0) {
            return 0;
        }
        if (income <= TIER_1_UPPER_VALUE) {
            return (int) (income * 0.3655);
        }
        if (income >= TIER_1_UPPER_VALUE && income <= TIER_2_UPPER_VALUE) {
            return MAX_TIER_1_COST + (int) ((income - MAX_TIER_1_COST) * 0.4085);
        }
        if (income > TIER_2_UPPER_VALUE && income < TIER_3_UPPER_VALUE) {
            return MAX_TIER_2_COST + MAX_TIER_1_COST + (int) ((income - 13020) * 0.4085);
        }
        if(income > TIER_3_UPPER_VALUE){
            return MAX_TIER_COST_COMBINED +
                    (int)((income - MAX_TIER_COST_COMBINED) * 0.5195);
        }

        return -1;

    }
}
