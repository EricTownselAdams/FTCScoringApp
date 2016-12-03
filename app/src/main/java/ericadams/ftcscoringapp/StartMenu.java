package ericadams.ftcscoringapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class StartMenu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_menu);
            }
    public void StartScoring(View view) {
        Intent GoToScoring = new Intent(this, ScoringScreen.class);
        startActivity(GoToScoring);
    }
    public void AboutPage(View view){
        Intent GoToAbout = new Intent(this, About.class);
        startActivity(GoToAbout);
    }
    public void SavedScoresPage(View view){
        Intent GoToSaved = new Intent(this, SavedScores.class);
        startActivity(GoToSaved);
    }
}
