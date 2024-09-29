package dev.suyash.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    // @BeforeEach
    // public void setUp() {
    //     calculator = new Calculator();
    // }

    @Test
    public void testAddition() {
        assertEquals(8.5, calculator.addition(3.5, 5.0), 0.001, "Expected 8.5 as result of 3.5 + 5.0");

        assertEquals(-4.0, calculator.addition(-6.0, 2.0), 0.001, "Expected -4.0 as result of -6.0 + 2.0");
    }

    @Test
    public void testSubtraction() {
        assertEquals(7.0, calculator.subtraction(10.0, 3.0),0.001, "Expected 7.0 as result of 10.0 - 3.0");

        assertEquals(10.0, calculator.subtraction(6.0, -4.0), 0.001, "Expected 10.0 as result of 6.0 - (-4.0)");
    }

    @Test
    public void testMultiplication() {
        assertEquals(16.0, calculator.multiplication(3.0, 5.0), 0.001,"Expected 15.0 as result of 3.0 * 5.0");

        assertEquals(-20.0, calculator.multiplication(-4.0, 5.0),0.001, "Expected -20.0 as result of -4.0 * 5.0");
    }

    @Test
    public void testDivision() {
        assertEquals(2.5, calculator.division(5.0, 2.0), 0.001,"Expected 2.5 as result of 5.0 / 2.0");

        assertThrows(ArithmeticException.class, () -> calculator.division(10.0, 0.0), "Division by zero should throw an exception");
    }

    @Test
    public void testSquareRoot() {
        assertEquals(5.0, calculator.squareRoot(25.0), 0.001,"Expected 5.0 as square root of 25.0");

        assertThrows(ArithmeticException.class, () -> calculator.squareRoot(-9.0), "Square root of negative number should throw an exception");
    }

    @Test
    public void testFactorial() {
        assertEquals(720L, calculator.factorial(6), 0.001,"Expected 720 as factorial of 6");

        assertThrows(ArithmeticException.class, () -> calculator.factorial(-3), "Factorial of negative number should throw an exception");
    }

    @Test
    public void testNaturalLog() {
        assertEquals(Math.log(20.0), calculator.naturalLog(20.0),0.001, "Expected natural log of 20.0");

        assertThrows(ArithmeticException.class, () -> calculator.naturalLog(0.0), "Natural log of zero should throw an exception");
    }

    @Test
    public void testPower() {
        assertEquals(9.0, calculator.power(3.0, 2.0),0.001, "Expected 9.0 as result of 3.0^2.0");

        assertEquals(0.25, calculator.power(2.0, -2.0), 0.001,"Expected 0.25 as result of 2.0^-2.0");
    }
}
