package org.example.lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int num1 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요 : ");
            char op = sc.next().charAt(0);

            System.out.print("두 번째 숫자를 입력하세요 : ");
            int num2 = sc.nextInt();

            calculator.calculate(num1, num2, op);

            List<Integer> resultList = calculator.getResult();
            System.out.println("연산 기록 : " + resultList);

            while (true) {
                System.out.println("=============================================================");
                System.out.println("더 계산하시겠습니까?");
                System.out.println("(yes 입력 시 계속, exit 입력 시 종료, remove 입력 시 첫번째 연산결과 삭제됨)");
                System.out.println("=============================================================");

                String answer = sc.next();
                if (answer.equalsIgnoreCase("exit")) {
                    System.out.println("프로그램을 종료합니다");
                    return;
                } else if (answer.equalsIgnoreCase("yes")) {
                    break;
                } else if (answer.equalsIgnoreCase("remove")) {
                    if (calculator.getResult().isEmpty()) {
                        System.out.println("삭제할 결과가 없습니다.");
                    } else {
                        calculator.removeResult();
                        System.out.println("연산 결과가 삭제 되었습니다.");
                        System.out.println("연산 기록 : " + calculator.getResult());
                    }
                } else {
                    System.out.println("올바른 입력이 아닙니다. 다시 입력해주세요.");
                }
            }
        }
    }
}
