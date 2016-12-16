package ericadams.ftcscoringapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;


public class ScoringScreen extends AppCompatActivity {
    public void StartMenu(View view) {
        Intent GoToMenu = new Intent(this, StartMenu.class);
        startActivity(GoToMenu);

    }
//    SharedPreferences settings = getSharedPreferences(String.valueOf(SavedScore), MODE_PRIVATE);
  //   boolean silent = settings.getBoolean("silentMode", false);


    //public static int SavedScore = 0;

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
    Button CornerPlusA;
    Button CornerMinusA;

    Button CenterPlusD;
    Button CenterMinusD;
    Button CornerPlusD;
    Button CornerMinusD;

    Button ResetButton;
    Button SaveScoreButton;

    Variables Data;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoring_screen);

        Data = new Variables();


        CapBallSpinnerA = (Spinner) findViewById(R.id.CapBallSpinA);//Here --------------------------
        CapBallAdapterAA = ArrayAdapter.createFromResource(this, R.array.CapBallAOptions, android.R.layout.simple_spinner_item);
        CapBallAdapterAA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        CapBallSpinnerA.setAdapter(CapBallAdapterAA);

        BeaconSpinnerA = (Spinner) findViewById(R.id.BeaconSpinnerA);//Here --------------------------
        BeaconAdapterA = ArrayAdapter.createFromResource(this, R.array.BeaconAOptions, android.R.layout.simple_spinner_item);
        BeaconAdapterA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        BeaconSpinnerA.setAdapter(BeaconAdapterA);

        ParkedSpinnerA = (Spinner) findViewById(R.id.ParkedSpinnerA);
        ParkedAdapterA = ArrayAdapter.createFromResource(this, R.array.ParkedOptions, android.R.layout.simple_spinner_item);
        ParkedAdapterA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ParkedSpinnerA.setAdapter(ParkedAdapterA);


        CenterMinusA = (Button) findViewById(R.id.CenterMinusA);
        CenterPlusA = (Button) findViewById(R.id.CenterPlusA);

        CornerMinusA = (Button) findViewById(R.id.CornerMinusA);
        CornerPlusA = (Button) findViewById(R.id.CornerPlusA);


        CenterMinusD = (Button) findViewById(R.id.CenterMinusD);
        CenterPlusD = (Button) findViewById(R.id.CenterPlusD);

        CornerMinusD = (Button) findViewById(R.id.CornerMinusD);
        CornerPlusD = (Button) findViewById(R.id.CornerPlusD);

        ResetButton = (Button) findViewById(R.id.ResetButton);
        //SaveScoreButton = (Button)findViewById(R.id.SaveScoreButton);


        CapBallSpinnerE = (Spinner) findViewById(R.id.CapBallSpinnerE);
        CapBallAdapterE = ArrayAdapter.createFromResource(this, R.array.CapBallEOptions, android.R.layout.simple_spinner_item);
        CapBallAdapterE.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        CapBallSpinnerE.setAdapter(CapBallAdapterE);

        BeaconSpinnerE = (Spinner) findViewById(R.id.BeaconSpinnerE);
        BeaconAdapterE = ArrayAdapter.createFromResource(this, R.array.BeaconOptionsE, android.R.layout.simple_spinner_item);
        BeaconAdapterE.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        BeaconSpinnerE.setAdapter(BeaconAdapterE);


        CapBallSpinnerA.setOnItemSelectedListener(new OnItemSelectedListener() {
            TextView AutoScore = (TextView) findViewById(R.id.AutoScore);
            TextView CapBallScoreA = (TextView) findViewById(R.id.CapBallScoreA);
            TextView TotalScore = (TextView) findViewById(R.id.TotalScore);


            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.d("thing", CapBallSpinnerA.getSelectedItem().toString());

                if (CapBallSpinnerA.getSelectedItem().toString().equals("On Floor")) {
                    CapBallScoreA.setText("5");
                    Data.setCapballScoreIntA(5);
                } else {
                    CapBallScoreA.setText("0");
                    Data.setCapballScoreIntA(0);
                    //txtValue.setText(Integer.toString(0));
                }

                /*AutoScoreIntA = 0;
                AutoScoreIntA = (CornerScoreIntA+CenterScoreIntA+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA);
                AutoScore.setText(Integer.toString(AutoScoreIntA));
                TotalScore.setText(Integer.toString((CapballScoreIntE+BeaconScoreIntE)+(CornerCountIntD)+(CenterCountIntD*5)+((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA)));
*/
                AutoScore.setText(Integer.toString(Data.getAutoScoreIntA()));
                TotalScore.setText(Integer.toString(Data.getTotalScoreInt()));

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
                Log.d("thing", BeaconSpinnerA.getSelectedItem().toString());

                if (BeaconSpinnerA.getSelectedItem().toString().equals("1 Beacon")) {
                    Data.setBeaconScoreIntA(30);
                } else if (BeaconSpinnerA.getSelectedItem().toString().equals("2 Beacons")) {
                    Data.setBeaconScoreIntA(60);
                } else if (BeaconSpinnerA.getSelectedItem().toString().equals("0 Beacons")) {
                    Data.setBeaconScoreIntA(0);
                }
                // BeaconScoreA.setText(Integer.toString(BeaconScore));
                BeaconScoreA.setText(Integer.toString(Data.getBeaconScoreIntA()));
                Data.getAutoScoreIntA();
                AutoScore.setText(Integer.toString(Data.getAutoScoreIntA()));
                TotalScore.setText(Integer.toString(Data.getTotalScoreInt()));


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        ParkedSpinnerA.setOnItemSelectedListener(new OnItemSelectedListener() {
            TextView AutoScore = (TextView) findViewById(R.id.AutoScore);
            TextView ParkedScoreA = (TextView) findViewById(R.id.ParkedScoreA);
            TextView TotalScore = (TextView) findViewById(R.id.TotalScore);


            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.d("thing", ParkedSpinnerA.getSelectedItem().toString());

                if (ParkedSpinnerA.getSelectedItem().toString().equals("Half Center")) {
                    Data.setParkedScoreIntA(5);
                    ParkedScoreA.setText("5");
                } else if (ParkedSpinnerA.getSelectedItem().toString().equals("Full Center")) {
                    Data.setParkedScoreIntA(10);
                    ParkedScoreA.setText("10");
                } else if (ParkedSpinnerA.getSelectedItem().toString().equals("Half Corner")) {
                    Data.setParkedScoreIntA(5);
                    ParkedScoreA.setText("5");
                } else if (ParkedSpinnerA.getSelectedItem().toString().equals("Full Corner")) {
                    Data.setParkedScoreIntA(10);
                    ParkedScoreA.setText("10");
                } else if (ParkedSpinnerA.getSelectedItem().toString().equals("Not Parked")) {
                    Data.setParkedScoreIntA(0);
                    ParkedScoreA.setText("0");

                }

//                ParkedScoreA.setText(Integer.toString(ParkedScoreIntA));

                AutoScore.setText(Integer.toString(Data.getAutoScoreIntA()));
                TotalScore.setText(Integer.toString(Data.getTotalScoreInt()));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        CenterMinusA.setOnClickListener(new View.OnClickListener() {
            TextView CenterBallCountLabel = (TextView) findViewById(R.id.CenterCountLabelA);
            TextView AutoScore = (TextView) findViewById(R.id.AutoScore);
            TextView CenterScoreA = (TextView) findViewById(R.id.CenterScoreA);
            TextView TotalScore = (TextView) findViewById(R.id.TotalScore);


            public void onClick(View v) {
                Data.decrementCenterCountIntA();
                CenterScoreA.setText(Integer.toString(Data.getCenterCountIntA() * 15));
                CenterBallCountLabel.setText(Integer.toString(Data.getCenterCountIntA()));
                int TempCenterScore = Data.getCenterScoreIntA();
                TempCenterScore +=(Data.getCenterCountIntA() * 15);
                Data.setCenterCountIntA(TempCenterScore);
                Data.getAutoScoreIntA();
                AutoScore.setText(Integer.toString(Data.getAutoScoreIntA()));
                TotalScore.setText(Integer.toString(Data.getTotalScoreInt()));


            }
        });

        CenterPlusA.setOnClickListener(new View.OnClickListener() {
            TextView CenterBallCountLabel = (TextView) findViewById(R.id.CenterCountLabelA);
            TextView AutoScore = (TextView) findViewById(R.id.AutoScore);
            TextView CenterScoreA = (TextView) findViewById(R.id.CenterScoreA);
            TextView TotalScore = (TextView) findViewById(R.id.TotalScore);


            public void onClick(View v) {
                Data.incrementCenterCountIntA();
                CenterScoreA.setText(Integer.toString(Data.getCenterCountIntA() * 15));
                CenterBallCountLabel.setText(Integer.toString(Data.getCenterCountIntA()));

                int TempCenterScore = Data.getCenterScoreIntA();
                TempCenterScore = (Data.getCenterCountIntA() * 5);
               // AutoScoreIntA = 0;

                Data.getAutoScoreIntA();
                AutoScore.setText(Integer.toString(Data.getAutoScoreIntA()));
                TotalScore.setText(Integer.toString(Data.getTotalScoreInt()));


            }
        });

        CornerMinusA.setOnClickListener(new View.OnClickListener() {
            TextView CornerBallCountA = (TextView) findViewById(R.id.CornerCountLabelA);
            TextView AutoScore = (TextView) findViewById(R.id.AutoScore);
            TextView CornerScoreA = (TextView) findViewById(R.id.CornerScoreA);
            TextView TotalScore = (TextView) findViewById(R.id.TotalScore);


            public void onClick(View v) {
                Data.decrementCornerCountIntA();
                CornerScoreA.setText(Integer.toString(Data.getCornerCountIntA() * 5));
                CornerBallCountA.setText(Integer.toString(Data.getCornerCountIntA()));
                int TempCornerScore = Data.getCornerScoreIntA();
                TempCornerScore = (Data.getCornerCountIntA() * 5);
                Data.getAutoScoreIntA();
                AutoScore.setText(Integer.toString(Data.getAutoScoreIntA()));
                TotalScore.setText(Integer.toString(Data.getTotalScoreInt()));

            }
        });

        CornerPlusA.setOnClickListener(new View.OnClickListener() {
            TextView CornerBallCountLabel = (TextView) findViewById(R.id.CornerCountLabelA);
            TextView AutoScore = (TextView) findViewById(R.id.AutoScore);
            TextView CornerScoreA = (TextView) findViewById(R.id.CornerScoreA);
            TextView TotalScore = (TextView) findViewById(R.id.TotalScore);


            public void onClick(View v) {
                Data.incrementCornerCountIntA();
                CornerScoreA.setText(Integer.toString(Data.getCornerCountIntA() * 5));
                CornerBallCountLabel.setText(Integer.toString(Data.getCornerCountIntA()));

                int TempCornerScore = Data.getCornerScoreIntA();
                TempCornerScore += (Data.getCornerCountIntA() * 5);
                Data.setCornerScoreIntD(TempCornerScore);
                Data.getAutoScoreIntA();
                AutoScore.setText(Integer.toString(Data.getAutoScoreIntA()));
                TotalScore.setText(Integer.toString(Data.getTotalScoreInt()));


            }
        });

        //End of Autonomous Section

        CornerPlusD.setOnClickListener(new View.OnClickListener() {
            TextView DriverScore = (TextView) findViewById(R.id.DriverScore);
            TextView CornerCountLabelD = (TextView) findViewById(R.id.CornerCountLabelD);
            TextView CornerScoreD = (TextView) findViewById(R.id.CornerScoreD);
            TextView TotalScore = (TextView) findViewById(R.id.TotalScore);


            public void onClick(View v) {
                Data.incrementCornerCountIntD();
                CornerScoreD.setText(Integer.toString(Data.getCornerCountIntD()));
                CornerCountLabelD.setText(Integer.toString(Data.getCornerCountIntD()));
                int TempCornerCountIntD = Data.getCornerCountIntD();
                TempCornerCountIntD = (Data.getCornerCountIntD()) + (Data.getCenterCountIntD() * 5);
                Data.setCornerCountIntD(TempCornerCountIntD);
<<<<<<< HEAD

<<<<<<< HEAD
                Data.setDriverScoreIntD(Data.getCornerScoreIntD() + Data.getCenterScoreIntD());
=======
>>>>>>> parent of 32a213e... Classes Working correctly
=======
>>>>>>> parent of b85700e... WOrking a little with G and JSON
                DriverScore.setText(Integer.toString(Data.getDriverScoreIntD()));
                TotalScore.setText(Integer.toString(Data.getTotalScoreInt()));

            }
        });

        CornerMinusD.setOnClickListener(new View.OnClickListener() {
            TextView DriverScore = (TextView) findViewById(R.id.DriverScore);
            TextView CornerCountLabelD = (TextView) findViewById(R.id.CornerCountLabelD);
            TextView CornerScoreD = (TextView) findViewById(R.id.CornerScoreD);
            TextView TotalScore = (TextView) findViewById(R.id.TotalScore);


            public void onClick(View v) {
                Data.decrementCornerCountIntD();
                CornerScoreD.setText(Integer.toString(Data.getCornerCountIntD()));
                CornerCountLabelD.setText(Integer.toString(Data.getCornerCountIntD()));
                int TempCornerScoreInt = Data.getCornerScoreIntD();
                TempCornerScoreInt = (Data.getCornerCountIntD()) + (Data.getCenterCountIntD() * 5);
                Data.setCornerScoreIntD(TempCornerScoreInt);
<<<<<<< HEAD

<<<<<<< HEAD
                Data.setDriverScoreIntD(Data.getCornerScoreIntD() + Data.getCenterScoreIntD());
=======
>>>>>>> parent of 32a213e... Classes Working correctly
=======
>>>>>>> parent of b85700e... WOrking a little with G and JSON
                DriverScore.setText(Integer.toString(Data.getDriverScoreIntD()));
                TotalScore.setText(Integer.toString(Data.getTotalScoreInt()));

            }
        });

        CenterPlusD.setOnClickListener(new View.OnClickListener() {
            TextView DriverScore = (TextView) findViewById(R.id.DriverScore);
            TextView CenterCountLabelD = (TextView) findViewById(R.id.CenterCountLabelD);
            TextView CenterScoreD = (TextView) findViewById(R.id.CenterScoreD);
            TextView TotalScore = (TextView) findViewById(R.id.TotalScore);


            public void onClick(View v) {
                Data.incrementCornerCountIntD();
                CenterScoreD.setText(Integer.toString(Data.getCenterCountIntD() * 5));
                CenterCountLabelD.setText(Integer.toString(Data.getCenterCountIntD()));
<<<<<<< HEAD

                int TempCenterScoreInt = Data.getCenterScoreIntD();
                TempCenterScoreInt = ( (Data.getCenterCountIntD() * 5));
                Data.setCenterScoreIntD(TempCenterScoreInt);
<<<<<<< HEAD

                Data.setDriverScoreIntD(Data.getCornerScoreIntD() + Data.getCenterScoreIntD());
=======
                int TempCornerScoreInt = Data.getCornerScoreIntD();
                TempCornerScoreInt = (Data.getCornerCountIntD()) + (Data.getCenterCountIntD() * 5);
                Data.setCornerScoreIntD(TempCornerScoreInt);
>>>>>>> parent of 32a213e... Classes Working correctly
=======
>>>>>>> parent of b85700e... WOrking a little with G and JSON
                DriverScore.setText(Integer.toString(Data.getDriverScoreIntD()));
                TotalScore.setText(Integer.toString(Data.getTotalScoreInt()));


            }
        });

        CenterMinusD.setOnClickListener(new View.OnClickListener() {
            TextView DriverScore = (TextView) findViewById(R.id.DriverScore);
            TextView CenterCountLabelD = (TextView) findViewById(R.id.CenterCountLabelD);
            TextView CenterScoreD = (TextView) findViewById(R.id.CenterScoreD);
            TextView TotalScore = (TextView) findViewById(R.id.TotalScore);

            public void onClick(View v) {
                Data.decrementCenterCountIntD();
                CenterScoreD.setText(Integer.toString(Data.getCenterCountIntD() * 5));
                CenterCountLabelD.setText(Integer.toString(Data.getCenterCountIntD()));
                int TempCenterScoreInt = Data.getCenterScoreIntD();
                TempCenterScoreInt = (Data.getCornerCountIntD()) + (Data.getCenterCountIntD() * 5);
<<<<<<< HEAD
                Data.setCenterScoreIntD(TempCenterScoreInt);
<<<<<<< HEAD

                Data.setDriverScoreIntD(Data.getCornerScoreIntD() + Data.getCenterScoreIntD());
=======
                Data.setCornerScoreIntD(TempCenterScoreInt);
//                DriverScoreIntD = (CornerCountIntD) + (CenterCountIntD * 5);
>>>>>>> parent of 32a213e... Classes Working correctly
=======
>>>>>>> parent of b85700e... WOrking a little with G and JSON
                DriverScore.setText(Integer.toString(Data.getDriverScoreIntD()));
                TotalScore.setText(Integer.toString(Data.getTotalScoreInt()));


            }
        });

        //End of Driver Control Section.  Note that Endgame is still in Driver Control

        CapBallSpinnerE.setOnItemSelectedListener(new OnItemSelectedListener() {
            TextView CapBallScoreE = (TextView) findViewById(R.id.CapBallScoreE);
            TextView EndScore = (TextView) findViewById(R.id.EndScore);
            TextView TotalScore = (TextView) findViewById(R.id.TotalScore);


            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.d("thing", CapBallSpinnerE.getSelectedItem().toString());
                if (CapBallSpinnerE.getSelectedItem().toString().equals("Off Playing Field")) {
                    CapBallScoreE.setText("10");
                    Data.setCapballScoreIntE(10);
                } else if (CapBallSpinnerE.getSelectedItem().toString().equals("Above 40")) {
                    CapBallScoreE.setText("20");
                    Data.setCapballScoreIntE(20);
                } else if (CapBallSpinnerE.getSelectedItem().toString().equals("Capped Center Goal")) {
                    CapBallScoreE.setText("40");
                    Data.setCapballScoreIntE(40);
                } else if (CapBallSpinnerE.getSelectedItem().toString().equals("On Floor")) {
                    CapBallScoreE.setText("0");
                    Data.setCapballScoreIntE(0);
                }
                int TempEndScore = Data.getEndScoreIntE();
                TempEndScore = (Data.getCapballScoreIntE() + Data.getBeaconScoreIntA());
                Data.setEndScoreIntE(TempEndScore);
                EndScore.setText(Integer.toString(Data.getEndScoreIntE()));
                TotalScore.setText(Integer.toString(Data.getTotalScoreInt()));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        BeaconSpinnerE.setOnItemSelectedListener(new OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.d("thing", BeaconSpinnerE.getSelectedItem().toString());
                TextView BeaconScoreE = (TextView) findViewById(R.id.BeaconScoreE);
                TextView EndScore = (TextView) findViewById(R.id.EndScore);
                TextView TotalScore = (TextView) findViewById(R.id.TotalScore);


                if (BeaconSpinnerE.getSelectedItem().toString().equals("1 Beacon")) {
                    BeaconScoreE.setText("15");
                    Data.setBeaconScoreIntE(15);
                } else if (BeaconSpinnerE.getSelectedItem().toString().equals("2 Beacons")) {
                    BeaconScoreE.setText("30");
                    Data.setBeaconScoreIntE(30);
                } else if (BeaconSpinnerE.getSelectedItem().toString().equals("3 Beacons")) {
                    BeaconScoreE.setText("45");
                    Data.setBeaconScoreIntE(45);
                } else if (BeaconSpinnerE.getSelectedItem().toString().equals("4 Beacons")) {
                    BeaconScoreE.setText("60");
                    Data.setBeaconScoreIntE(60);
                } else if (BeaconSpinnerE.getSelectedItem().toString().equals("0 Beacons")) {
                    BeaconScoreE.setText("0");
                    Data.setBeaconScoreIntE(0);
                }
                int TempEndScore = Data.getEndScoreIntE();
                TempEndScore = (Data.getCapballScoreIntE() + Data.getBeaconScoreIntE());
                Data.setEndScoreIntE(TempEndScore);
                EndScore.setText(Integer.toString(Data.getEndScoreIntE()));
                TotalScore.setText(Integer.toString(Data.getTotalScoreInt()));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        // End of End Game

        ResetButton.setOnClickListener(new View.OnClickListener() {

            TextView CapBallLabelA = (TextView) findViewById(R.id.CapBallLabelA);

            TextView CornerScoreA = (TextView) findViewById(R.id.CornerScoreA);
            TextView CenterScoreA = (TextView) findViewById(R.id.CenterScoreA);
            TextView CornerCountLabelA = (TextView) findViewById(R.id.CornerCountLabelA);
            TextView CenterCountLabelA = (TextView) findViewById(R.id.CenterCountLabelA);

            TextView CenterScoreD = (TextView) findViewById(R.id.CenterScoreD);
            TextView CornerScoreD = (TextView) findViewById(R.id.CornerScoreD);
            TextView CornerCountLabelD = (TextView) findViewById(R.id.CornerCountLabelD);
            TextView CenterCountLabelD = (TextView) findViewById(R.id.CenterCountLabelD);

            TextView AutoScore = (TextView) findViewById(R.id.AutoScore);
            TextView DriverScore = (TextView) findViewById(R.id.DriverScore);
            TextView EndScore = (TextView) findViewById(R.id.EndScore);
            TextView TotalScore = (TextView) findViewById(R.id.TotalScore);

            public void onClick(View v) {
                Data.Reset();
                CapBallSpinnerA.setSelection(0);
                BeaconSpinnerA.setSelection(0);
                ParkedSpinnerA.setSelection(0);
                BeaconSpinnerE.setSelection(0);
                CapBallSpinnerE.setSelection(0);




                CornerScoreA.setText(Integer.toString(0));
                CornerCountLabelA.setText(Integer.toString(0));

                CenterScoreA.setText(Integer.toString(0));
                CenterCountLabelA.setText(Integer.toString(0));


                CenterScoreD.setText(Integer.toString(0));
                CenterCountLabelD.setText(Integer.toString(0));

                CornerScoreD.setText(Integer.toString(0));
                CornerCountLabelD.setText(Integer.toString(0));


                DriverScore.setText(Integer.toString(Data.getDriverScoreIntD()));
                AutoScore.setText(Integer.toString(0));
                TotalScore.setText(Integer.toString(Data.getTotalScoreInt()));
            }
        });
/*
        SaveScoreButton.setOnClickListener(new View.OnClickListener(){


            public void onClick(View v){
                TotalScoreInt = (CapballScoreIntE+BeaconScoreIntE)+(CornerCountIntD)+(CenterCountIntD*5)+((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA);

                SharedPreferences.Editor mEditor = SavedScore.edit();
                mEditor.putInt("Total Score", TotalScoreInt).commit();

            }
        });
*/


    }
       /* public void onPause(){

    }*/
    /*@Override
    protected void onStop() {

        super.onStop();
        SavedScore = TotalScoreInt;
        SharedPreferences settings = getSharedPreferences(String.valueOf(SavedScore), MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt("silentMode", SavedScore);

        // Commit the edits!
        editor.commit();
    }*/
}


