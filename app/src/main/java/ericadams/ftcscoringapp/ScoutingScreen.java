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


public class ScoutingScreen extends AppCompatActivity {
    public void StartMenu(View view) {
        Intent GoToMenu = new Intent(this, StartMenu.class);
        startActivity(GoToMenu);

    }

    private Spinner CapBallSpinnerA;
    private ArrayAdapter<CharSequence> CapBallAdapterAA;

    private Spinner BeaconSpinnerA;
    private ArrayAdapter<CharSequence> BeaconAdapterA;

    private Spinner ParkedSpinnerA;
    private ArrayAdapter<CharSequence> ParkedAdapterA;

    private Spinner CapBallSpinnerE;
    private ArrayAdapter<CharSequence> CapBallAdapterE;

    private Spinner BeaconSpinnerE;
    private ArrayAdapter<CharSequence> BeaconAdapterE;

    private Button CenterPlusA;
    private Button CenterMinusA;
    private Button CornerPlusA;
    private Button CornerMinusA;

    private Button CenterPlusD;
    private Button CenterMinusD;
    private Button CornerPlusD;
    private Button CornerMinusD;

    private Button ResetButton;

    private int CenterCountIntD;
    private int CornerCountIntD;

    private int CornerCountIntA;
    private int CenterCountIntA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scouting_screen);


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

                } else {
                    //txtValue.setText(Integer.toString(0));
                }
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
                } else if (BeaconSpinnerA.getSelectedItem().toString().equals("2 Beacons")) {
                } else if (BeaconSpinnerA.getSelectedItem().toString().equals("0 Beacons")) {
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        ParkedSpinnerA.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.d("thing", ParkedSpinnerA.getSelectedItem().toString());

                if (ParkedSpinnerA.getSelectedItem().toString().equals("Half Center")) {
                } else if (ParkedSpinnerA.getSelectedItem().toString().equals("Full Center")) {
                } else if (ParkedSpinnerA.getSelectedItem().toString().equals("Half Corner")) {
                } else if (ParkedSpinnerA.getSelectedItem().toString().equals("Full Corner")) {
                } else if (ParkedSpinnerA.getSelectedItem().toString().equals("Not Parked")) {
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        CenterMinusA.setOnClickListener(new View.OnClickListener() {
            TextView CenterBallCountLabel = (TextView) findViewById(R.id.CenterCountLabelA);

            public void onClick(View v) {
                CenterCountIntA = CenterCountIntA - 1;
                CenterBallCountLabel.setText(Integer.toString(CenterCountIntA));

            }
        });

        CenterPlusA.setOnClickListener(new View.OnClickListener() {
            TextView CenterBallCountLabel = (TextView) findViewById(R.id.CenterCountLabelA);{}

            public void onClick(View v) {
                CenterCountIntA = CenterCountIntA + 1;

                CenterBallCountLabel.setText(Integer.toString(CenterCountIntA));

            }
        });

        CornerMinusA.setOnClickListener(new View.OnClickListener() {
            TextView CornerBallCountA = (TextView) findViewById(R.id.CornerCountLabelA);

            public void onClick(View v) {
                CornerCountIntA = CornerCountIntA - 1;
                CornerBallCountA.setText(Integer.toString(CornerCountIntA));

            }
        });

        CornerPlusA.setOnClickListener(new View.OnClickListener() {
            TextView CornerBallCountLabel = (TextView) findViewById(R.id.CornerCountLabelA);


            public void onClick(View v) {

                CornerCountIntA = CornerCountIntA + 1;
                CornerBallCountLabel.setText(Integer.toString(CornerCountIntA));


            }
        });

        //End of Autonomous Section

        CornerPlusD.setOnClickListener(new View.OnClickListener() {
            TextView CornerCountLabelD = (TextView) findViewById(R.id.CornerCountLabelD);


            public void onClick(View v) {
                CornerCountIntD = CornerCountIntD + 1;

                CornerCountLabelD.setText(Integer.toString(CornerCountIntD));

            }
        });

        CornerMinusD.setOnClickListener(new View.OnClickListener() {
            TextView CornerCountLabelD = (TextView) findViewById(R.id.CornerCountLabelD);

            public void onClick(View v) {
                CornerCountIntD = CornerCountIntD - 1;


                CornerCountLabelD.setText(Integer.toString(CornerCountIntD));

            }
        });

        CenterPlusD.setOnClickListener(new View.OnClickListener() {

            TextView CenterCountLabelD = (TextView) findViewById(R.id.CenterCountLabelD);


            public void onClick(View v) {
                CenterCountIntD = CenterCountIntD + 1;


                CenterCountLabelD.setText(Integer.toString(CenterCountIntD));

            }
        });

        CenterMinusD.setOnClickListener(new View.OnClickListener() {
            TextView CenterCountLabelD = (TextView) findViewById(R.id.CenterCountLabelD);

            public void onClick(View v) {
                CenterCountIntD = CenterCountIntD - 1;


                CenterCountLabelD.setText(Integer.toString(CenterCountIntD));

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
                } else if (CapBallSpinnerE.getSelectedItem().toString().equals("Above 40")) {
                } else if (CapBallSpinnerE.getSelectedItem().toString().equals("Capped Center Goal")) {
                } else if (CapBallSpinnerE.getSelectedItem().toString().equals("On Floor")) {
                }
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


                if (BeaconSpinnerE.getSelectedItem().toString().equals("1 Beacon")) {
                } else if (BeaconSpinnerE.getSelectedItem().toString().equals("2 Beacons")) {
                } else if (BeaconSpinnerE.getSelectedItem().toString().equals("3 Beacons")) {
                } else if (BeaconSpinnerE.getSelectedItem().toString().equals("4 Beacons")) {
                } else if (BeaconSpinnerE.getSelectedItem().toString().equals("0 Beacons")) {
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
