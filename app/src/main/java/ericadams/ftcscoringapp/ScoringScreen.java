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

import org.w3c.dom.Text;


public class ScoringScreen extends AppCompatActivity  {

    Spinner CapBallSpinnerA;
    ArrayAdapter<CharSequence> CapBallAdapterAA;

    Spinner BeaconSpinnerA;
    ArrayAdapter<CharSequence> BeaconAdapterA;

    Spinner ParkedSpinnerA;
    ArrayAdapter<CharSequence> ParkedAdapterA;


    Button CenterPlusA;
    Button CenterMinusA;
    Button CornerPlusA;
    Button CornerMinusA;


    Button ResetButton;

<<<<<<< HEAD
    int CornerCountIntA = 0;
    int CenterCountIntA = 0;
=======
    int CenterCountIntD;
    int CornerCountIntD;

    int CornerCountIntA;
    int CenterCountIntA;
>>>>>>> parent of df35358... Before Delete of major parts
    int AutoScoreIntA = 0;
    int BeaconScoreIntA = 0;
    int ParkedScoreIntA = 0;
    int CornerScoreIntA = 0;
    int CenterScoreIntA = 0;
    int CapballScoreIntA = 0;

<<<<<<< HEAD
=======
    int DriverScoreIntD;
    int CenterScoreIntD;
    int CornerScoreIntD;

    int EndScoreIntE;
    int CapballScoreIntE;
    int BeaconScoreIntE;


>>>>>>> parent of df35358... Before Delete of major parts
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


        CenterMinusA = (Button)findViewById(R.id.CenterMinusA);
        CenterPlusA = (Button)findViewById(R.id.CenterPlusA);

        CornerMinusA = (Button)findViewById(R.id.CornerMinusA);
        CornerPlusA = (Button)findViewById(R.id.CornerPlusA);



        ResetButton = (Button)findViewById(R.id.ResetButton);





