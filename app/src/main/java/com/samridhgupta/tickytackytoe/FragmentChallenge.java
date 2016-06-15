package com.samridhgupta.tickytackytoe;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentChallenge.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentChallenge#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentChallenge extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    Button P1, P2, P3, P4, P5, P6, P7, P8, P9;
    ToggleButton DoneToggle;
    TextView Points_User1, Points_User2;
    TextView TimerText;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public FragmentChallenge() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentChallenge.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentChallenge newInstance(String param1, String param2) {
        FragmentChallenge fragment = new FragmentChallenge();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
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


        P1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                position(v);
            }
        });


        return rootview;

    }

    public void position(View v) {
        switch (v.getId()) {
            case R.id.position1:
                if ()
                    P1.setText("X");
                P1.setText("0");
                P1.setText(" ");
                break;

            case R.id.position2:
            case R.id.position3:
            case R.id.position4:
            case R.id.position5:
            case R.id.position6:
            case R.id.position7:
            case R.id.position8:
            case R.id.position9:


                break;

        }
    }


    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
