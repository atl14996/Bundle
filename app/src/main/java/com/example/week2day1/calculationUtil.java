package com.example.week2day1;

import android.util.Log;

public class calculationUtil {

    public static double addition(double firstValue, double secondValue){

        return firstValue + secondValue;
    }
    public static double subtraction(double firstValue, double secondValue){

        return firstValue - secondValue;
    }
    public static double multiplication(double firstValue, double secondValue){

        return firstValue * secondValue;
    }
    public static double divison(double firstValue, double secondValue){

        if(secondValue == 0) {
            Log.d("TAG", "USER CANNOT DIVIDE BY ZERO");
            return 0;
        }
        return firstValue / secondValue;
        }

        public void parseString(String equationToParse){

        double number;
        String operator;
        String currentreadNumber = "";

        for(String currentread : equationToParse.split("")){

            switch(currentread){
                case "-" :
                operator = "-";
                break;
                case "+":
                    operator = "+";
                    break;
                case "*":
                    operator = "*";
                    break;
                case "/":
                    operator = "/";
                    break;
                default:
                    currentread = currentreadNumber + currentread;
            }
        }
        }
    }



