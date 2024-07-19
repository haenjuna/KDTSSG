package org.example.quiz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class QuizVO {

    private final String text;

    private final int answer;

    private QuizVO yes;

    private QuizVO no;

    public QuizVO getNext(boolean check){

        return  (check==true)?yes:no;
    }
}
