package ericadams.ftcscoringapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

import static ericadams.ftcscoringapp.R.id.CapBallScoreA;

public class ScoringScreen extends AppCompatActivity  {
    Spinner CapBallSpinA;
    ArrayAdapter<CharSequence> CapBallAdapterAA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // final TextView CapBallScoreA = (TextView) findViewById(R.id.CapBallScoreA);
        setContentView(R.layout.activity_scoring_screen);
        CapBallSpinA = (Spinner)findViewById(R.id.CapBallSpinA);
        CapBallAdapterAA = ArrayAdapter.createFromResource(this,R.array.CapBallAOptions,android.R.layout.simple_spinner_item);
        CapBallAdapterAA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        CapBallSpinA.setAdapter(CapBallAdapterAA);
        CapBallSpinA.setOnItemSelectedListener(new OnItemSelectedListener() {
            final TextView CapBallScoreA = (TextView) findViewById(R.id.CapBallScoreA);
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.d("thing",CapBallSpinA.getSelectedItem().toString());

                if (CapBallSpinA.getSelectedItem().toString().equals("On Floor")){
                    CapBallScoreA.setText("5");
                } else{
                    CapBallScoreA.setText("0");
                    //txtValue.setText(Integer.toString(0));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
              //  int CapBallScoreA = 0;
            }
        });
    //    Log.d(CapBallSpinA.getSelectedItem().toString());
    }
}
