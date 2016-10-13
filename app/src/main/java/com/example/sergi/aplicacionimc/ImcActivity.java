package com.example.sergi.aplicacionimc;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by sergi on 12/10/2016.
 */

public class ImcActivity extends AppCompatActivity {

    private double mass;
    private String dato;
    private double height;
    private double solution;

    private EditText editText;
    private EditText editText2;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);
        editText = (EditText) findViewById(R.id.textHeight);
        editText2 = (EditText) findViewById(R.id.textWeight);
        textView = (TextView) findViewById(R.id.textResultIMC);
        setupActionBar();
    }

    private void setupActionBar(){
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("IMC");
        }
    }

    public void calculo(View view) {
        dato=editText.getText().toString();
        mass = Double.valueOf(dato);
        dato=editText2.getText().toString();
        height= Double.valueOf(dato);
        solution=(mass/(height*height));
        textView.setText(String.valueOf(solution));
    }
}
