package org.example.lv1;

import java.util.Scanner;

public class Calculator_Lv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int num1 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요 : ");
            char op = sc.next().charAt(0);

            System.out.print("두 번째 숫자를 입력하세요 : ");
            int num2 = sc.nextInt();

            int result = 0;
            boolean vaild = true;

            if (op == '+') {
                result = num1 + num2;
            } else if (op == '-') {
                result = num1 - num2;
            } else if (op == '*') {
                result = num1 * num2;
            } else if (op == '/') {
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    System.out.println("다시 계산해주세요");
                    System.out.println("===================================================");

                    vaild = false;

                } else {
                    result = num1 / num2;
                }
            }

            if (vaild) {
                System.out.println("연산 결과 : " + result);
                System.out.println("===================================================");
            }

            while (true) {
                System.out.println("더 계산하시겠습니까?");
                System.out.println("yes 입력 시 계속, exit 입력 시 종료");

                String answer = sc.next();

                if (answer.equalsIgnoreCase("exit")) {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                } else if (answer.equalsIgnoreCase("yes")) {
                    break;
                } else {
                    System.out.println("올바른 입력이 아닙니다. 다시 입력해주세요.");
                    System.out.println("===================================================");
                }
            }
        }
    }
}
