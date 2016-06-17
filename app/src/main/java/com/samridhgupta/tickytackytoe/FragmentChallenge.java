package com.samridhgupta.tickytackytoe;


import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentChallenge extends Fragment {


    Button P1, P2, P3, P4, P5, P6, P7, P8, P9;
    ToggleButton DoneToggle;
    TextView Points_User1, Points_User2;
    TextView TimerText;
    int p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0, p6 = 0, p7 = 0, p8 = 0, p9 = 0;

    public FragmentChallenge() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_challenge, container, false);
        // Inflate the layout for this fragment
        P1 = (Button) rootview.findViewById(R.id.position1);
        P2 = (Button) rootview.findViewById(R.id.position2);
        P3 = (Button) rootview.findViewById(R.id.position3);
        P4 = (Button) rootview.findViewById(R.id.position4);
        P5 = (Button) rootview.findViewById(R.id.position5);
        P6 = (Button) rootview.findViewById(R.id.position6);
        P7 = (Button) rootview.findViewById(R.id.position7);
        P8 = (Button) rootview.findViewById(R.id.position8);
        P9 = (Button) rootview.findViewById(R.id.position9);

        DoneToggle = (ToggleButton) rootview.findViewById(R.id.toggleDone);

        Points_User1 = (TextView) rootview.findViewById(R.id.points_user1);
        Points_User2 = (TextView) rootview.findViewById(R.id.points_user2);

        TimerText = (TextView) rootview.findViewById(R.id.timertext);

        int p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0, p6 = 0, p7 = 0, p8 = 0, p9 = 0;
        DoneToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (DoneToggle.isChecked()) {
                    sendChallengeString();
                    disable();
                } else {
                    plotChallengeString("Samridh___");
                    enable();
                }
            }
        });

        P1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boxClick(v);
            }
        });
        P2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boxClick(v);
            }
        });
        P3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boxClick(v);
            }
        });
        P4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boxClick(v);
            }
        });
        P5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boxClick(v);
            }
        });
        P6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boxClick(v);
            }
        });
        P7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boxClick(v);
            }
        });
        P8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boxClick(v);
            }
        });
        P9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boxClick(v);
            }
        });


        return rootview;
    }

    public void boxClick(View v) {
        switch (v.getId()) {
            case R.id.position1:
                p1++;
                P1.setText(check(p1));
                break;
            case R.id.position2:
                p2++;
                P2.setText(check(p2));
                break;
            case R.id.position3:
                p3++;
                P3.setText(check(p3));
                break;
            case R.id.position4:
                p4++;
                P4.setText(check(p4));
                break;
            case R.id.position5:
                p5++;
                P5.setText(check(p5));
                break;
            case R.id.position6:
                p6++;
                P6.setText(check(p6));
                break;
            case R.id.position7:
                p7++;
                P7.setText(check(p7));
                break;
            case R.id.position8:
                p8++;
                P8.setText(check(p8));
                break;
            case R.id.position9:
                p9++;
                P9.setText(check(p9));
                break;
        }
    }

    public String check(int p) {
        int x = p % 3;
        String S = " ";
        switch (x) {
            case 0:
                S = "_";
                break;
            case 1:
                S = "X";
                break;
            case 2:
                S = "Y";
                break;
        }
        return S;
    }

    public void timer() {
        new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                TimerText.setText("seconds remaining: " + millisUntilFinished / 1000 + " sec");
                //here you can have your logic to set text to edittext
            }

            public void onFinish() {
                TimerText.setText("seconds remaining: 0 sec");

                DoneToggle.setChecked(true);
            }

        }.start();
    }

    public void enable() {
        P1.setEnabled(true);
        P2.setEnabled(true);
        P3.setEnabled(true);
        P4.setEnabled(true);
        P5.setEnabled(true);
        P6.setEnabled(true);
        P7.setEnabled(true);
        P8.setEnabled(true);
        P9.setEnabled(true);
    }

    public void disable() {
        P1.setEnabled(false);
        P2.setEnabled(false);
        P3.setEnabled(false);
        P4.setEnabled(false);
        P5.setEnabled(false);
        P6.setEnabled(false);
        P7.setEnabled(false);
        P8.setEnabled(false);
        P9.setEnabled(false);
    }

    public void plotChallengeString(String s) {
        //Hits when DataChanged
        //divde the string and plot
        s = s.toUpperCase();

        P1.setText(s.charAt(0) + "");
        P2.setText(s.charAt(1) + "");
        P3.setText(s.charAt(2) + "");
        P4.setText(s.charAt(3) + "");
        P5.setText(s.charAt(4) + "");
        P6.setText(s.charAt(5) + "");
        P7.setText(s.charAt(6) + "");
        P8.setText(s.charAt(7) + "");
        P9.setText(s.charAt(8) + "");
    }

    public String sendChallengeString() {
        //get value of all buttons
        //combine and send
        String s = ((P1.getText().toString()) + "" +
                (P2.getText().toString()) + "" +
                (P3.getText().toString()) + "" +
                (P4.getText().toString()) + "" +
                (P5.getText().toString()) + "" +
                (P6.getText().toString()) + "" +
                (P7.getText().toString()) + "" +
                (P8.getText().toString()) + "" +
                (P9.getText().toString()));
        Toast.makeText(getActivity(), s.toUpperCase(), Toast.LENGTH_LONG).show();
        return s;
    }


}
