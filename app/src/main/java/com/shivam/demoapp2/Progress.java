package com.shivam.demoapp2;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.Switch;

/**
 * Created by NAVOKI on 10/7/2017.
 */

public class Progress  extends Activity{


    @Override
    public void onCreate(Bundle savedInstanceStatee) {
        super.onCreate(savedInstanceStatee);

        setContentView(R.layout.progress);

        final ProgressBar progressBar=(ProgressBar)findViewById(R.id.progressBar);
        final ProgressBar progressBa2r=(ProgressBar)findViewById(R.id.progressBar2);
        final SeekBar seekBar=(SeekBar) findViewById(R.id.seekBar);
        final Switch aSwitch=(Switch) findViewById(R.id.switch1);
        final ImageView imageView=(ImageView) findViewById(R.id.img);

        imageView.setImageResource(R.drawable.ic_launcher_background);

        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                progressBar.setVisibility(View.GONE);


            }
        },5000);

   Handler handler2=new Handler();


        for (int i=1;i<=100;i++)
        {
            final int j=i;
            handler2.postDelayed(new Runnable() {
                @Override
                public void run() {
                    progressBa2r.setProgress(j);


                }
            },1000);
        }

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Log.e("MSG","PROGRESS "+i);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Log.e("MSG","START");

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.e("MSG","STOP");

            }
        });

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Log.e("MSG",""+b);

            }
        });


    }
}
