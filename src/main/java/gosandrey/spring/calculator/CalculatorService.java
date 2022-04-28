package gosandrey.spring.calculator;

import org.springframework.stereotype.Service;

@Service

public class CalculatorService {
    public Double plus(double num1, double num2) {
        Double num3 = num1 + num2;
        return num3;
    }

    public double minus(double num1, double num2) {
        Double num3 = num1 - num2;
        return num3;
    }

    public double multiply(double num1, double num2) {
        double num3 = num1 * num2;
        return num3;
    }

    public double devide(double num1, double num2) {
        double num3 = num1 / num2;
        return num3;
    }
}
