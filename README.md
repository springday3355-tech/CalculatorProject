import java.util.Scanner;

public class SelfCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 전체로직 감싸 무한반복
        while (true) {
            System.out.println("첫번째 숫자를 입력하세요(종료하려면 exit 입력): ");
            String input = sc.next(); //  exit 확인하기 위해 string으로 변환

            // 종료조건 확인
            if (input.equals("exit")) {
                System.out.println("계산기를 종료합니다.");
                break; // while문 탈출
            }
            // 처음 숫자 정수로(integer)변환
            int firstNum = Integer.parseInt(input);

            System.out.println("두번째 숫자를 입력하세요: ");
            int secondNum = sc.nextInt();

            System.out.println("사칙 연산자를 입력하세요: ");
            char operator = sc.next().charAt(0);

            int result = 0;
            boolean success = true;

            switch (operator) {
                case '+':
                    result = firstNum + secondNum;
                    break;
                case '-':
                    result = firstNum - secondNum;
                    break;
                case '*':
                    result = firstNum * secondNum;
                    break;
                case '/':
                    if (secondNum == 0) {
                        System.out.println("0이 입력될 수 없습니다.");
                        success = false; // return -> success를 false로
                    } else {
                        result = firstNum / secondNum;
                    }
                    break;

                default:
                    System.out.println("잘못된 연산 기호입니다.");
                    success = false;
            }
            if (success) {
                System.out.println("결과: " + result);
                System.out.println("-------------------");
            }
        }
    }
}
