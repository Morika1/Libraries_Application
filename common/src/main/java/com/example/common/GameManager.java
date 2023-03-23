package com.example.common;

import android.util.Log;

import java.util.ArrayList;

public class GameManager {

    private int correctCounter = 0;
    private int index = 0;

    private ArrayList<Question> questions;

    public GameManager(ArrayList<Question> data) {
        questions = data;
    }

    private Question current() { return questions.get(index); }

    public String getCurrentQuestion() { return current().getQuestionText(); }

    public boolean checkAnswer(String answer) {
        if(current().getRightAnswer().equals(answer)) {
            Log.d("pttt", "answer is correct");
            correctCounter++;
            index++;
            return true;
        }
        index++;
        return false;
    }

    public String[] getCurrentAnswers(){ return current().getAnswers();}

    public String getAnswer(int index) {
        return current().getAnswer(index);
    }


    public boolean isEndGame() {
        return index == questions.size();
    }

    public int getCorrectCounter() { return correctCounter; }


}
