package com.example.fragmentdynamicexample;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


public class Fragment1 extends Fragment {
    EditText edtText;
    String msg;
    I i1;
    public View onCreateView(LayoutInflater inflater, ViewGroup vg,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragment1, vg,false);
        edtText = v.findViewById(R.id.edtTxt);

        edtText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void afterTextChanged(Editable s) {
                i1.communicate(edtText.getText().toString());
            }
        });
        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        i1 = (I)context;

    }
    interface I
    {
        void communicate(String msg);
    }

}