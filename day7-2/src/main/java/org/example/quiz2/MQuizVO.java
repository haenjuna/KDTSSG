package org.example.quiz2;

public class MQuizVO extends QuizVO {

    private String op1;
    private String op2;

    public MQuizVO(String text, String answer, String op1, String op2) {
        super(text, answer);
        this.op1 = op1;
        this.op2 = op2;
    }

    @Override
    public String getText() {
        String str = this.text +"\n 1---" + this.op1 + "\n 2----" + this.op2;
        return str;
    }

    @Override
    public boolean checkAnswer(String answer) {

        boolean result = false;

        if(answer.equals("1")) {
            result =  this.answer.equals(op1);
        }else if(answer.equals("2")) {
            result = this.answer.equals(op2);
        }
        return result;
    }
}