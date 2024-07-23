package org.example.quiz;

import java.util.ArrayList;

public enum QuizService {
    INSTANCE;

    ArrayList<Quiz> quizList;

    QuizService() {
        quizList = new ArrayList<>();
    }

    public void addQuiz(Quiz quiz) {
        quizList.add(quiz);
    }

    public Quiz getQuizList() {
        return quizList.remove(0);
    }
}
