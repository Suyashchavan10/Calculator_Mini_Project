package dev.suyash.calculator;

public class Calculator {

    // Addition
    public Double addition(Double value1, Double value2) {
        return value1 + value2;
    }

    // Subtraction
    public Double subtraction(Double value1, Double value2) {
        return value1 - value2;
    }

    // Multiplication
    public Double multiplication(Double value1, Double value2) {
        return value1 * value2;
    }

    // Division
    public Double division(Double value1, Double value2) throws ArithmeticException {
        if (value2 == 0) {
            throw new ArithmeticException("Can not divide by Zero.");
        }
        return value1 / value2;
    }

    // Square Root
    public Double squareRoot(Double value) throws ArithmeticException {
        if (value < 0) {
            throw new ArithmeticException("Square root of negative value is invalid.");
        }
        return Math.sqrt(value);
    }

    // Factorial (using recursion)
    public Long factorial(Integer value) throws ArithmeticException {
        if (value < 0) {
            throw new ArithmeticException("Factorial of negative value is invalid.");
        } else if (value == 0 || value == 1) {
            return 1L;
        } else {
            return value * factorial(value - 1);
        }
    }

    // Natural Log (ln)
    public Double naturalLog(Double value) throws ArithmeticException {
        if (value <= 0) {
            throw new ArithmeticException("Natural log of non-positive value is invalid.");
        }
        return Math.log(value);
    }

    // Power Function
    public Double power(Double base, Double exponent) {
        return Math.pow(base, exponent);
    }
}
