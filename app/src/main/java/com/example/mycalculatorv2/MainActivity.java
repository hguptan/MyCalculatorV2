package com.example.mycalculatorv2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String result;
    String textOfTV;
    TextView displayCalculation;
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonEqual;
    Button buttonC;
    Button buttonA;
    Button buttonS;
    Button buttonM;
    Button buttonD;
    Button buttonBack;
    Button buttonHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonC = findViewById(R.id.buttonC);
        buttonEqual = findViewById(R.id.buttonEqual);
        buttonA = findViewById(R.id.buttonA);
        buttonS = findViewById(R.id.buttonS);
        buttonM = findViewById(R.id.buttonM);
        buttonD = findViewById(R.id.buttonD);
        buttonBack = findViewById(R.id.buttonBack);
        displayCalculation = findViewById(R.id.textView);
        buttonHistory = findViewById(R.id.historyButton);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (displayCalculation.getText().length() == 0) {
                    textOfTV = "0" ;
                    displayCalculation.setText(textOfTV);
                } else {
                    textOfTV = textOfTV +"0";
                    displayCalculation.setText(textOfTV);
                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (displayCalculation.getText().length() == 0) {
                    textOfTV = "1" ;
                    displayCalculation.setText(textOfTV);
                } else {
                    textOfTV = textOfTV +"1";
                    displayCalculation.setText(textOfTV);
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (displayCalculation.getText().length() == 0) {
                    textOfTV = "2" ;
                    displayCalculation.setText(textOfTV);
                } else {
                    textOfTV = textOfTV +"2";
                    displayCalculation.setText(textOfTV);
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (displayCalculation.getText().length() == 0) {
                    textOfTV = "3" ;
                    displayCalculation.setText(textOfTV);
                } else {
                    textOfTV = textOfTV +"3";
                    displayCalculation.setText(textOfTV);
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (displayCalculation.getText().length() == 0) {
                    textOfTV = "4" ;
                    displayCalculation.setText(textOfTV);
                } else {
                    textOfTV = textOfTV +"4";
                    displayCalculation.setText(textOfTV);
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (displayCalculation.getText().length() == 0) {
                    textOfTV = "5" ;
                    displayCalculation.setText(textOfTV);
                } else {
                    textOfTV = textOfTV +"5";
                    displayCalculation.setText(textOfTV);
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (displayCalculation.getText().length() == 0) {
                    textOfTV = "6" ;
                    displayCalculation.setText(textOfTV);
                } else {
                    textOfTV = textOfTV +"6";
                    displayCalculation.setText(textOfTV);
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (displayCalculation.getText().length() == 0) {
                    textOfTV = "7" ;
                    displayCalculation.setText(textOfTV);
                } else {
                    textOfTV = textOfTV +"7";
                    displayCalculation.setText(textOfTV);
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (displayCalculation.getText().length() == 0) {
                    textOfTV = "8" ;
                    displayCalculation.setText(textOfTV);
                } else {
                    textOfTV = textOfTV +"8";
                    displayCalculation.setText(textOfTV);
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (displayCalculation.getText().length() == 0) {
                    textOfTV = "9" ;
                    displayCalculation.setText(textOfTV);
                } else {
                    textOfTV = textOfTV +"9";
                    displayCalculation.setText(textOfTV);
                }
            }
        });
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    textOfTV = textOfTV +"+";
                    displayCalculation.setText(textOfTV);
            }
        });
        buttonS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    textOfTV = textOfTV +"-";
                    displayCalculation.setText(textOfTV);
            }
        });
        buttonM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    textOfTV = textOfTV +"*";
                    displayCalculation.setText(textOfTV);
            }
        });
        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    textOfTV = textOfTV +"/";
                    displayCalculation.setText(textOfTV);
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               result = String.valueOf(CalculatorBrain.calculate(textOfTV));
               String s = textOfTV + " = " + result;
                MyApp.history.add(s);
                displayCalculation.setText(result);
                textOfTV = "";
                result="";
            }
        });
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( !textOfTV.isEmpty()){
                    if (textOfTV.length()== 1){
                        displayCalculation.setText("");
                        textOfTV = "";
                    } else {
                        textOfTV = textOfTV.substring(0,textOfTV.length()-1);
                        displayCalculation.setText(textOfTV);
                    }
                }
            }

        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayCalculation.setText("");
                textOfTV ="";
                result ="";
            }
        });
        buttonHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Context =  the application memory with all access to resources
                Intent toSecond = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(toSecond);
            }
        });
    }
}