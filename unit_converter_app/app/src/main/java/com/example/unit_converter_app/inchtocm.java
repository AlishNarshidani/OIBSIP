package com.example.unit_converter_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class inchtocm extends AppCompatActivity {

    EditText enteredValue;
    Button toInch,toCm;
    TextView Answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inchtocm);

        enteredValue = (EditText) findViewById(R.id.enteredValue);
        toInch = (Button) findViewById(R.id.toInch);
        toCm = (Button) findViewById(R.id.toCm);
        Answer = (TextView) findViewById(R.id.Answer);

        toCm.setOnClickListener(new View.OnClickListener() {
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
                    double ans = number*2.54;

                    DecimalFormat df = new DecimalFormat("#.####");
                    String formattedWithDecimalFormat = df.format(ans);
                    String txtAnswer = formattedWithDecimalFormat + " cm";
                    Answer.setText(txtAnswer);
                }
            }
        });

        toInch.setOnClickListener(new View.OnClickListener() {
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
                    double ans = number/2.54;
                    DecimalFormat df = new DecimalFormat("#.####");
                    String formattedWithDecimalFormat = df.format(ans);
                    String txtAnswer = formattedWithDecimalFormat + " Inch";
                    Answer.setText(txtAnswer);
                }
            }
        });
    }
}