package org.example.quiz;

import java.util.Scanner;

public class QuizUI {

    private Scanner scanner;

    public QuizUI(Scanner scanner) {
        this.scanner = scanner;
    }

    public void show() {

        System.out.println("Welcome to the Quiz Show");

        //문제를 가져와야 한다.
        while(true){

            Quiz quiz = QuizService.INSTANCE.getQuiz();

            if(quiz == null) {
                System.out.println("You are Quiz King");
                break;
            }else {
                System.out.println(quiz.text());
                String userAnswer = scanner.nextLine();
                boolean result = quiz.checkAnswer(userAnswer);

                if(result == false){
                    System.out.println("Wrong answer Back Home");
                }
            }
        }//end while
    }
}