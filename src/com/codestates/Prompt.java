package com.codestates;

import java.util.Scanner;

public class Prompt {
    

    public void  runPrompt() {
//        int inputTimes = scanner.nextInt();

//        System.out.printf("입력 가능 횟수는 %d회입니다%n", inputTimes);
        Scanner scanner = new Scanner(System.in);
        while(true) {

        System.out.println("년도를 입력하세요");
        System.out.print(">year");
        int year = scanner.nextInt();

        if(year == -1) {
            break;
        }
        System.out.println("월을 입력하세요");
        System.out.print(">month");
        int month = scanner.nextInt();

            if(month == -1) {
                break;
            }
            if(month > 12 || month < 1) {
                continue;
            }
            Calendar cal = new Calendar();
            cal.printCalendar(year, month);
            System.out.println();
        }

        System.out.println("bye");
        scanner.close();
//        System.out.printf("%d와 %d의 합은 %d입니다", input1, input2, input1 + input2);
    }

    public static void main(String[] args) {

        Prompt p = new Prompt();
        p.runPrompt();

    }
}
