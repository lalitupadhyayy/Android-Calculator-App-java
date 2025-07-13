package com.example.mycalc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Button Button1, Button2, Button3, Button4, Button5,Button6, Button7, Button8, Button9,Button0;
Button ButtonAdd, ButtonSubtract, ButtonMultiply, ButtonDivide, ButtonEqual, ButtonClear;
TextView result, operatorCheck;
private String CurrentInput ="";
private String PreviousInput ="";
private String operator = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            result = findViewById(R.id.resultText);
            operatorCheck = findViewById(R.id.operatorCheck);

            Button1 = findViewById(R.id.Button1);
            Button2 = findViewById(R.id.Button2);
            Button3 = findViewById(R.id.Button3);
            Button4 = findViewById(R.id.Button4);
            Button5 = findViewById(R.id.Button5);
            Button6 = findViewById(R.id.Button6);
            Button7 = findViewById(R.id.Button7);
            Button8 = findViewById(R.id.Button8);
            Button9 = findViewById(R.id.Button9);
            Button0 = findViewById(R.id.Button0);

            ButtonAdd = findViewById(R.id.ButtonAdd);
            ButtonSubtract = findViewById(R.id.ButtonSubtract);
            ButtonMultiply = findViewById(R.id.ButtonMultiply);
            ButtonDivide = findViewById(R.id.ButtonDivide);
            ButtonEqual = findViewById(R.id.ButtonEqual);
            ButtonClear = findViewById(R.id.ButtonClear);

            Button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    CurrentInput += "1";
                    result.setText(CurrentInput);
                }
            });

            Button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    CurrentInput += "2";
                    result.setText(CurrentInput);
                }
            });

            Button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    CurrentInput += "3";
                    result.setText(CurrentInput);
                }
            });

            Button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    CurrentInput += "4";
                    result.setText(CurrentInput);
                }
            });

            Button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    CurrentInput += "5";
                    result.setText(CurrentInput);
                }
            });

            Button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    CurrentInput += "6";
                    result.setText(CurrentInput);
                }
            });

            Button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    CurrentInput += "7";
                    result.setText(CurrentInput);
                }
            });

            Button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    CurrentInput += "8";
                    result.setText(CurrentInput);
                }
            });

            Button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    CurrentInput += "9";
                    result.setText(CurrentInput);
                }
            });

            Button0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    CurrentInput += "0";
                    result.setText(CurrentInput);
                }
            });


//            for operators
            ButtonAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!CurrentInput.isEmpty()){
                        PreviousInput = CurrentInput;
                        CurrentInput ="";
                        operator ="+";
                        result.setText(PreviousInput);
                        operatorCheck.setText(operator);
                    }
                }
            });

            ButtonSubtract.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!CurrentInput.isEmpty()){
                        PreviousInput = CurrentInput;
                        CurrentInput ="";
                        operator ="-";
                        result.setText(PreviousInput);
                        operatorCheck.setText(operator);
                    }
                }
            });

            ButtonMultiply.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!CurrentInput.isEmpty()){
                        PreviousInput = CurrentInput;
                        CurrentInput ="";
                        operator ="*";
                        result.setText(PreviousInput);
                        operatorCheck.setText(operator);

                    }
                }
            });

            ButtonDivide.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!CurrentInput.isEmpty()){
                        PreviousInput = CurrentInput;
                        CurrentInput ="";
                        operator ="/";
                        result.setText(PreviousInput);
                        operatorCheck.setText(operator);
                    }
                }
            });


            // for equal or result
            ButtonEqual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!CurrentInput.isEmpty() && !PreviousInput.isEmpty()){
                        double cal = 0.0;

                        double num1 = Double.parseDouble(PreviousInput);  // Parse the first number
                        double num2 = Double.parseDouble(CurrentInput);  // Parse the second number

                        switch(operator){
                            case "+":
                                cal = num1 + num2;
                                break;
                            case "-":
                                cal = num1 - num2;
                                break;
                            case "*":
                                cal = num1 * num2;
                                break;
                            case "/":
                                cal = num1 / num2;
                                break;
                        }
                        result.setText(String.valueOf(cal));
                        CurrentInput = String.valueOf(cal);
                    }
                }
            });

            ButtonClear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    PreviousInput ="";
                    CurrentInput = "";
                    result.setText("0");
                    operator="";
                }
            });
            return insets;
        });
    }
}