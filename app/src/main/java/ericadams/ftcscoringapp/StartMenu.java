package ericadams.ftcscoringapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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
}
