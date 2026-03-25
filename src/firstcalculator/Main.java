package firstcalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator<Double> calc = new ArithmeticCalculator<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            Double firstNum = sc.nextDouble();

            System.out.println("두번째 숫자를 입력하세요: ");
            Double secondNum = sc.nextDouble();

            System.out.println("사칙 연산자를 입력하세요: ");
            char operator = sc.next().charAt(0);
            OperatorType op = OperatorType.fromSymbol(operator);

            double result = calc.calculate(firstNum, secondNum, op);
            System.out.println("결과: " + result);
            System.out.println("----------------------");

            System.out.println("더 계산하시겠습니까? (exit 입력시 종료): ");
            String exit = sc.next();
            if (exit.equals("exit")){
                break;
            }
            System.out.println("가장 오래된 결과를 삭제하시겠습니까? (remove 입력 시 삭제 / 아무키나 입력 시 계속)");
            String command = sc.next();
            if (command.equals("remove")) {
                calc.removeFirstResult(); // 삭제 메서드 호출
                extracted(calc);          // 삭제 후 리스트 다시 보여주기
            }
        }
    }
    public  static void  extracted(ArithmeticCalculator<Double> calc) {
        System.out.println("현재까지의 결과 리스트: " + calc.getResults());
    }
    }
