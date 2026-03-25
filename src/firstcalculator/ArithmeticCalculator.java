package firstcalculator;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator <T extends Number> {
    private List<Double> results =new ArrayList<>();
    public double calculate(T num1, T num2, OperatorType operator) {
        double result = 0;

        switch (operator){
            case ADD:
                result = num1.doubleValue() + num2.doubleValue();
                break;
            case SUBTRACT:
                result = num1.doubleValue() - num2.doubleValue();
                break;
            case MULTIPLY:
                result = num1.doubleValue() * num2.doubleValue();
                break;
            case DIVIDE:
                result = num1.doubleValue() / num2.doubleValue();
                break;
        }
        results.add(result);
        return result;
    }

}