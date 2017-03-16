package com.example.wenboda.se2_ue1rechner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.id.edit;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClick  (View v){

        EditText Dd = (EditText) findViewById(R.id.editText3);
        EditText Ds = (EditText) findViewById(R.id.editText4);
        TextView Rel = (TextView) findViewById(R.id.textView);
        double Dividend  =  Double.parseDouble(Dd.getText().toString());
        double Dividsor = Double.parseDouble(Ds.getText().toString());
        try{
            double result = Dividend/Dividsor;
            Rel.setText(String.valueOf(result));
        }catch (Exception e){
            Rel.setText("Divisor kann nicht 0 sein");
            Rel.setText("falsch");
        }


    }
}
