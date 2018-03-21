package com.example.rgathergood.rockpaperscissorslab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button rockButton;
    Button paperButton;
    Button scissorsButton;
    TextView answerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rockButton = (Button)findViewById(R.id.rockButton);
        paperButton = (Button)findViewById(R.id.paperButton);
        scissorsButton = (Button)findViewById(R.id.scissorsButton);
        answerTextView= (TextView)findViewById(R.id.answerTextView);
    }

    public void onRockButtonClicked(View button) {
        Game game = new Game();
        Game.Choice userChoice = Game.Choice.ROCK;
        answerTextView.setText(game.play(userChoice));
    }

    public void onPaperButtonClicked(View button) {
        Game game = new Game();
        Game.Choice userChoice = Game.Choice.PAPER;
        answerTextView.setText(game.play(userChoice));
    }

    public void onScissorsButtonClicked(View button) {
        Game game = new Game();
        Game.Choice userChoice = Game.Choice.SCISSORS;
        answerTextView.setText(game.play(userChoice));
    }

//    public void onButtonClicked(View button) {
//        Game game = new Game();
//        Game.Choice userChoice = ;
//
//        switch (button.getId()) {
//            case R.id.rockButton:
//                userChoice = Game.Choice.ROCK;
//                break;
//            case R.id.paperButton:
//                userChoice = Game.Choice.PAPER;
//                break;
//            case R.id.scissorsButton:
//                userChoice = Game.Choice.SCISSORS;
//                break;
//        }
//
//        String result = game.play(userChoice);
//        answerTextView.setText(result);
//    }


}
