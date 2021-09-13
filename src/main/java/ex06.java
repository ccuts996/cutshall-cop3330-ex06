/*
 *  UCF COP3330 Fall 2021 Assignment 06 Solution
 *  Copyright 2021 Chase Cutshall
 */

import java.util.Scanner;
import java.time.Year;
public class ex06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String age;
        System.out.print(" What is your age:");

        age = input.next();

        Integer i = Integer.parseInt(age);

        String retireage;
        System.out.print(" At what age would you want to retire?");

        retireage = input.next();

        Integer j = Integer.parseInt(retireage);

        int currentyear = Year.now().getValue();

        int yearsleft = j - i;

        int retirementyear = currentyear + yearsleft;

        System.out.print(" You have "+ yearsleft + " until you can retire." + System.lineSeparator());
        System.out.print(" It is "+ currentyear+ " and you can retire in " + retirementyear);
    }
}





