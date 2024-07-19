package org.example;

import org.example.quiz.QuizData;
import org.example.quiz.QuizUI;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        QuizData first;

        QuizUI qUizUI = new QuizUI();


        first = new QuizData("달팽이도 이빨이 있다.", 1);
        QuizData q2 = new QuizData("멧돼지는 영어로 Wild boar이다", 1);
        QuizData q3 = new QuizData("토마토는 과일이다", 2);
        QuizData q4 = new QuizData("킹크랩은 게의 한 종류이다", 2);
        QuizData q5 = new QuizData("뱀은 귀가없어서 소리를 듣지 못한다", 2);
        QuizData q6 = new QuizData("바나나에는 씨앗이 있다", 1);

        first.setNext(q2);
        q2.setNext(q3);
        q3.setNext(q4);
        q4.setNext(q5);
        q5.setNext(q6);

        qUizUI.start(first);
    }
}