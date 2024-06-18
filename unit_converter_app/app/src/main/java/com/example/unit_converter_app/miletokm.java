package com.example.unit_converter_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class miletokm extends AppCompatActivity {

    EditText enteredValue;
    Button toMile,toKm;
    TextView Answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miletokm);

        enteredValue = (EditText) findViewById(R.id.enteredValue);
        toMile = (Button) findViewById(R.id.toMile);
        toKm = (Button) findViewById(R.id.toKm);
        Answer = (TextView) findViewById(R.id.Answer);

        toKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtenteredValue = enteredValue.getText().toString();

                if(txtenteredValue.length() == 0)
                {
                    enteredValue.setError("Enter Valid Value");
                }
                else
                {
                    double number = Double.parseDouble(txtenteredValue);
                    double ans = number*1.609344;

                    DecimalFormat df = new DecimalFormat("#.####");
                    String formattedWithDecimalFormat = df.format(ans);
                    String txtAnswer = formattedWithDecimalFormat + " km";
                    Answer.setText(txtAnswer);
                }
            }
        });

        toMile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtenteredValue = enteredValue.getText().toString();

                if(txtenteredValue.length() == 0)
                {
                    enteredValue.setError("Enter Valid Value");
                }
                else
                {
                    double number = Double.parseDouble(txtenteredValue);
                    double ans = number/1.609344;
                    DecimalFormat df = new DecimalFormat("#.####");
                    String formattedWithDecimalFormat = df.format(ans);
                    String txtAnswer = formattedWithDecimalFormat + " Mile";
                    Answer.setText(txtAnswer);
                }
            }
        });
    }
}