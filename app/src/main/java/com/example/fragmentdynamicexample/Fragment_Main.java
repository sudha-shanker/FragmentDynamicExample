package com.example.fragmentdynamicexample;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Fragment_Main extends AppCompatActivity implements Fragment1.I{

    String sendData;
    String senddata2="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        if(savedInstanceState != null) {
            senddata2 = savedInstanceState.getString("K1");
        }// get the display mode
        int displaymode = getResources().getConfiguration().orientation;
        if (displaymode == 1) { // it portrait mode
            Fragment1 f1 = new Fragment1();
            fragmentTransaction.replace(android.R.id.content, f1); }
        else {// its landscape
            Fragment2 f2 = new Fragment2();
            fragmentTransaction.replace(android.R.id.content, f2);
            if(senddata2!=null){}
              f2.displayReceivedData(senddata2); }
        fragmentTransaction.commit();}
    @Override
    public void communicate(String msg) {
        sendData = msg;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("K1",sendData);
    }

}