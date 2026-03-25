package firstcalculator;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculator <T extends Number> {
    private List<Double> results = new ArrayList<>();

    public double calculate(T num1, T num2, OperatorType operator) {

        double result = switch (operator) {
            case ADD -> num1.doubleValue() + num2.doubleValue();
            case SUBTRACT -> num1.doubleValue() - num2.doubleValue();
            case MULTIPLY -> num1.doubleValue() * num2.doubleValue();
            case DIVIDE -> num1.doubleValue() / num2.doubleValue();
        };

        results.add(result);
        return result;
    }

    public List<Double> getResults() {
        return results;
    }

    public void removeFirstResult() {
        if (!results.isEmpty()) {
            results.remove(0);
            System.out.println("가장 오래된 연산 결과가 삭제 되었습니다.");
        } else {
            System.out.println("삭제할 결과가 없습니다.");

        }
    }

    public double calculateAverage() {
        return results.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }
    public void printResultsGreaterThan(double threshold){
        List<Double> num = results.stream()
                .filter(n -> n > threshold)
                .collect(Collectors.toList());
        System.out.println(threshold + "보다 큰 결과들 : " + num);
    }

}