package com.example.librariesapplication;

import com.example.common.Question;

import java.util.ArrayList;

public class DataManager {

    public static ArrayList<Question> getQuestions(){
        ArrayList<Question> questions = new ArrayList<>();

        questions.add(new Question()
                .setQuestionText("(5+3)x4=")
                .setRightAnswer("32")
                .setAnswers(new String[] {
                        "32",
                        "17",
                        "23",
                        "35"}));

        questions.add(new Question()
                .setQuestionText("5+6x4=")
                .setRightAnswer("29")
                .setAnswers(new String[] {
                        "44",
                        "26",
                        "29",
                        "42"}));

        questions.add(new Question()
                .setQuestionText("10x5-3=")
                .setRightAnswer("47")
                .setAnswers(new String[] {
                        "45",
                        "47",
                        "20",
                        "37",}));

        questions.add(new Question()
                .setQuestionText("(12+5)-(3+4)=")
                .setRightAnswer("10")
                .setAnswers(new String[] {
                        "24",
                        "17",
                        "18",
                        "10"}));

        questions.add(new Question()
                .setQuestionText("(2+5)x2-(3+4)=")
                .setRightAnswer("7")
                .setAnswers(new String[] {
                        "7",
                        "5",
                        "15",
                        "8"}));

        questions.add(new Question()
                .setQuestionText("4:2+3=")
                .setRightAnswer("5")
                .setAnswers(new String[] {
                        "11",
                        "5",
                        "1",
                        "2"}));

        questions.add(new Question()
                .setQuestionText("3+16:2=")
                .setRightAnswer("11")
                .setAnswers(new String[] {
                        "21",
                        "22",
                        "8",
                        "11"}));

        questions.add(new Question()
                .setQuestionText("(15+5):4+5=")
                .setRightAnswer("10")
                .setAnswers(new String[] {
                        "3",
                        "12",
                        "10",
                        "22"}));

        questions.add(new Question()
                .setQuestionText("6+7x(3:3+1)=")
                .setRightAnswer("20")
                .setAnswers(new String[] {
                        "26",
                        "20",
                        "14",
                        "24"}));

        questions.add(new Question()
                .setQuestionText("5+7x4:2+1=")
                .setRightAnswer("20")
                .setAnswers(new String[] {
                        "20",
                        "15",
                        "25",
                        "35"}));


        return questions;
    }

}
