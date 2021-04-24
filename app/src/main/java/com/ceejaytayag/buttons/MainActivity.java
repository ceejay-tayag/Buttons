package com.ceejaytayag.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText myFirstNumber;
    EditText mySecondNumber;
    TextView myResult;
    Button getSum;

    double num1 = 0.0;
    double num2 = 0.0;
    double sum = 0.0;

    String myNum1 = "";
    String myNum2 = "";
    String mySum = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Main method
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myFirstNumber = (EditText) findViewById(R.id.firstNumber);
        mySecondNumber = (EditText) findViewById(R.id.secondNumber);
        myResult = (TextView) findViewById(R.id.result);
        getSum = (Button) findViewById(R.id.sum);

        getSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayResult();
            }
        });


    }


    public double getSum() {
        myNum1 = myFirstNumber.getText().toString();
//        Log.i("Check1", "This is num1: " + myNum1);
        num1 = Double.parseDouble(myNum1);
//        Log.i("Check1", "This is num1: " + num1);

        myNum2 = mySecondNumber.getText().toString();
//        Log.i("Check2", "This is num2: " + myNum2);
        num2 = Double.parseDouble(myNum2);
//        Log.i("Check2", "This is num2: " + num2);

        //Formula
        return num1 + num2;
    }

    public void displayResult() {
        sum = getSum();
        mySum = Double.toString(sum);
        myResult.setText(mySum);
        //last operation
        clearData();
    }

    public void clearData() {
        num1 = 0.0;
        num2 = 0.0;
        sum = 0.0;
    }

}