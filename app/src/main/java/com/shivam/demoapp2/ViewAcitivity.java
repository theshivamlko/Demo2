package com.shivam.demoapp2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

/**
 * Created by NAVOKI on 10/1/2017.
 */

public class ViewAcitivity extends Activity {


    CheckBox checkBox;
    boolean result;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewactivity1);

        checkBox=(CheckBox)findViewById(R.id.checkBox);
        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
        checkBox.setChecked(false);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                result=b;
                Log.e("MSG","VALUE "+b);

            }
        });



        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if(i==R.id.radioButton)
                    Log.e("MSG","MALE ");
                else if(i==R.id.radioButton2)
                    Log.e("MSG","FEMALE ");


            }
        });

    }
}
