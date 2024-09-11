# 계산기 프로그램 (Calculator)

![Java](https://img.shields.io/badge/Java-17-blue)

## 개요 (Overview)

이 프로젝트는 자바 코드로만 작성된 기본적인 사칙연산(덧셈, 뺄셈, 곱셈, 나눗셈)을 수행할 수 있는 콘솔 기반 계산기입니다.
레벨 1 의 계산기는 두 개 숫자의 단순 반복 계산 기능을 포함하고 있으며, 계산기를 종료하는 기능까지 포함하고 있습니다.
레발 2 계산기의 사용자는 두 개의 숫자를 입력하고, 수행할 연산을 선택하면 계산기가 결과를 반환합니다. 또한, 사용자가 이전에 수행한 계산 결과를 저장하고 조회, 삭제 할 수 있는 기능도 포함하고 있습니다.

## 주요 기능 (Key Features)

- **사칙연산**: 덧셈, 뺄셈, 곱셈, 나눗셈을 수행할 수 있습니다.
- **결과 저장**: 이전 계산 결과를 저장하고 연산이 끝나고 결과를 조회할 수 있습니다.
- **입력 검증**: 잘못된 입력이 감지되면 사용자에게 경고 메시지를 출력합니다.

## 기술 스택 (Tech Stack)

- **Java**: Java 17

## 파일 구조 (File Directory)

    CalculatorProject
    ├── .gradle/
    ├── .idea/
    ├── build/
    ├── gradle/
    ├── src/
    │   ├── main/
    │   │   ├── java/
    │   │   │   └── org/
    │   │   │       └── example/
    │   │   │           ├── lv1/
    │   │   │           │   └── Calculator_Lv1.java
    │   │   │           └── lv2/
    │   │   │               ├── App.java
    │   │   │               ├── Calculator.java
    │   │   │               └── Main.java
    │   │   └── resources/
    │   └── test/
    ├── .gitignore
    ├── build.gradle
    ├── gradlew
    ├── gradlew.bat
    └── settings.gradle
