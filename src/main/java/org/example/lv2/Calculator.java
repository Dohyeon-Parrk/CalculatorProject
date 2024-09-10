package org.example.lv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Integer> result;

    public Calculator() {
        this.result = new ArrayList<Integer>();
    }

    public int calculate(int num1, int num2, char op) {
        int answer = 0;
        boolean valid = true;

        switch (op) {
            case '+':
                answer = num1 + num2;
                break;
            case '-':
                answer = num1 - num2;
                break;
            case '*':
                answer = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    System.out.println("계산이 유효하지 않습니다. 다시 계산해주세요");
                    System.out.println("=============================================================");
                    valid = false;
                } else {
                    answer = num1 / num2;
                }
                break;
        }

        if (valid) {
            saveResult(answer);
        }
        return answer;
    }

    // save
    private void saveResult(int answer) {
        result.add(answer);
    }

    // getter
    public List<Integer> getResult() {
        return new ArrayList<>(result);
    }

    // setter 수정
    public void setResult(List<Integer> result) {
        this.result = new ArrayList<>(result);
    }

    // remove
    public void removeResult(){
        if(!result.isEmpty()){
            result.remove(0);
        }
    }

}
