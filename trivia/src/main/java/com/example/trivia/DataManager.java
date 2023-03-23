package com.example.trivia;

import com.example.common.Question;

import java.util.ArrayList;

public class DataManager {

    public static ArrayList<Question> getQuestions(){
        ArrayList<Question> questions = new ArrayList<>();

        questions.add(new Question()
                .setQuestionText("Where the Lego game was invented?")
                .setRightAnswer("Denmark")
                .setAnswers(new String[] {
                        "Belgium",
                        "Sweden",
                        "Finland",
                        "Denmark"}));

        questions.add(new Question()
                .setQuestionText("Residents of which country in South America have U.S. citizenship?")
                .setRightAnswer("Puerto-Rico")
                .setAnswers(new String[] {
                        "Guatemala",
                        "Cuba",
                        "Puerto-Rico",
                        "Mexico"}));

        questions.add(new Question()
                .setQuestionText("Which of the following country is larger in its territory?")
                .setRightAnswer("Egypt")
                .setAnswers(new String[] {
                        "Jordan",
                        "Syria",
                        "Iraq",
                        "Egypt",}));

        questions.add(new Question()
                .setQuestionText("Which nuts are the main ingredient in the Nutella spread?")
                .setRightAnswer("Hazel nut")
                .setAnswers(new String[] {
                        "walnut",
                        "Brazil nut",
                        "Macadamia nut",
                        "Hazel nut"}));

        questions.add(new Question()
                .setQuestionText("What fish do you make gefilte fish from?")
                .setRightAnswer("carp")
                .setAnswers(new String[] {
                        "Bas",
                        "Trout",
                        "carp",
                        "Sea bream"}));

        questions.add(new Question()
                .setQuestionText("What is Ami and Tammy's original name in German?")
                .setRightAnswer("Henzel and Gretel")
                .setAnswers(new String[] {
                        "Elsa and Pol",
                        "Yorgan and Greta",
                        "Pol and Lea",
                        "Henzel and Gretel"}));

        questions.add(new Question()
                .setQuestionText("Who was Mose's wife?")
                .setRightAnswer("Tzipora")
                .setAnswers(new String[] {
                        "Rebecca",
                        "Lea",
                        "Tzipora",
                        "Miriam"}));

        questions.add(new Question()
                .setQuestionText("What is the name of a dish that is made with butter?")
                .setRightAnswer("Butter churm")
                .setAnswers(new String[] {
                        "stall",
                        "finishing off textile materials",
                        "espresso coffee maker",
                        "Butter churm"}));

        questions.add(new Question()
                .setQuestionText("Where is San Francisco located?")
                .setRightAnswer("West Coast United States")
                .setAnswers(new String[] {
                        "Central United States",
                        "West Coast United States",
                        "East Coast United States",
                        "South America"}));

        questions.add(new Question()
                .setQuestionText("What is the sum of the angles in the pentagon?")
                .setRightAnswer("540")
                .setAnswers(new String[] {
                        "360",
                        "450",
                        "540",
                        "500"}));


        return questions;
    }
}
