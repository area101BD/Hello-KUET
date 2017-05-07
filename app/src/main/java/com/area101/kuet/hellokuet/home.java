package com.area101.kuet.hellokuet;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by user on 5/1/2017.
 */

public class home extends Activity {

    Typeface ttf1;
    TextView hellokuet;
    EditText Email;
    EditText Password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        hellokuet = (TextView) findViewById(R.id.hellokuet);
        Email = (EditText) findViewById(R.id.input_email);
        Password = (EditText) findViewById(R.id.input_password);
        login = (Button) findViewById(R.id.btn_login);

        ttf1 = Typeface.createFromAsset(getAssets(),"fonts/trench100free.ttf");
        hellokuet.setTypeface(ttf1);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent ints = new Intent(home.this , MainActivity.class);
               //startActivity(ints);
            }
        });



    }
}
