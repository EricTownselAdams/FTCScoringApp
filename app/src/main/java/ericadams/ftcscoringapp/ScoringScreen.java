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

import static ericadams.ftcscoringapp.R.id.BeaconScoreA;
import static ericadams.ftcscoringapp.R.id.CapBallScoreA;
import static ericadams.ftcscoringapp.R.id.ParkedSpinnerA;

public class ScoringScreen extends AppCompatActivity  {
    Spinner CapBallSpinnerA;
    ArrayAdapter<CharSequence> CapBallAdapterAA;
    Spinner BeaconSpinnerA;
    ArrayAdapter<CharSequence> BeaconAdapterA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoring_screen);
        CapBallSpinnerA = (Spinner)findViewById(R.id.CapBallSpinA);//Here --------------------------
        CapBallAdapterAA = ArrayAdapter.createFromResource(this,R.array.CapBallAOptions,android.R.layout.simple_spinner_item);
        CapBallAdapterAA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        CapBallSpinnerA.setAdapter(CapBallAdapterAA);

        CapBallSpinnerA.setOnItemSelectedListener(new OnItemSelectedListener() {
            final TextView CapBallScoreA = (TextView) findViewById(R.id.CapBallScoreA);
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.d("thing",CapBallSpinnerA.getSelectedItem().toString());

                if (CapBallSpinnerA.getSelectedItem().toString().equals("On Floor")){
                    CapBallScoreA.setText("5");
                } else{
                    CapBallScoreA.setText("0");
                    //txtValue.setText(Integer.toString(0));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        BeaconSpinnerA = (Spinner)findViewById(R.id.BeaconSpinnerA);//Here --------------------------
        BeaconAdapterA = ArrayAdapter.createFromResource(this,R.array.BeaconAOptions,android.R.layout.simple_spinner_item);
        BeaconAdapterA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        BeaconSpinnerA.setAdapter(BeaconAdapterA);
        BeaconSpinnerA.setOnItemSelectedListener(new OnItemSelectedListener() {
            final TextView BeaconScoreA = (TextView) findViewById(R.id.BeaconScoreA);
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.d("thing",BeaconSpinnerA.getSelectedItem().toString());

                if (BeaconSpinnerA.getSelectedItem().toString().equals("1 Beacon")){
                    BeaconScoreA.setText("30");
                } else if(BeaconSpinnerA.getSelectedItem().toString().equals("2 Beacons")){
                    BeaconScoreA.setText("60");
                } else if(BeaconSpinnerA.getSelectedItem().toString().equals("0 Beacons")){
                    BeaconScoreA.setText("0");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });// Here--------------------------------------------------------------------------------
        ParkedSpinnerA = (Spinner)findViewById(ParkedSpinnerA);//Here --------------------------
        BeaconAdapterA = ArrayAdapter.createFromResource(this,R.array.ParkedOptions ,android.R.layout.simple_spinner_item);
        ParkedSpinnerA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ParkedSpinnerA (CHANGE );

        CHANGE .setOnItemSelectedListener(new OnItemSelectedListener() {
            final TextView CHANGE  = (TextView) findViewById(R.id.CHANGE );
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.d("thing",CHANGE .getSelectedItem().toString());

                if (CHANGE .getSelectedItem().toString().equals("On Floor")){
                    CHANGE .setText("CHANGE");
                } else{
                    CHANGE .setText("CHANGE");
                    //txtValue.setText(Integer.toString(0));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}
/*
 CHANGE = (Spinner)findViewById(CHANGE);//Here --------------------------
        CHANGE = ArrayAdapter.createFromResource(this,R.array.CHANGE ,android.R.layout.simple_spinner_item);
        CHANGE (android.R.layout.simple_spinner_dropdown_item);
        CHANGE (CHANGE );

        CHANGE .setOnItemSelectedListener(new OnItemSelectedListener() {
            final TextView CHANGE  = (TextView) findViewById(R.id.CHANGE );
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.d("thing",CHANGE .getSelectedItem().toString());

                if (CHANGE .getSelectedItem().toString().equals("On Floor")){
                    CHANGE .setText("CHANGE");
                } else{
                    CHANGE .setText("CHANGE");
                    //txtValue.setText(Integer.toString(0));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
*/
