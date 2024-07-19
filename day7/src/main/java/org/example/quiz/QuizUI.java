package org.example.quiz;

import java.util.Scanner;

public class QuizUI {

    public void start(QuizData first) {
        Scanner sc = new Scanner(System.in);
        QuizData current = first;
        int count = 0;
        while(true) {

            if (current == null) {
                System.out.println("시스템이 종료되었습니다.");
                break;
            } else {
                System.out.println(current.getQuestion());
                int choice = sc.nextInt();
                QuizData next = current.checkAnswer(choice);
                if (next != null) { // 다음 퀴즈가 있는 경우
                    System.out.println("정답입니다.");
                    count++;
                } else if (current.getNext() == null && current.getAnswer() == choice) { // 마지막 문제의 정답을 맞춘 경우
                    System.out.println("정답입니다.");
                    count++;
                } else {
                    System.out.println("오답입니다.");
                }
                current = next;
            }

        }//end while

        if(count == 6) {
            System.out.println("모두 맞추셨습니다.");
        } else {
            System.out.println("당신의 점수는 " + count + "/6 점 입니다.");
        }


    }
}