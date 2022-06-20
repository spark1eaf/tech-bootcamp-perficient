package com.perficient.techbootcampScott;

public class TempConverter {
    int currentTemp;
    TempConverter(int a){
        currentTemp = a;
    }

    public double ToCelcius(){
        return (double) (currentTemp - 32) /1.8;
    }
}
