package nl.hu.taxcalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxCalculatorTest {

    private TaxCalculator calculator;
    @BeforeEach
    public void beforeEach(){
        calculator = new TaxCalculator();

    }

    @Test
    public void zeroIncome(){
        assertEquals(0, calculator.calculate(0));
        }


    @Test
    public void test5000() {
        assertEquals(1827, calculator.calculate(5000));
    }

    @Test
    public void incomeIs40000(){
        assertEquals(24041, calculator.calculate(40000));
    }


}