        CapBallSpinnerA.setOnItemSelectedListener(new OnItemSelectedListener() {
            TextView AutoScore = (TextView) findViewById(R.id.AutoScore);
            TextView CapBallScoreA = (TextView) findViewById(R.id.CapBallScoreA);
            TextView TotalScore = (TextView) findViewById(R.id.TotalScore);



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
                TotalScore.setText(Integer.toString((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        BeaconSpinnerA.setOnItemSelectedListener(new OnItemSelectedListener() {
            TextView AutoScore = (TextView) findViewById(R.id.AutoScore);
            TextView BeaconScoreA = (TextView) findViewById(R.id.BeaconScoreA);
            TextView TotalScore = (TextView) findViewById(R.id.TotalScore);


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
                TotalScore.setText(Integer.toString((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        ParkedSpinnerA.setOnItemSelectedListener(new OnItemSelectedListener() {
            TextView AutoScore = (TextView) findViewById(R.id.AutoScore);
            TextView ParkedScoreA  = (TextView) findViewById(R.id.ParkedScoreA);
            TextView TotalScore = (TextView) findViewById(R.id.TotalScore);


            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.d("thing",ParkedSpinnerA .getSelectedItem().toString());

                if (ParkedSpinnerA.getSelectedItem().toString().equals("Half Center")){
                    ParkedScoreIntA = 5;
                    ParkedScoreA.setText("5");
                } else if(ParkedSpinnerA.getSelectedItem().toString().equals("Full Center")){
                    ParkedScoreIntA = 10;
                    ParkedScoreA.setText("10");
                } else if(ParkedSpinnerA.getSelectedItem().toString().equals("Half Corner")){
                    ParkedScoreIntA = 5;
                    ParkedScoreA.setText("5");
                } else if(ParkedSpinnerA.getSelectedItem().toString().equals("Full Corner")){
                    ParkedScoreIntA = 10;
                    ParkedScoreA.setText("10");
                } else if(ParkedSpinnerA.getSelectedItem().toString().equals("Not Parked")){
                    ParkedScoreIntA = 0;
                    ParkedScoreA.setText("0");

                }

//                ParkedScoreA.setText(Integer.toString(ParkedScoreIntA));

//                AutoScoreIntA = 0;
                AutoScoreIntA = ((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA);
                AutoScore.setText(Integer.toString(AutoScoreIntA));
                TotalScore.setText(Integer.toString((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        CenterMinusA.setOnClickListener(new View.OnClickListener(){
            TextView CenterBallCountLabel = (TextView) findViewById(R.id.CenterCountLabelA);
            TextView AutoScore = (TextView) findViewById(R.id.AutoScore);
            TextView CenterScoreA = (TextView) findViewById(R.id.CenterScoreA);
            TextView TotalScore = (TextView) findViewById(R.id.TotalScore);


            public void onClick(View v){
                CenterCountIntA = CenterCountIntA - 1;

                CenterScoreA.setText(Integer.toString(CenterCountIntA*15));
                CenterBallCountLabel.setText(Integer.toString(CenterCountIntA));


                CenterScoreIntA += (CenterCountIntA*15);
                AutoScoreIntA = 0;
                AutoScoreIntA = ((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA);
                AutoScore.setText(Integer.toString(AutoScoreIntA));
                TotalScore.setText(Integer.toString((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA));

            }
        });

        CenterPlusA.setOnClickListener(new View.OnClickListener(){
            TextView CenterBallCountLabel = (TextView) findViewById(R.id.CenterCountLabelA);
            TextView AutoScore = (TextView) findViewById(R.id.AutoScore);
            TextView CenterScoreA = (TextView) findViewById(R.id.CenterScoreA);
            TextView TotalScore = (TextView) findViewById(R.id.TotalScore);


            public void onClick(View v){
                CenterCountIntA = CenterCountIntA + 1;

                CenterScoreA.setText(Integer.toString(CenterCountIntA*15));
                CenterBallCountLabel.setText(Integer.toString(CenterCountIntA));

                System.out.print(CenterScoreIntA);

                CenterScoreIntA = (CenterCountIntA*5);
                AutoScoreIntA = 0;
;               AutoScoreIntA = ((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA);
                AutoScore.setText(Integer.toString(AutoScoreIntA));
                TotalScore.setText(Integer.toString((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA));


            }
        });

        CornerMinusA.setOnClickListener(new View.OnClickListener(){
            TextView CornerBallCountA = (TextView) findViewById(R.id.CornerCountLabelA);
            TextView AutoScore = (TextView) findViewById(R.id.AutoScore);
            TextView CornerScoreA = (TextView) findViewById(R.id.CornerScoreA);
            TextView TotalScore = (TextView) findViewById(R.id.TotalScore);


            public void onClick(View v){
                CornerCountIntA = CornerCountIntA - 1;

                CornerScoreA.setText(Integer.toString(CornerCountIntA*5));
                CornerBallCountA.setText(Integer.toString(CornerCountIntA));

                AutoScoreIntA = 0;
                CornerScoreIntA = (CornerCountIntA*5);
                AutoScoreIntA = ((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA);
                AutoScore.setText(Integer.toString(AutoScoreIntA));
                TotalScore.setText(Integer.toString((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA));

            }
        });

        CornerPlusA.setOnClickListener(new View.OnClickListener(){
            TextView CornerBallCountLabel = (TextView) findViewById(R.id.CornerCountLabelA);
            TextView AutoScore = (TextView) findViewById(R.id.AutoScore);
            TextView CornerScoreA = (TextView) findViewById(R.id.CornerScoreA);
            TextView TotalScore = (TextView) findViewById(R.id.TotalScore);


            public void onClick(View v){

                CornerCountIntA = CornerCountIntA + 1;

                CornerScoreA.setText(Integer.toString(CornerCountIntA*5));
                CornerBallCountLabel.setText(Integer.toString(CornerCountIntA));

                AutoScoreIntA = 0;
                CornerScoreIntA += (CornerCountIntA*5);
                AutoScoreIntA = ((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA);
                AutoScore.setText(Integer.toString(AutoScoreIntA));
                TotalScore.setText(Integer.toString((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA));


            }
        });

        //End of Autonomous Section


        ResetButton.setOnClickListener(new View.OnClickListener(){

            TextView CapBallLabelA = (TextView) findViewById(R.id.CapBallLabelA);

            TextView CornerScoreA = (TextView) findViewById(R.id.CornerScoreA);
            TextView CenterScoreA = (TextView) findViewById(R.id.CenterScoreA);
            TextView CornerCountLabelA = (TextView) findViewById(R.id.CornerCountLabelA);
            TextView CenterCountLabelA = (TextView) findViewById(R.id.CenterCountLabelA);

            TextView AutoScore = (TextView) findViewById(R.id.AutoScore);
            TextView TotalScore = (TextView) findViewById(R.id.TotalScore);

            public void onClick(View v){
                CapBallSpinnerA.setSelection(0);
                BeaconSpinnerA.setSelection(0);
                ParkedSpinnerA.setSelection(0);

                CapballScoreIntA = 0;
<<<<<<< HEAD
=======
                CapballScoreIntE = 0;
                BeaconScoreIntE = 0;
                CornerCountIntD = 0;

                CenterCountIntD = 0;

>>>>>>> parent of df35358... Before Delete of major parts
                CornerCountIntA = 0;

                CenterCountIntA = 0;
                BeaconScoreIntA = 0;
                ParkedScoreIntA = 0;

<<<<<<< HEAD
                CapBallSpinnerA.setSelection(0);
                BeaconSpinnerA.setSelection(0);
                ParkedSpinnerA.setSelection(0);
                ParkedScoreA.setText("0");
                CapBallScoreA.setText("0");
                CapballScoreIntA = 0;

=======
>>>>>>> parent of df35358... Before Delete of major parts


                CornerScoreA.setText(Integer.toString(0));
                CornerCountLabelA.setText(Integer.toString(0));

                CenterScoreA.setText(Integer.toString(0));
                CenterCountLabelA.setText(Integer.toString(0));


<<<<<<< HEAD
=======
                CenterScoreD.setText(Integer.toString(0));
                CenterCountLabelD.setText(Integer.toString(0));

                CornerScoreD.setText(Integer.toString(0));
                CornerCountLabelD.setText(Integer.toString(0));


                DriverScoreIntD = 0;
                DriverScoreIntD = (CornerCountIntD)+(CenterCountIntD*5);
                DriverScore.setText(Integer.toString(DriverScoreIntD));
>>>>>>> parent of df35358... Before Delete of major parts

                AutoScoreIntA = 0;
//                ((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA);
                AutoScore.setText(Integer.toString(0));
<<<<<<< HEAD

                TotalScore.setText(Integer.toString((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA));
=======
                TotalScore.setText(Integer.toString((CapballScoreIntE+BeaconScoreIntE)+(CornerCountIntD)+(CenterCountIntD*5)+((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA)));
>>>>>>> parent of df35358... Before Delete of major parts



            }
        });








    }

}



