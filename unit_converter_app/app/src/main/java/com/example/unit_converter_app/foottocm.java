package com.example.unit_converter_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class foottocm extends AppCompatActivity {

    EditText enteredValue;
    Button toFoot,toCm;
    TextView Answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foottocm);

        enteredValue = (EditText) findViewById(R.id.enteredValue);
        toFoot = (Button) findViewById(R.id.toFoot);
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
                    double ans = number*30.48;

                    DecimalFormat df = new DecimalFormat("#.####");
                    String formattedWithDecimalFormat = df.format(ans);
                    String txtAnswer = formattedWithDecimalFormat + " cm";
                    Answer.setText(txtAnswer);
                }
            }
        });

        toFoot.setOnClickListener(new View.OnClickListener() {
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
                    double ans = number/30.48;
                    DecimalFormat df = new DecimalFormat("#.####");
                    String formattedWithDecimalFormat = df.format(ans);
                    String txtAnswer = formattedWithDecimalFormat + " Foot";
                    Answer.setText(txtAnswer);
                }
            }
        });
    }
}