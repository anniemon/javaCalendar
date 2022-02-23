package com.codestates;

import java.util.Scanner;

public class Prompt {
    
    private final static String PROMPT = "cal> ";

    public void  runPrompt() {
        System.out.println("월을 입력하세요");
        Scanner scanner = new Scanner(System.in);
//        int inputTimes = scanner.nextInt();

//        System.out.printf("입력 가능 횟수는 %d회입니다%n", inputTimes);

        while(true) {
            System.out.print(PROMPT);
            int month = scanner.nextInt();


            if(month == -1) {
                break;
            }
            if(month > 12 || month < 1) {
                continue;
            }
            Calendar cal = new Calendar();
            int maxDate = cal.getMaxDaysOfMonth(month);

            cal.printCalendar(maxDate);
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
