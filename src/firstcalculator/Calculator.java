package firstcalculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    // 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성
    private List<Integer> results = new ArrayList<>();

    // 사칙 연산을 수행 후 결과값 반환하는 메서드 구현
    public int calculate(int firstNum, int secondNum, char operator) {
        int result = 0;

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
                    result = firstNum / secondNum;
                } else {
                    System.out.println("0이 입력될 수 없습니다.");
                }
                break;
        }
        results.add(result);
        return result;
    }


}
