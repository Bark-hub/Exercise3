package com.company.Abdi;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.sun.org.apache.xpath.internal.SourceTree;
import java.text.DecimalFormat;
import java.util.*;


public class Main {

    public static Scanner inpute = new Scanner(System.in);

    public static double askUser(double farhn) {


        System.out.println("what is the temperature");
        farhn = inpute.nextDouble();
        System.out.println("CALCULATION");

        return farhn;
    }

    public static double convert(double celly) {
        celly = (celly - 32) / 1.8;
        return celly;
    }

    public static void speak() {
        double farhn = askUser(0);

        System.out.println("In farhnhiet: " + farhn);
        System.out.println("Celcius: " + convert(farhn));
    }

    public static void main(String[] args) {

        double farhn = 0;
        while (farhn >= -460) {
            speak();

            System.out.println("");
            System.out.println("To end Program type -461");

            farhn = inpute.nextDouble();

            if (farhn < -460){
                break;
            }
        }
    }

}
