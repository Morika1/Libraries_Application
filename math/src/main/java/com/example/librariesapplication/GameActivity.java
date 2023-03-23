package com.example.librariesapplication;

import com.example.common.GameParentActivity;
import com.example.common.Question;

import java.util.ArrayList;

public class GameActivity extends GameParentActivity {


    @Override
    protected ArrayList<Question> getData() {
        return DataManager.getQuestions();
    }
}
