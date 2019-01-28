package com.home.currency;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText ntd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ntd = findViewById(R.id.ntd);
    }

    public void Currency(View view) {
        String m =  ntd.getText().toString();
        if(m.length() <= 0){
            new AlertDialog.Builder(this)
                    .setTitle("Problem")
                    .setMessage("Please enter you NTD amount")
                    .show();
        }
        else
        {
            float result = Float.parseFloat(m) / 30.9f;
            new AlertDialog.Builder(this)
                    .setTitle("result")
                    .setMessage("USD is " + result)
                    .show();

        }
    }



}
