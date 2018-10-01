package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0;
    int scoreTeamB=0;
    int overTeamA = 0;
    int overTeamB = 0;
    int wicketsTeamA = 0;
    int wicketsTeamB = 0;
    int ballsTeamA = 0;
    int ballsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the wickets for Team A.
     */
    public void wdisplayForTeamA(int wickets) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_wickets);
        scoreView.setText(String.valueOf(wicketsTeamA));
    }

    public void wicketsTeamA(View V) {
        bdisplayForTeamA(ballsTeamA);
        wicketsTeamA = wicketsTeamA + 1;
        wdisplayForTeamA(wicketsTeamA);
    }


    /**
     * Displays the wickets for Team B.
     */
    public void wdisplayForTeamB(int wicket) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_wickets);
        scoreView.setText(String.valueOf(wicketsTeamB));
        bdisplayForTeamB(ballsTeamB);
    }

    public void wicketsTeamB(View V) {
        wicketsTeamB = wicketsTeamB + 1;
        wdisplayForTeamB(wicketsTeamB);
    }

    /**
     * Displays the balls for Team A.
     */
    public void bdisplayForTeamA(int runs) {
        odisplayForTeamA(overTeamA);

        ballsTeamA = ballsTeamA + 1;

        TextView scoreView = (TextView) findViewById(R.id.team_a_balls);
        scoreView.setText(String.valueOf(ballsTeamA));
    }


    /**
     * Displays the balls for Team B.
     */
    public void bdisplayForTeamB(int runs) {
        odisplayForTeamB(overTeamB);

        ballsTeamB = ballsTeamB + 1;

        TextView scoreView = (TextView) findViewById(R.id.team_b_balls);
        scoreView.setText(String.valueOf(ballsTeamB));
    }


    /**
     * Displays the overs for Team A.
     */
    public void odisplayForTeamA(int overs) {

        if (ballsTeamA == 6) {
            ballsTeamA = 0;
            overTeamA = overTeamA + 1;
        }
        TextView scoreView = (TextView) findViewById(R.id.team_a_overs);
        scoreView.setText(String.valueOf(overTeamA));

    }


    /**
     * Displays the overs for Team B.
     */
    public void odisplayForTeamB(int overs) {

        if (ballsTeamB == 6) {
            ballsTeamB = 0;
            overTeamB = overTeamB + 1;
        }
        TextView scoreView = (TextView) findViewById(R.id.team_b_overs);
        scoreView.setText(String.valueOf(overTeamB));
    }


    /**
     * adding methods to Team A.
     */
    public void freeForTeamA(View V) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);

    }

    public void zeroForTeamA(View V) {
        bdisplayForTeamA(ballsTeamA);

    }


    public void oneForTeamA(View V) {
        bdisplayForTeamA(ballsTeamA);
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);

    }


    public void twoForTeamA(View V) {
        bdisplayForTeamA(ballsTeamA);
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);

    }


    public void threeForTeamA(View V) {
        bdisplayForTeamA(ballsTeamA);
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }


    public void fourForTeamA(View V) {
        bdisplayForTeamA(ballsTeamA);
        scoreTeamA = scoreTeamA + 4;
        displayForTeamA(scoreTeamA);

    }


    public void sixForTeamA(View V) {
        bdisplayForTeamA(ballsTeamA);
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA);

    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }



    /**
     * adding methods to Team B.
     */
    public void freeForTeamB(View V) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);

    }



    public void zeroForTeamB(View V) {

        bdisplayForTeamB(ballsTeamB);

    }


    public void oneForTeamB(View V) {

        bdisplayForTeamB(ballsTeamB);
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }


    public void twoForTeamB(View V) {

        bdisplayForTeamB(ballsTeamB);
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }


    public void threeForTeamB(View V) {

        bdisplayForTeamB(ballsTeamB);
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }


    public void fourForTeamB(View V) {

        bdisplayForTeamB(ballsTeamB);
        scoreTeamB = scoreTeamB + 4;
        displayForTeamB(scoreTeamB);
    }


    public void sixForTeamB(View V) {

        bdisplayForTeamB(ballsTeamB);
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB(scoreTeamB);
    }
    public void reset(View V){


        scoreTeamA = 0;
        ballsTeamA = -1;
        overTeamA = 0;
        wicketsTeamA = 0;
        scoreTeamB = 0;
        ballsTeamB = -1;
        overTeamB = 0;
        wicketsTeamB = 0;
        bdisplayForTeamA(0);
        displayForTeamA(0);
        displayForTeamB(0);
        odisplayForTeamA(0);
        odisplayForTeamB(0);
        wdisplayForTeamA(0);
        wdisplayForTeamB(0);

    }
}
