package firstcalculator;

import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator calc = new Calculator();

        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int firstNum = sc.nextInt();

            System.out.println("두번째 숫자를 입력하세요: ");
            int secondNum = sc.nextInt();

            System.out.println("사칙 연산자를 입력하세요: ");
            char operator = sc.next().charAt(0);

            int result = calc.calculate(firstNum, secondNum, operator);
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
    public  static void  extracted(Calculator calc) {
        System.out.println("현재까지의 결과 리스트: " + calc.getResults());
    }
    }
