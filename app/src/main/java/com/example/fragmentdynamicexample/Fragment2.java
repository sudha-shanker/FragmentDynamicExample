package com.example.fragmentdynamicexample;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment2 extends Fragment {
   TextView txtData;
   String msg;
    public View onCreateView(LayoutInflater inflater, ViewGroup vg,
                             Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_fragment2, vg, false);

        txtData = v.findViewById(R.id.textView);
        txtData.setText(msg);
        return  v;
    }
  public void displayReceivedData(String message)
    {

        msg= message;
    }
}