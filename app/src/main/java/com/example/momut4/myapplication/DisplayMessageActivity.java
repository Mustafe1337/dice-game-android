package com.example.momut4.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Display message activity
 * Created by momut4 on 2015-11-17.
 */
public class DisplayMessageActivity extends AppCompatActivity {

    Dice dice = new Dice();
    String hold="";
    int totalScore=0;
    int totalRolls=0;
    int ballong =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    /**
     * Rullar tärningen
     * @param v
     */
    public void rollDice(View v) {
        // Rullar tärningen och lägger till den i poängen
        ballong = dice.roll();
        totalScore += ballong;
        totalRolls++;

        // Sätter texten till tärningens värde
        hold = "" + ballong;
        TextView t = (TextView) findViewById(R.id.textResult);
        t.setText (hold);

        // Sätter texten till totala poängens värde
        t = (TextView) findViewById(R.id.Score);
        hold = " " + totalScore;
        t.setText(hold);

        // Sätter texten till totala antal gången användaren har rullet
        hold = " " + totalRolls;
        t = (TextView) findViewById(R.id.textRoll);
        t.setText(hold);


        // Hanterar vinster och förluster
        t = (TextView) findViewById(R.id.fakinkLose);

        // Om poängen är över 69 så har man förlorat
        if(totalScore > 69) {
            // Sätter texten till förlust
            t.setText("DEFEAT");
            Button btn = (Button) findViewById(R.id.RollButton);
            btn.setEnabled(false);
        }
        else if(totalScore == 69){
            // Sätter texten till vinst
            t.setText("VICTORY");
            Button btn = (Button) findViewById(R.id.RollButton);
            btn.setEnabled(false);
        }

    }

    /**
     * Omstartsknapp
     * @param v
     */
    public void restartBtn(View v){
        totalScore = 0;
        totalRolls =0;
        // Knapp för att rulla tärningar
        Button btn = (Button) findViewById(R.id.RollButton);
        btn.setEnabled(true);
        // Resultat-text
        TextView t = (TextView) findViewById(R.id.textResult);
        t.setText("0");
        // Tärningsvärde-text
        t = (TextView) findViewById(R.id.textRoll);
        t.setText("0");
        // Poäng-text
        t = (TextView) findViewById(R.id.Score);
        t.setText("0");
        // Vinst/Förlust text
        t = (TextView) findViewById(R.id.fakinkLose);
        t.setText("");
    }

}