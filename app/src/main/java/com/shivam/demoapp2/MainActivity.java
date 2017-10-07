package com.shivam.demoapp2;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {



    EditText editText;
    Button button;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=(EditText)findViewById(R.id.edit);
        button=(Button) findViewById(R.id.button1);

        context=this;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s=editText.getText().toString();
                Toast.makeText(context,s, Toast.LENGTH_SHORT).show();

                if (s.length()==10)
                Toast.makeText(context,"VALID", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(context,"INVALID", Toast.LENGTH_SHORT).show();



                editText.setText("Hello");

            }
        });









    }
}
