package com.example.week2day1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//
// double firstNumber;
//    double secondNumber;
//    String currentOperation;
//    boolean numberIsFirst = false;
//    boolean numberIsSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClick (View view){

        Intent implicitIntent = new Intent("package com.example.week2day1.implicitactivity");
        startActivity(implicitIntent);
        implicitIntent.putExtra("key","value");
        Bundle bundle = new Bundle();
        bundle.putParcelable("Object", new Student("Todd", "Economics", "2.5"));
        bundle.putString("key", "value");
        implicitIntent.putExtras(bundle);
        implicitIntent.putExtra("object", new Student("Aaron", "CompSci", "3.0"));
    }



//    void onClickHandler(View view) {
//        String currentNumber = "";
//        switch (view.getId()) {
//            case R.id.buttonone:
//                currentNumber = currentNumber + "1";
//            case R.id.minus:
//                break;
//            case R.id.multiply:
//                break;
//            case R.id.addition:
//                if (numberIsFirst) {
//                    firstNumber = Double.parseDouble(currentNumber);
//                } else {
//                    secondNumber = Double.parseDouble(currentNumber);
//                    firstNumber = performOperation(firstNumber, secondNumber, currentOperation);
//                    secondNumber = 0.0;
//                    currentNumber = "";
//                    numberIsSecond = true;
//                }
//                currentOperation = "+";
//                break;
//            case R.id.minus:
//                break;
//            case R.id.equals:
//                if(numberIsSecond){
//                    Toast.makeText(this,"no second number", Toast.LENGTH_SHORT).show();}
//                    else {
//                        secondNumber = Double.parseDouble(currentNumber);
//                        firstNumber = performOperation(firstNumber, secondNumber, currentOperation);
//                        secondNumber = 0.0;
//                        currentNumber = "";
//                        currentOperation = "";
//                        numberIsSecond = false;
//                }
//
//        }
//
//    }
//
//    double performOperation(double firstNum, double secondNum, String oper){
//        switch(oper){
//            case "+":
//                return calculationUtil.addition(firstNum, secondNum);
//            case "-":
//                return calculationUtil.subtraction(firstNum, secondNum);
//            case "*":
//                return calculationUtil.multiplication(firstNum, secondNum);
//            case "/":
//                return calculationUtil.divison(firstNum, secondNum);
//        }
//    }
}