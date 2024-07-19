package org.example.quiz;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class QuizData {

    private final String question;

    private final int answer;

    private QuizData next;


    public QuizData checkAnswer(int choice){

        return  answer==choice ? next:null;
    }

}