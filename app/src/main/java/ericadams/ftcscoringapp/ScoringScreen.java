package ericadams.ftcscoringapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class ScoringScreen extends AppCompatActivity  {

    public int CapBallScoreAVar;
    Spinner CapBallSpinA;
    ArrayAdapter<CharSequence> CapBallAdapterAA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoring_screen);
        CapBallSpinA = (Spinner)findViewById(R.id.CapBallSpinA);
        CapBallAdapterAA = ArrayAdapter.createFromResource(this,R.array.CapBallAOptions,android.R.layout.simple_spinner_item);
        CapBallAdapterAA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        CapBallSpinA.setAdapter(CapBallAdapterAA);
        CapBallSpinA.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int CapBallScoreAVar = 10;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                int CapBallScoreAVar = 0;
            }
        });
    }
}
