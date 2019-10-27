package com.example.cricketscoreboard;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int scoreTeamA = 0;//gloabal variable for total score of Team A
    private int scoreTeamB = 0;//gloabal variable for total score of Team B

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
/*
* Display the Given score of Team A
* */
    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);//find view by id
        scoreView.setText(String.valueOf(score));//set the view with current value
    }

    public void onerun(View v){//total score of Team A add 1
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);//display the total score of TeamA
    }

    public void tworun(View v){//total score of Team A add 2
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);//display the total score of TeamA
    }

    public void threerun(View v){//total score of Team A add 3
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);//display the total score of TeamA
    }

    public void fourrun(View v){ //total score of Team A add 4
        scoreTeamA += 4;
        displayForTeamA(scoreTeamA);//display the total score of TeamA
    }

    public void sixrun(View v){ //total score of Team A add 6
        scoreTeamA += 6;
        displayForTeamA(scoreTeamA);//display the total score of TeamA
    }
    /*
     * Display the Given score of Team B
     * */
    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);//find view by id
        scoreView.setText(String.valueOf(score));//set the view with current value
    }

    public void onerunb(View v){//total score of Team A add 1
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);//display the total score of TeamA
    }

    public void tworunb(View v){//total score of Team A add 2
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);//display the total score of TeamA
    }

    public void threerunb(View v){//total score of Team A add 3
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);//display the total score of TeamA
    }

    public void fourrunb(View v){ //total score of Team A add 4
        scoreTeamB += 4;
        displayForTeamB(scoreTeamB);//display the total score of TeamA
    }

    public void sixrunb(View v){ //total score of Team A add 6
        scoreTeamB += 6;
        displayForTeamB(scoreTeamB);//display the total score of TeamA
    }

    public void reset(View v){//reset the score of both team
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(0);
        displayForTeamB(0);
    }
}
