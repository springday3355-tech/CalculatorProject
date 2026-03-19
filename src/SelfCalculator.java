import java.util.Scanner;

public class SelfCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력하세요: ");
        int firstNum = sc.nextInt();

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
                    return;
                }
                result = firstNum / secondNum;
                break;

            default:
                System.out.println("잘못된 연산 기호입니다.");
                success = false;
        }
        if (success){
            System.out.println("결과: " + result);
            System.out.println("-------------------");
        }
    }
}
