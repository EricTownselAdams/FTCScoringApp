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

    Spinner CapBallSpinnerE;
    ArrayAdapter<CharSequence> CapBallAdapterE;

    Spinner BeaconSpinnerE;
    ArrayAdapter<CharSequence> BeaconAdapterE;

    Button CenterPlusA;
    Button CenterMinusA;
    int CenterCountIntA;
    Button CornerPlusA;
    Button CornerMinusA;
    int CornerCountIntA;

    Button CenterPlusD;
    Button CenterMinusD;
    int CenterCountIntD;
    Button CornerPlusD;
    Button CornerMinusD;
    int CornerCountIntD;


    int AutoScoreIntA = 0;
    int BeaconScoreIntA = 0;
    int ParkedScoreIntA = 0;
    int CornerScoreIntA = 0;
    int CenterScoreIntA = 0;
    int CapballScoreIntA = 0;

    int DriverScoreIntD;
    int CenterScoreIntD;
    int CornerScoreIntD;

    int EndScoreIntE;
    int CapballScoreIntE;


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

        CapBallSpinnerE = (Spinner)findViewById(R.id.CapBallSpinnerE);
        CapBallAdapterE = ArrayAdapter.createFromResource(this,R.array.ParkedOptions,android.R.layout.simple_spinner_item);
        CapBallAdapterE.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        CapBallSpinnerE.setAdapter(CapBallAdapterE);

        BeaconSpinnerE = (Spinner)findViewById(R.id.BeaconSpinnerE);
        BeaconAdapterE = ArrayAdapter.createFromResource(this,R.array.ParkedOptions,android.R.layout.simple_spinner_item);
        BeaconAdapterE.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        BeaconSpinnerE.setAdapter(BeaconAdapterE);

        CenterMinusA = (Button)findViewById(R.id.CenterMinusA);
        CenterPlusA = (Button)findViewById(R.id.CenterPlusA);

        CornerMinusA = (Button)findViewById(R.id.CornerMinusA);
        CornerPlusA = (Button)findViewById(R.id.CornerPlusA);

        CenterMinusD = (Button)findViewById(R.id.CenterMinusD);
        CenterPlusD = (Button)findViewById(R.id.CenterPlusD);

        CornerMinusD = (Button)findViewById(R.id.CornerMinusD);
        CornerPlusD = (Button)findViewById(R.id.CornerPlusD);


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
                    CapballScoreIntA = 5;
                } else{
                    CapBallScoreA.setText("0");
                    CapballScoreIntA = 0;
                    //txtValue.setText(Integer.toString(0));
                }

                AutoScoreIntA = 0;
                AutoScoreIntA = (CornerScoreIntA+CenterScoreIntA+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA);
                AutoScore.setText(Integer.toString(AutoScoreIntA));
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
                    BeaconScoreIntA = 30;
                } else if(BeaconSpinnerA.getSelectedItem().toString().equals("2 Beacons")){
                    BeaconScoreIntA = 60;
                } else if(BeaconSpinnerA.getSelectedItem().toString().equals("0 Beacons")){
                    BeaconScoreIntA = 0;
                }
               // BeaconScoreA.setText(Integer.toString(BeaconScore));
                BeaconScoreA.setText(Integer.toString(BeaconScoreIntA));
                AutoScoreIntA = 0;
                AutoScoreIntA = (CornerScoreIntA+CenterScoreIntA+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA);
                AutoScore.setText(Integer.toString(AutoScoreIntA));
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
                    ParkedScoreIntA = 5;
                } else if(ParkedSpinnerA.getSelectedItem().toString().equals("Full Center")){
                    ParkedScoreIntA = 10;
                    //txtValue.setText(Integer.toString(0));
                } else if(ParkedSpinnerA.getSelectedItem().toString().equals("Half Corner")){
                    ParkedScoreIntA = 5;
                    //txtValue.setText(Integer.toString(0));
                } else if(ParkedSpinnerA.getSelectedItem().toString().equals("Full Corner")){
                    ParkedScoreIntA = 10;
                    //txtValue.setText(Integer.toString(0));
                } else if(ParkedSpinnerA.getSelectedItem().toString().equals("Not Parked")){
                    ParkedScoreIntA = 0;
                    ParkedScoreA.setText(Integer.toString(ParkedScoreIntA));
                }

                ParkedScoreA.setText(Integer.toString(ParkedScoreIntA));

                AutoScoreIntA = 0;
                AutoScoreIntA = ((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA);
                AutoScore.setText(Integer.toString(AutoScoreIntA));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        CenterMinusA.setOnClickListener(new View.OnClickListener(){
            TextView CenterBallCountLabel = (TextView) findViewById(R.id.CenterCountLabelA);
            TextView AutoScore = (TextView) findViewById(R.id.AutoScore);
            TextView CapBallScoreA = (TextView) findViewById(R.id.CapBallScoreA);
            TextView CornerScoreA = (TextView) findViewById(R.id.CornerScoreA);
            TextView CenterScoreA = (TextView) findViewById(R.id.CenterScoreA);
            TextView ParkedScoreA  = (TextView) findViewById(R.id.ParkedScoreA);
            TextView BeaconScoreA = (TextView) findViewById(R.id.BeaconScoreA);

            public void onClick(View v){
                CenterCountIntA = CenterCountIntA - 1;

                CenterScoreA.setText(Integer.toString(CenterCountIntA*15));
                CenterBallCountLabel.setText(Integer.toString(CenterCountIntA));


                CenterScoreIntA += (CenterCountIntA*15);
                AutoScoreIntA = 0;
                AutoScoreIntA = ((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA);
                AutoScore.setText(Integer.toString(AutoScoreIntA));
            }
        });

        CenterPlusA.setOnClickListener(new View.OnClickListener(){
            TextView CenterBallCountLabel = (TextView) findViewById(R.id.CenterCountLabelA);
            TextView AutoScore = (TextView) findViewById(R.id.AutoScore);
            TextView CapBallScoreA = (TextView) findViewById(R.id.CapBallScoreA);
            TextView CornerScoreA = (TextView) findViewById(R.id.CornerScoreA);
            TextView CenterScoreA = (TextView) findViewById(R.id.CenterScoreA);
            TextView ParkedScoreA  = (TextView) findViewById(R.id.ParkedScoreA);
            TextView BeaconScoreA = (TextView) findViewById(R.id.BeaconScoreA);


            public void onClick(View v){
                CenterCountIntA = CenterCountIntA + 1;

                CenterScoreA.setText(Integer.toString(CenterCountIntA*15));
                CenterBallCountLabel.setText(Integer.toString(CenterCountIntA));

                System.out.print(CenterScoreIntA);

                CenterScoreIntA = (CenterCountIntA*5);
                AutoScoreIntA = 0;
;               AutoScoreIntA = ((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA);
                AutoScore.setText(Integer.toString(AutoScoreIntA));

            }
        });

        CornerMinusA.setOnClickListener(new View.OnClickListener(){
            TextView CornerBallCountA = (TextView) findViewById(R.id.CornerCountLabelA);
            TextView AutoScore = (TextView) findViewById(R.id.AutoScore);
            TextView CapBallScoreA = (TextView) findViewById(R.id.CapBallScoreA);
            TextView CornerScoreA = (TextView) findViewById(R.id.CornerScoreA);
            TextView CenterScoreA = (TextView) findViewById(R.id.CenterScoreA);
            TextView ParkedScoreA  = (TextView) findViewById(R.id.ParkedScoreA);
            TextView BeaconScoreA = (TextView) findViewById(R.id.BeaconScoreA);

            public void onClick(View v){
                CornerCountIntA = CornerCountIntA - 1;

                CornerScoreA.setText(Integer.toString(CornerCountIntA*5));
                CornerBallCountA.setText(Integer.toString(CornerCountIntA));

                AutoScoreIntA = 0;
                CornerScoreIntA = (CornerCountIntA*5);
                AutoScoreIntA = ((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA);
                AutoScore.setText(Integer.toString(AutoScoreIntA));
            }
        });

        CornerPlusA.setOnClickListener(new View.OnClickListener(){
            TextView CornerBallCountLabel = (TextView) findViewById(R.id.CornerCountLabelA);
            TextView AutoScore = (TextView) findViewById(R.id.AutoScore);
            TextView CapBallScoreA = (TextView) findViewById(R.id.CapBallScoreA);
            TextView CornerScoreA = (TextView) findViewById(R.id.CornerScoreA);
            TextView CenterScoreA = (TextView) findViewById(R.id.CenterScoreA);
            TextView ParkedScoreA  = (TextView) findViewById(R.id.ParkedScoreA);
            TextView BeaconScoreA = (TextView) findViewById(R.id.BeaconScoreA);





            public void onClick(View v){
                CornerCountIntA = CornerCountIntA + 1;

                CornerScoreA.setText(Integer.toString(CornerCountIntA*5));
                CornerBallCountLabel.setText(Integer.toString(CornerCountIntA));

                AutoScoreIntA = 0;
                CornerScoreIntA += (CornerCountIntA*5);
                AutoScoreIntA = ((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA);
                AutoScore.setText(Integer.toString(AutoScoreIntA));

            }
        });



        CornerPlusD.setOnClickListener(new View.OnClickListener(){
            TextView DriverScore = (TextView) findViewById(R.id.DriverScore);
            TextView CornerCountLabelD = (TextView) findViewById(R.id.CornerCountLabelD);
            TextView CornerScoreD = (TextView) findViewById(R.id.CornerScoreD);


            public void onClick(View v){
                CornerCountIntD = CornerCountIntD + 1;

                CornerScoreD.setText(Integer.toString(CornerCountIntD));
                CornerCountLabelD.setText(Integer.toString(CornerCountIntD));

                DriverScoreIntD = 0;
                DriverScoreIntD = (CornerCountIntD)+(CenterCountIntD*5);
                DriverScore.setText(Integer.toString(DriverScoreIntD));

            }
        });

        CornerMinusD.setOnClickListener(new View.OnClickListener(){
            TextView DriverScore = (TextView) findViewById(R.id.DriverScore);
            TextView CornerCountLabelD = (TextView) findViewById(R.id.CornerCountLabelD);
            TextView CornerScoreD = (TextView) findViewById(R.id.CornerScoreD);


            public void onClick(View v){
                CornerCountIntD = CornerCountIntD - 1;

                CornerScoreD.setText(Integer.toString(CornerCountIntD));
                CornerCountLabelD.setText(Integer.toString(CornerCountIntD));

                DriverScoreIntD = 0;
                DriverScoreIntD = (CornerCountIntD)+(CenterCountIntD*5);
                DriverScore.setText(Integer.toString(DriverScoreIntD));

            }
        });

        CenterPlusD.setOnClickListener(new View.OnClickListener(){
            TextView DriverScore = (TextView) findViewById(R.id.DriverScore);
            TextView CenterCountLabelD = (TextView) findViewById(R.id.CenterCountLabelD);
            TextView CenterScoreD = (TextView) findViewById(R.id.CenterScoreD);


            public void onClick(View v){
                CenterCountIntD = CenterCountIntD + 1;

                CenterScoreD.setText(Integer.toString(CenterCountIntD*5));
                CenterCountLabelD.setText(Integer.toString(CenterCountIntD));

                DriverScoreIntD = 0;
                DriverScoreIntD = (CornerCountIntD)+(CenterCountIntD*5);
                DriverScore.setText(Integer.toString(DriverScoreIntD));

            }
        });

        CenterMinusD.setOnClickListener(new View.OnClickListener(){
            TextView DriverScore = (TextView) findViewById(R.id.DriverScore);
            TextView CenterCountLabelD = (TextView) findViewById(R.id.CenterCountLabelD);
            TextView CenterScoreD = (TextView) findViewById(R.id.CenterScoreD);



            public void onClick(View v){
                CenterCountIntD = CenterCountIntD - 1;

                CenterScoreD.setText(Integer.toString(CenterCountIntD*5));
                CenterCountLabelD.setText(Integer.toString(CenterCountIntD));

                DriverScoreIntD = 0;
                DriverScoreIntD = (CornerCountIntD)+(CenterCountIntD*5);
                DriverScore.setText(Integer.toString(DriverScoreIntD));

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
