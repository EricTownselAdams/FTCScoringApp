package ericadams.ftcscoringapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;


//CenterBallCountA = CenterBallCountA-1;


public class ScoringScreen extends AppCompatActivity  {

    Spinner CapBallSpinnerA;
    ArrayAdapter<CharSequence> CapBallAdapterAA;

    Spinner BeaconSpinnerA;
    ArrayAdapter<CharSequence> BeaconAdapterA;

    Spinner ParkedSpinnerA;
    ArrayAdapter<CharSequence> ParkedAdapterA;

    Button CenterAPlus;
    Button CenterAMinus;
    int CenterBallCountA;

    Button CornerAPlus;
    Button CornerAMinus;
    int CornerBallCount;

    int TotalScore = 0;
    int BeaconScore = 0;
    int ParkedScore = 0;
    int CornerScore = 0;
    int CenterScore = 0;
    int CapballScore = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoring_screen);

        CapBallSpinnerA = (Spinner)findViewById(R.id.CapBallSpinA);//Here --------------------------
        CapBallAdapterAA = ArrayAdapter.createFromResource(this,R.array.CapBallAOptions,android.R.layout.simple_spinner_item);
        CapBallAdapterAA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        CapBallSpinnerA.setAdapter(CapBallAdapterAA);

        BeaconSpinnerA = (Spinner)findViewById(R.id.BeaconSpinnerA);//Here --------------------------
        BeaconAdapterA = ArrayAdapter.createFromResource(this,R.array.BeaconAOptions,android.R.layout.simple_spinner_item);
        BeaconAdapterA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        BeaconSpinnerA.setAdapter(BeaconAdapterA);

        ParkedSpinnerA = (Spinner)findViewById(R.id.ParkedSpinnerA);
        ParkedAdapterA = ArrayAdapter.createFromResource(this,R.array.ParkedOptions,android.R.layout.simple_spinner_item);
        ParkedAdapterA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ParkedSpinnerA.setAdapter(ParkedAdapterA);

        CenterAMinus = (Button)findViewById(R.id.CenterAMinus);
        CenterAPlus = (Button)findViewById(R.id.CenterAPlus);

        CornerAMinus = (Button)findViewById(R.id.CornerAMinus);
        CornerAPlus = (Button)findViewById(R.id.CornerAPlus);


        CapBallSpinnerA.setOnItemSelectedListener(new OnItemSelectedListener() {
            TextView AutoScore = (TextView) findViewById(R.id.AutoScore);
            TextView CapBallScoreA = (TextView) findViewById(R.id.CapBallScoreA);
            TextView CornerScoreA = (TextView) findViewById(R.id.CornerScoreA);
            TextView CenterScoreA = (TextView) findViewById(R.id.CenterScoreA);
            TextView ParkedScoreA  = (TextView) findViewById(R.id.ParkedScoreA);
            TextView BeaconScoreA = (TextView) findViewById(R.id.BeaconScoreA);


            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.d("thing",CapBallSpinnerA.getSelectedItem().toString());

                if (CapBallSpinnerA.getSelectedItem().toString().equals("On Floor")){
                    CapBallScoreA.setText("5");
                } else{
                    CapBallScoreA.setText("0");
                    //txtValue.setText(Integer.toString(0));
                }

                TotalScore = (CornerScore+CenterScore+BeaconScore+ParkedScore+CapballScore);
                AutoScore.setText(Integer.toString(TotalScore));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


        BeaconSpinnerA.setOnItemSelectedListener(new OnItemSelectedListener() {
            TextView AutoScore = (TextView) findViewById(R.id.AutoScore);
            TextView CapBallScoreA = (TextView) findViewById(R.id.CapBallScoreA);
            TextView CornerScoreA = (TextView) findViewById(R.id.CornerScoreA);
            TextView CenterScoreA = (TextView) findViewById(R.id.CenterScoreA);
            TextView ParkedScoreA  = (TextView) findViewById(R.id.ParkedScoreA);
            TextView BeaconScoreA = (TextView) findViewById(R.id.BeaconScoreA);

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.d("thing",BeaconSpinnerA.getSelectedItem().toString());

                if (BeaconSpinnerA.getSelectedItem().toString().equals("1 Beacon")){
                    BeaconScore = 30;
                } else if(BeaconSpinnerA.getSelectedItem().toString().equals("2 Beacons")){
                    BeaconScore = 60;
                } else if(BeaconSpinnerA.getSelectedItem().toString().equals("0 Beacons")){
                    BeaconScore = 0;
                }
               // BeaconScoreA.setText(Integer.toString(BeaconScore));

                TotalScore = (CornerScore+CenterScore+BeaconScore+ParkedScore+CapballScore);

                AutoScore.setText(Integer.toString(TotalScore));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        ParkedSpinnerA.setOnItemSelectedListener(new OnItemSelectedListener() {
            TextView AutoScore = (TextView) findViewById(R.id.AutoScore);
            TextView CapBallScoreA = (TextView) findViewById(R.id.CapBallScoreA);
            TextView CornerScoreA = (TextView) findViewById(R.id.CornerScoreA);
            TextView CenterScoreA = (TextView) findViewById(R.id.CenterScoreA);
            TextView ParkedScoreA  = (TextView) findViewById(R.id.ParkedScoreA);
            TextView BeaconScoreA = (TextView) findViewById(R.id.BeaconScoreA);

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.d("thing",ParkedSpinnerA .getSelectedItem().toString());

                if (ParkedSpinnerA.getSelectedItem().toString().equals("Half Center")){
                    ParkedScoreA.setText(ParkedScore);
                } else if(ParkedSpinnerA.getSelectedItem().toString().equals("Full Center")){
                    ParkedScore = 10;
                    ParkedScoreA.setText(ParkedScore);
                    //txtValue.setText(Integer.toString(0));
                } else if(ParkedSpinnerA.getSelectedItem().toString().equals("Half Corner")){
                    ParkedScore = 5;
                    ParkedScoreA.setText(ParkedScore);
                    //txtValue.setText(Integer.toString(0));
                } else if(ParkedSpinnerA.getSelectedItem().toString().equals("Full Corner")){
                    ParkedScore = 10;
                    ParkedScoreA.setText(ParkedScore);
                    //txtValue.setText(Integer.toString(0));
                } else if(ParkedSpinnerA.getSelectedItem().toString().equals("Not Parked")){
                    ParkedScore = 0;
                    ParkedScoreA.setText(ParkedScore);
                }

                TotalScore += (ParkedScore);
                AutoScore.setText(Integer.toString(TotalScore));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        CenterAMinus.setOnClickListener(new View.OnClickListener(){
            TextView CenterBallCountLabel = (TextView) findViewById(R.id.CenterBallCountLabelA);
            TextView AutoScore = (TextView) findViewById(R.id.AutoScore);
            TextView CapBallScoreA = (TextView) findViewById(R.id.CapBallScoreA);
            TextView CornerScoreA = (TextView) findViewById(R.id.CornerScoreA);
            TextView CenterScoreA = (TextView) findViewById(R.id.CenterScoreA);
            TextView ParkedScoreA  = (TextView) findViewById(R.id.ParkedScoreA);
            TextView BeaconScoreA = (TextView) findViewById(R.id.BeaconScoreA);

            public void onClick(View v){
                CenterBallCountA = CenterBallCountA - 1;

                CenterScoreA.setText(Integer.toString(CenterBallCountA*15));
                CenterBallCountLabel.setText(Integer.toString(CenterBallCountA));


                CenterScore += (CenterBallCountA*15);
                TotalScore += (CenterScore);
                AutoScore.setText(Integer.toString(TotalScore));
            }
        });
        CenterAPlus.setOnClickListener(new View.OnClickListener(){
            TextView CenterBallCountLabel = (TextView) findViewById(R.id.CenterBallCountLabelA);
            TextView AutoScore = (TextView) findViewById(R.id.AutoScore);
            TextView CapBallScoreA = (TextView) findViewById(R.id.CapBallScoreA);
            TextView CornerScoreA = (TextView) findViewById(R.id.CornerScoreA);
            TextView CenterScoreA = (TextView) findViewById(R.id.CenterScoreA);
            TextView ParkedScoreA  = (TextView) findViewById(R.id.ParkedScoreA);
            TextView BeaconScoreA = (TextView) findViewById(R.id.BeaconScoreA);


            public void onClick(View v){
                CenterBallCountA = CenterBallCountA + 1;

                CenterScoreA.setText(Integer.toString(CenterBallCountA*15));
                CenterBallCountLabel.setText(Integer.toString(CenterBallCountA));

                TotalScore += (CornerBallCount*5);
                AutoScore.setText(Integer.toString(TotalScore));

            }
        });

        CornerAMinus.setOnClickListener(new View.OnClickListener(){
            TextView CornerBallCountA = (TextView) findViewById(R.id.CornerBallCountLabelA);
            TextView AutoScore = (TextView) findViewById(R.id.AutoScore);
            TextView CapBallScoreA = (TextView) findViewById(R.id.CapBallScoreA);
            TextView CornerScoreA = (TextView) findViewById(R.id.CornerScoreA);
            TextView CenterScoreA = (TextView) findViewById(R.id.CenterScoreA);
            TextView ParkedScoreA  = (TextView) findViewById(R.id.ParkedScoreA);
            TextView BeaconScoreA = (TextView) findViewById(R.id.BeaconScoreA);

            public void onClick(View v){
                CornerBallCount = CornerBallCount - 1;

                CornerScoreA.setText(Integer.toString(CornerBallCount*5));
                CornerBallCountA.setText(Integer.toString(CornerBallCount));

                TotalScore += (CornerBallCount*5);
                AutoScore.setText(Integer.toString(TotalScore));
            }
        });
        CornerAPlus.setOnClickListener(new View.OnClickListener(){
            TextView CornerBallCountLabel = (TextView) findViewById(R.id.CornerBallCountLabelA);
            TextView AutoScore = (TextView) findViewById(R.id.AutoScore);
            TextView CapBallScoreA = (TextView) findViewById(R.id.CapBallScoreA);
            TextView CornerScoreA = (TextView) findViewById(R.id.CornerScoreA);
            TextView CenterScoreA = (TextView) findViewById(R.id.CenterScoreA);
            TextView ParkedScoreA  = (TextView) findViewById(R.id.ParkedScoreA);
            TextView BeaconScoreA = (TextView) findViewById(R.id.BeaconScoreA);





            public void onClick(View v){
                CornerBallCount = CornerBallCount + 1;

                CornerScoreA.setText(Integer.toString(CornerBallCount*5));
                CornerBallCountLabel.setText(Integer.toString(CornerBallCount));

                TotalScore += (CornerBallCount*5);
                AutoScore.setText(Integer.toString(TotalScore));

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
