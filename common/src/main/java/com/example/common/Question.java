package com.example.common;

public class Question {

    private String questionText;
    private String rightAnswer;
    private String[] answers;

    public Question() {}


    public Question setQuestionText(String questionText){
        this.questionText = questionText;
        return this;
    }

    public Question setRightAnswer(String rightAnswer){
        this.rightAnswer = rightAnswer;
        return this;
    }


    public Question setAnswers(String[] answers) {
        this.answers = answers;
        return this;
    }

    public String[] getAnswers(){ return answers;}

    public String getAnswer(int index) { return answers[index]; }
    public String getQuestionText() { return questionText; }
    public String getRightAnswer() { return rightAnswer; }


}
