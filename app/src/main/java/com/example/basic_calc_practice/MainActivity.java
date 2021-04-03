package com.example.basic_calc_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView firstview, secondview;
    String secondvalue,operator;
    double num1,num2,result;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstview=findViewById(R.id.firstTextviewId);
        secondview=findViewById(R.id.secondTextviewId);
    }

    public void digitFunction(View view){
        secondvalue=secondview.getText().toString();

        if(view.getId()==R.id.zeroButtonId){
            if(secondvalue.equals("0")){
                secondview.setText("0");
            }
            else
            secondview.setText(secondvalue+"0");
            secondvalue=secondview.getText().toString();
        }
        else if(view.getId()==R.id.oneButtonId){
            if(secondvalue.equals("0")){
                secondview.setText("1");
            }
            else
            secondview.setText(secondvalue+"1");
            secondvalue=secondview.getText().toString();
        }
        else if(view.getId()==R.id.twoButtonId){
            if(secondvalue.equals("0")){
                secondview.setText("2");
            }
            else
            secondview.setText(secondvalue+"2");
            secondvalue=secondview.getText().toString();
        }else if(view.getId()==R.id.threeButtonId){
            if(secondvalue.equals("0")){
                secondview.setText("3");
            }
            else
            secondview.setText(secondvalue+"3");
            secondvalue=secondview.getText().toString();
        }else if(view.getId()==R.id.fourButtonId){
            if(secondvalue.equals("0")){
                secondview.setText("4");
            }
            else
            secondview.setText(secondvalue+"4");
            secondvalue=secondview.getText().toString();
        }else if(view.getId()==R.id.fiveButtonId){
            if(secondvalue.equals("0")){
                secondview.setText("5");
            }
            else
            secondview.setText(secondvalue+"5");
            secondvalue=secondview.getText().toString();
        }else if(view.getId()==R.id.sixButtonId){
            if(secondvalue.equals("0")){
                secondview.setText("6");
            }
            else
            secondview.setText(secondvalue+"6");
            secondvalue=secondview.getText().toString();
        }else if(view.getId()==R.id.sevenButtonId){
            if(secondvalue.equals("0")){
                secondview.setText("7");
            }
            else
            secondview.setText(secondvalue+"7");
            secondvalue=secondview.getText().toString();
        }else if(view.getId()==R.id.eightButtonId){
            if(secondvalue.equals("0")){
                secondview.setText("8");
            }
            else
            secondview.setText(secondvalue+"8");
            secondvalue=secondview.getText().toString();
        }else{
            if(secondvalue.equals("0")){
                secondview.setText("9");
            }
            else
            secondview.setText(secondvalue+"9");
            secondvalue=secondview.getText().toString();
        }
    }

    public void operatorFunction(View view) {
        secondvalue = secondview.getText().toString();
        num1 = Double.parseDouble(secondvalue);

        if (view.getId()==R.id.plusButtonId){
            operator = "+";
        }
        else if(view.getId()==R.id.minusButtonId){
            operator = "-";
        }
        else if(view.getId()==R.id.divideButtonId){
            operator = "/";
        }

        else {
            operator = "*";
        }
        firstview.setText(secondvalue + " "+ operator);
        secondview.setText("0");
    }

    public void resultFunction(View view) {
        num2 = Double.parseDouble(secondview.getText().toString());

        if(operator.equals("+")){
            result = num1 + num2;
        }
        else if(operator.equals("-")){
            result = num1 - num2;
        }
        else if(operator.equals("*")){
            result = num1 * num2;
        }
        else{
            result = num1 / num2;
        }
        firstview.setText(num1 + " "+operator+" "+num2+" =");
        secondview.setText(""+result);


    }

    public void dotFunction(View view) {
        secondvalue = secondview.getText().toString();
        boolean check = secondvalue.contains(".");
        if(check){
            secondview.setText(secondvalue);
        }
        else{
            secondview.setText(secondvalue+".");
        }

    }

    public void ceFunction(View view) {
        secondview.setText("0");

    }

    public void cFunction(View view) {
        secondview.setText("0");
        firstview.setText("");
        num1 = 0;
        num2 = 0;
    }

    public void deleteFunction(View view) {
        secondview.setText(secondvalue.substring(0, secondvalue.length()-1));
        secondvalue=secondview.getText().toString();
    }

    public void negFunction(View view) {
        if(counter==0){
            secondview.setText("-"+secondvalue);
            secondvalue = secondview.getText().toString();
            counter++;

        }
        else {
            secondview.setText(secondvalue.substring(1));
            counter--;
            secondvalue = secondview.getText().toString();
        }
    }
}