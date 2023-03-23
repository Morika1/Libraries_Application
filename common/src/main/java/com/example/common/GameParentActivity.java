package com.example.common;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;

public abstract class GameParentActivity extends AppCompatActivity {

    public final static int NUM_ANSWERS =4;

    private MaterialTextView game_LBL_question;
    private MaterialButton[] game_BTN_answers;

    GameManager manager;
    protected abstract ArrayList<Question> getData();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        findViews();
        initViews();

        manager = new GameManager(getData());

        updateUI();
    }


    private void updateUI() {

        if(manager.isEndGame()){
            MySignal.getInstance().showToast(manager.getCorrectCounter() + "/10 are correct!");
            finish();
            return;
        }
        game_LBL_question.setText(manager.getCurrentQuestion());
        for(int i=0;i<NUM_ANSWERS; i++)
            game_BTN_answers[i].setText(manager.getCurrentAnswers()[i]);

    }

    private void initViews() {

        for(int i=0; i<NUM_ANSWERS; i++) {
            int finalI = i;
            game_BTN_answers[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(manager.checkAnswer(game_BTN_answers[finalI].getText().toString())){
                        MySignal.getInstance().showToast("Good job man!");
                    }
                    else{
                        MySignal.getInstance().showToast("Stupid answer man!");
                    }

                    updateUI();


                }
            });
        }

    }


    private void findViews() {

        game_LBL_question = findViewById(R.id.game_LBL_question);
        game_BTN_answers = new MaterialButton[]{
                findViewById(R.id.game_BTN_1),
                findViewById(R.id.game_BTN_2),
                findViewById(R.id.game_BTN_3),
                findViewById(R.id.game_BTN_4)
        };




    }
}
