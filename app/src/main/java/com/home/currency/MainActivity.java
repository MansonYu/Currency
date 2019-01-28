package com.home.currency;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText ntd;
    private TextView jp;
    private TextView us;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findView();

    }

    private void findView() {
        ntd = findViewById(R.id.ntd);
        jp = findViewById(R.id.JP);
        us = findViewById(R.id.US);
    }

    public void Currency(View view) {
        String m =  ntd.getText().toString();
        if(m.length() <= 0){
            new AlertDialog.Builder(this)
                    .setTitle(R.string.problem)
                    .setMessage(R.string.please_enter_ntd)
                    .setPositiveButton(R.string.ok,null)
                    .show();
        }
        else
        {
            float result = Float.parseFloat(m) / 30.9f;
            new AlertDialog.Builder(this)
                    .setTitle(R.string.result)
                    .setMessage(getString(R.string.usd_id) + result)
                    .setPositiveButton(R.string.ok, null)
                    .show();

        }
    }



}
