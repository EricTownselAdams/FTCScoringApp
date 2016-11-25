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
    Button CornerPlusA;
    Button CornerMinusA;

    Button CenterPlusD;
    Button CenterMinusD;
    Button CornerPlusD;
    Button CornerMinusD;

    Button ResetButton;

    int CenterCountIntD = 0;
    int CornerCountIntD = 0;

    int CornerCountIntA = 0;
    int CenterCountIntA = 0;
    int AutoScoreIntA = 0;
    int BeaconScoreIntA = 0;
    int ParkedScoreIntA = 0;
    int CornerScoreIntA = 0;
    int CenterScoreIntA = 0;
    int CapballScoreIntA = 0;

    int DriverScoreIntD = 0;
    int CenterScoreIntD = 0;
    int CornerScoreIntD = 0;

    int EndScoreIntE = 0;
    int CapballScoreIntE = 0;
    int BeaconScoreIntE = 0;


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



        CenterMinusD = (Button)findViewById(R.id.CenterMinusD);
        CenterPlusD = (Button)findViewById(R.id.CenterPlusD);

        CornerMinusD = (Button)findViewById(R.id.CornerMinusD);
        CornerPlusD = (Button)findViewById(R.id.CornerPlusD);

        ResetButton = (Button)findViewById(R.id.ResetButton);



        CapBallSpinnerE = (Spinner)findViewById(R.id.CapBallSpinnerE);
        CapBallAdapterE = ArrayAdapter.createFromResource(this,R.array.CapBallEOptions,android.R.layout.simple_spinner_item);
        CapBallAdapterE.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        CapBallSpinnerE.setAdapter(CapBallAdapterE);

        BeaconSpinnerE = (Spinner)findViewById(R.id.BeaconSpinnerE);
        BeaconAdapterE = ArrayAdapter.createFromResource(this,R.array.BeaconOptionsE,android.R.layout.simple_spinner_item);
        BeaconAdapterE.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        BeaconSpinnerE.setAdapter(BeaconAdapterE);


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
                } else if (CapBallSpinnerA.getSelectedItem().toString().equals("On Center Goal")){
                    CapBallScoreA.setText("0");
                    CapballScoreIntA = 0;
                    //txtValue.setText(Integer.toString(0));
                }

                AutoScoreIntA = 0;
                AutoScoreIntA = (CornerScoreIntA+CenterScoreIntA+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA);
                AutoScore.setText(Integer.toString(AutoScoreIntA));
                TotalScore.setText(Integer.toString((CapballScoreIntE+BeaconScoreIntE)+(CornerCountIntD)+(CenterCountIntD*5)+((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA)));

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
                } else {
                    //if(BeaconSpinnerA.getSelectedItem().toString().equals("0 Beacons"))
                    BeaconScoreIntA = 0;
                }
               // BeaconScoreA.setText(Integer.toString(BeaconScore));
                AutoScoreIntA = 0;
                AutoScoreIntA = (CornerScoreIntA+CenterScoreIntA+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA);
                BeaconScoreA.setText(Integer.toString(BeaconScoreIntA));
                AutoScore.setText(Integer.toString(AutoScoreIntA));
                TotalScore.setText(Integer.toString((CapballScoreIntE+BeaconScoreIntE)+(CornerCountIntD)+(CenterCountIntD*5)+((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA)));

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
                } else {
                    //if(ParkedSpinnerA.getSelectedItem().toString().equals("Not Parked"))
                    ParkedScoreIntA = 0;
                    ParkedScoreA.setText("0");

                }

                //ParkedScoreA.setText(Integer.toString(ParkedScoreIntA));

                //AutoScoreIntA = 0;
                AutoScoreIntA = ((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA);
                AutoScore.setText(Integer.toString(AutoScoreIntA));
                TotalScore.setText(Integer.toString((CapballScoreIntE+BeaconScoreIntE)+(CornerCountIntD)+(CenterCountIntD*5)+((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA)));

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
                TotalScore.setText(Integer.toString((CapballScoreIntE+BeaconScoreIntE)+(CornerCountIntD)+(CenterCountIntD*5)+((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA)));

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
                TotalScore.setText(Integer.toString((CapballScoreIntE+BeaconScoreIntE)+(CornerCountIntD)+(CenterCountIntD*5)+((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA)));


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
                TotalScore.setText(Integer.toString((CapballScoreIntE+BeaconScoreIntE)+(CornerCountIntD)+(CenterCountIntD*5)+((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA)));

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
                TotalScore.setText(Integer.toString((CapballScoreIntE+BeaconScoreIntE)+(CornerCountIntD)+(CenterCountIntD*5)+((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA)));


            }
        });

        //End of Autonomous Section

        CornerPlusD.setOnClickListener(new View.OnClickListener(){
            TextView DriverScore = (TextView) findViewById(R.id.DriverScore);
            TextView CornerCountLabelD = (TextView) findViewById(R.id.CornerCountLabelD);
            TextView CornerScoreD = (TextView) findViewById(R.id.CornerScoreD);
            TextView TotalScore = (TextView) findViewById(R.id.TotalScore);



            public void onClick(View v){
                CornerCountIntD = CornerCountIntD + 1;

                CornerScoreD.setText(Integer.toString(CornerCountIntD));
                CornerCountLabelD.setText(Integer.toString(CornerCountIntD));

                DriverScoreIntD = 0;
                DriverScoreIntD = (CornerCountIntD)+(CenterCountIntD*5);
                DriverScore.setText(Integer.toString(DriverScoreIntD));
                TotalScore.setText(Integer.toString((CapballScoreIntE+BeaconScoreIntE)+(CornerCountIntD)+(CenterCountIntD*5)+((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA)));

            }
        });

        CornerMinusD.setOnClickListener(new View.OnClickListener(){
            TextView DriverScore = (TextView) findViewById(R.id.DriverScore);
            TextView CornerCountLabelD = (TextView) findViewById(R.id.CornerCountLabelD);
            TextView CornerScoreD = (TextView) findViewById(R.id.CornerScoreD);
            TextView TotalScore = (TextView) findViewById(R.id.TotalScore);



            public void onClick(View v){
                CornerCountIntD = CornerCountIntD - 1;

                CornerScoreD.setText(Integer.toString(CornerCountIntD));
                CornerCountLabelD.setText(Integer.toString(CornerCountIntD));

                DriverScoreIntD = 0;
                DriverScoreIntD = (CornerCountIntD)+(CenterCountIntD*5);
                DriverScore.setText(Integer.toString(DriverScoreIntD));
                TotalScore.setText(Integer.toString((CapballScoreIntE+BeaconScoreIntE)+(CornerCountIntD)+(CenterCountIntD*5)+((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA)));


            }
        });

        CenterPlusD.setOnClickListener(new View.OnClickListener(){
            TextView DriverScore = (TextView) findViewById(R.id.DriverScore);
            TextView CenterCountLabelD = (TextView) findViewById(R.id.CenterCountLabelD);
            TextView CenterScoreD = (TextView) findViewById(R.id.CenterScoreD);
            TextView TotalScore = (TextView) findViewById(R.id.TotalScore);



            public void onClick(View v){
                CenterCountIntD = CenterCountIntD + 1;

                CenterScoreD.setText(Integer.toString(CenterCountIntD*5));
                CenterCountLabelD.setText(Integer.toString(CenterCountIntD));

                DriverScoreIntD = 0;
                DriverScoreIntD = (CornerCountIntD)+(CenterCountIntD*5);
                DriverScore.setText(Integer.toString(DriverScoreIntD));
                TotalScore.setText(Integer.toString((CapballScoreIntE+BeaconScoreIntE)+(CornerCountIntD)+(CenterCountIntD*5)+((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA)));


            }
        });

        CenterMinusD.setOnClickListener(new View.OnClickListener(){
            TextView DriverScore = (TextView) findViewById(R.id.DriverScore);
            TextView CenterCountLabelD = (TextView) findViewById(R.id.CenterCountLabelD);
            TextView CenterScoreD = (TextView) findViewById(R.id.CenterScoreD);
            TextView TotalScore = (TextView) findViewById(R.id.TotalScore);

            public void onClick(View v){
                CenterCountIntD = CenterCountIntD - 1;

                CenterScoreD.setText(Integer.toString(CenterCountIntD*5));
                CenterCountLabelD.setText(Integer.toString(CenterCountIntD));

                DriverScoreIntD = 0;
                DriverScoreIntD = (CornerCountIntD)+(CenterCountIntD*5);
                DriverScore.setText(Integer.toString(DriverScoreIntD));
                TotalScore.setText(Integer.toString((CapballScoreIntE+BeaconScoreIntE)+(CornerCountIntD)+(CenterCountIntD*5)+((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA)));


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
                    CapballScoreIntE = 10;
                } else if (CapBallSpinnerE.getSelectedItem().toString().equals("Above 40")){
                    CapBallScoreE.setText("20");
                    CapballScoreIntE = 20;
                }else if (CapBallSpinnerE.getSelectedItem().toString().equals("Capped Center Goal")){
                    CapBallScoreE.setText("40");
                    CapballScoreIntE = 40;
                }else if (CapBallSpinnerE.getSelectedItem().toString().equals("On Floor")){
                    CapBallScoreE.setText("0");
                    CapballScoreIntE = 0;
                }
                EndScoreIntE = (CapballScoreIntE+BeaconScoreIntE);
                EndScore.setText(Integer.toString(EndScoreIntE));
                TotalScore.setText(Integer.toString((CapballScoreIntE+BeaconScoreIntE)+(CornerCountIntD)+(CenterCountIntD*5)+((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA)));

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
                    BeaconScoreIntE = 15;
                } else if (BeaconSpinnerE.getSelectedItem().toString().equals("2 Beacons")){
                    BeaconScoreE.setText("30");
                    BeaconScoreIntE = 30;
                }else if (BeaconSpinnerE.getSelectedItem().toString().equals("3 Beacons")){
                    BeaconScoreE.setText("45");
                    BeaconScoreIntE = 45;
                }else if (BeaconSpinnerE.getSelectedItem().toString().equals("4 Beacons")){
                    BeaconScoreE.setText("60");
                    BeaconScoreIntE = 60;
                }else if (BeaconSpinnerE.getSelectedItem().toString().equals("0 Beacons")){
                    BeaconScoreE.setText("0");
                    BeaconScoreIntE = 0;
                }
                EndScoreIntE = (CapballScoreIntE+BeaconScoreIntE);
                EndScore.setText(Integer.toString(EndScoreIntE));
                TotalScore.setText(Integer.toString((CapballScoreIntE+BeaconScoreIntE)+(CornerCountIntD)+(CenterCountIntD*5)+((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA)));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        // End of End Game

        ResetButton.setOnClickListener(new View.OnClickListener(){

            TextView CapBallLabelA = (TextView) findViewById(R.id.CapBallLabelA);
            TextView CapBallScoreA = (TextView) findViewById(R.id.CapBallScoreA);
            TextView BeaconScoreA = (TextView) findViewById(R.id.BeaconScoreA);
            TextView ParkedScoreA = (TextView) findViewById(R.id.ParkedScoreA);

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

            public void onClick(View v){
                CapBallSpinnerA.setSelection(0);
                BeaconSpinnerA.setSelection(0);
                ParkedSpinnerA.setSelection(0);
                BeaconSpinnerE.setSelection(0);
                CapBallSpinnerE.setSelection(0);

                CapballScoreIntA = 0;
                CapballScoreIntE = 0;
                BeaconScoreIntE = 0;
                CornerCountIntD = 0;
                CenterCountIntD = 0;
                CornerCountIntA = 0;
                CenterCountIntA = 0;
                BeaconScoreIntA = 0;
                ParkedScoreIntA = 0;

                CapBallSpinnerA.setSelection(0);
                BeaconSpinnerA.setSelection(0);
                ParkedSpinnerA.setSelection(0);
                BeaconSpinnerE.setSelection(0);
                CapBallSpinnerE.setSelection(0);

                ParkedScoreA.setText("0");
                CapBallScoreA.setText("0");
                CapballScoreIntA = 0;



                BeaconScoreA.setText(Integer.toString(0));

                CornerScoreA.setText(Integer.toString(0));
                CornerCountLabelA.setText(Integer.toString(0));

                CenterScoreA.setText(Integer.toString(0));
                CenterCountLabelA.setText(Integer.toString(0));


                CenterScoreD.setText(Integer.toString(0));
                CenterCountLabelD.setText(Integer.toString(0));

                CornerScoreD.setText(Integer.toString(0));
                CornerCountLabelD.setText(Integer.toString(0));

                DriverScoreIntD = 0;
                DriverScoreIntD = (CornerCountIntD)+(CenterCountIntD*5);
                DriverScore.setText(Integer.toString(DriverScoreIntD));

                AutoScoreIntA = 0;
                AutoScoreIntA = ((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA);
                AutoScore.setText(Integer.toString(0));

                TotalScore.setText(Integer.toString((CapballScoreIntE+BeaconScoreIntE)+(CornerCountIntD)+(CenterCountIntD*5)+((CornerCountIntA*5)+(CenterCountIntA*15)+BeaconScoreIntA+ParkedScoreIntA+CapballScoreIntA)));


               /* System.out.print(CapballScoreIntA);
                System.out.print(CapballScoreIntE);

                System.out.print(BeaconScoreIntE);
                System.out.print(CornerCountIntD);

                System.out.print(CenterCountIntD);

                System.out.print(CornerCountIntA);

                System.out.print(CenterCountIntA);

                System.out.print(BeaconScoreIntA);

                System.out.print(ParkedScoreIntA);

                */


            }
        });








    }

}



