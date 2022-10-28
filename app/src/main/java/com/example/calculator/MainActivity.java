package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

        private TextView textView;
        private Double first, second;
        private boolean isOperationClick;
        private String operation;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
    }

    public void onNumberClick(View view) {
        switch (view.getId()){
            case R.id.btn_0:
                textView.setText("0");
                break;
            case R.id.btn_1:
                if (textView.getText().toString().equals("0")){
                    textView.setText("1");
                } else if (isOperationClick){
                    textView.setText("1");
                } else {
                    textView.append("1");
                }
                isOperationClick = false;
                break;
            case R.id.btn_2:
                if (textView.getText().toString().equals("0")){
                    textView.setText("2");
                } else if (isOperationClick){
                    textView.setText("2");
                } else {
                    textView.append("2");
                }
                isOperationClick = false;
                break;
            case R.id.btn_3:
                if (textView.getText().toString().equals("0")){
                    textView.setText("3");
                } else if (isOperationClick){
                    textView.setText("3");
                } else{
                    textView.append("3");
                }
                isOperationClick = false;
                break;
            case R.id.btn_4:
                if (textView.getText().toString().equals("0")){
                    textView.setText("4");
                } else if (isOperationClick){
                    textView.setText("4");
                } else {
                    textView.append("4");
                }
                isOperationClick = false;
                break;
            case R.id.btn_5:
                if(textView.getText().toString().equals("0")){
                    textView.setText("5");
                } else if (isOperationClick){
                    textView.setText("5");
                } else {
                    textView.append("5");
                }
                isOperationClick = false;
                break;
            case R.id.btn_6:
                if (textView.getText().toString().equals("0")){
                    textView.setText("6");
                } else if (isOperationClick){
                    textView.setText("6");
                } else{
                    textView.append("6");
                }
                isOperationClick = false;
                break;
            case R.id.btn_7:
                if (textView.getText().toString().equals("0")){
                    textView.setText("7");
                } else if (isOperationClick){
                    textView.setText("7");
                } else {
                    textView.append("7");
                }
                isOperationClick = false;
                break;
            case R.id.btn_8:
                if (textView.getText().toString().equals("0")){
                    textView.setText("8");
                } else if (isOperationClick){
                    textView.setText("8");
                } else {
                    textView.append("8");
                }
                isOperationClick = false;
                break;
            case R.id.btn_9:
                if (textView.getText().toString().equals("0")){
                    textView.setText("9");
                } else if (isOperationClick){
                    textView.setText("9");
                } else{
                    textView.append("9");
                }
                isOperationClick = false;
                break;
            case R.id.btn_clear:
                textView.setText("0");
                isOperationClick = false;

               break;
            case R.id.btn_tochka:
                if(textView.getText().toString().equals("0")){
                    textView.setText("0.");
                } else {
                    textView.append(".");
                }
                break;


        }
    }

    public void onOperation(View view) {
        switch (view.getId()){
            case R.id.btn_plust:
                first = Double.parseDouble(textView.getText().toString());

                operation = "+";
                isOperationClick = true;
                break;
            case R.id.btn_minus:
                 first = Double.parseDouble(textView.getText().toString());
                operation = "-";
                isOperationClick = true;

                break;
            case R.id.btn_delenie:
                first = Double.parseDouble(textView.getText().toString());
                operation = "/";
                isOperationClick = true;
                break;
            case R.id.btn_umnojenie:
                first = Double.parseDouble(textView.getText().toString());
                operation = "*";
                isOperationClick = true;
                break;
            case R.id.btn_equal:
                second = Double.parseDouble(textView.getText().toString());
                Double result = Double.valueOf(0);
                switch (operation){
                    case "+":
                        result = first + second;
                        break;
                    case  "-":
                        result = first - second;
                        break;
                    case  "/":
                        result = first / second;
                        break;
                    case  "*":
                        result = first * second;
                }

                textView.setText(new DecimalFormat("##.#######").format(result));
                isOperationClick = true;
                break;
        }
    }
}