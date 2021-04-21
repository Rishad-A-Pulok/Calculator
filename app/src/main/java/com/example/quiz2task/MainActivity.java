package com.example.quiz2task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView firstview, secondview;
    String secondvalue, operator;
    double num1, num2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstview = findViewById(R.id.firsttextview);
        secondview = findViewById(R.id.secondtextview);
    }

    public void ClearFunction(View view) {
        firstview.setText("");
        secondview.setText("0");
        num1 = 0;
        num2 = 0;
    }

    public void DeleteFunction(View view) {
        firstview.setText("");
        String str = secondview.getText().toString();
        if (str.length() >=1 ) {
            str = str.substring(0, str.length() - 1);
            secondview.setText(str);
        }
        else if (str.length() <=1 ) {
            secondview.setText("0");
        }
    }

    public void DigitFunction(View view) {
        secondvalue = secondview.getText().toString();

        if (view.getId()==R.id.zerobutton){
            if (secondvalue.equals("0")){
                secondview.setText("0");
            }
            else
                secondview.setText(secondvalue +"0");
        }
        else if (view.getId()==R.id.onebutton){
            if (secondvalue.equals("0")){
                secondview.setText("1");
            }
            else
                secondview.setText(secondvalue+ "1");
        }
        else if (view.getId()==R.id.twobutton){
            if (secondvalue.equals("0")){
                secondview.setText("2");
            }
            else
                secondview.setText(secondvalue+ "2");
        }
        else if (view.getId()==R.id.threebutton){
            if (secondvalue.equals("0")){
                secondview.setText("3");
            }
            else
                secondview.setText(secondvalue+ "3");
        }
        else if (view.getId()==R.id.fourbutton){
            if (secondvalue.equals("0")){
                secondview.setText("4");
            }
            else
                secondview.setText(secondvalue+ "4");
        }
        else if (view.getId()==R.id.fivebutton){
            if (secondvalue.equals("0")){
                secondview.setText("5");
            }
            else
                secondview.setText(secondvalue+ "5");
        }
        else if (view.getId()==R.id.sixbutton){
            if (secondvalue.equals("0")){
                secondview.setText("6");
            }
            else
                secondview.setText(secondvalue+ "6");
        }
        else if (view.getId()==R.id.sevenbutton){
            if (secondvalue.equals("0")){
                secondview.setText("7");
            }
            else
                secondview.setText(secondvalue+ "7");
        }
        else if (view.getId()==R.id.eightbutton){
            if (secondvalue.equals("0")){
                secondview.setText("8");
            }
            else
                secondview.setText(secondvalue+ "8");
        }
        else if (view.getId()==R.id.ninebutton){
            if (secondvalue.equals("0")){
                secondview.setText("9");
            }
            else
                secondview.setText(secondvalue+ "9");
        }
        else{
            secondview.setText(secondvalue+".");
        }

    }

    public void LogicFunction(View view) {
        secondvalue = secondview.getText().toString();
        num1=Double.parseDouble(secondvalue);
        if (view.getId()==R.id.addbutton){
            operator="+";
        }
        else if (view.getId()==R.id.subtractionbutton){
            operator="-";
        }
        else if (view.getId()==R.id.multiplicationbutton){
            operator="*";
        }
        else{
            operator="/";
        }
        firstview.setText(secondvalue+operator);
        secondview.setText("0");
    }

    public void ResultFunction(View view) {
        num2=Double.parseDouble(secondview.getText().toString());
        if (operator.equals("+")){
            result = num1 + num2;
        }
        else if (operator.equals("-")){
            result = num1 - num2;
        }
        else if (operator.equals("*")){
            result = num1 * num2;
        }
        else{
            result = num1 / num2;
        }
        firstview.setText(" "+num1+" "+operator+num2+"=");
        secondview.setText(" "+result);
    }

    public void AboutFunction(View view) {
        startActivity(new Intent(MainActivity.this,About.class));
        //startActivity(intent1);
    }
}