package main;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.println("How much do you weigh?");
        double weight = Double.valueOf(in.nextLine());

        System.out.println("How tall are you? (in meters)");
        double height = Double.valueOf(in.nextLine());

        System.out.println("What's your gender? (male/female)");
        String g = in.nextLine();
        Gender gender = null;

        if("FEMALE".equalsIgnoreCase(g)){
            gender = Gender.FEMALE;
        }else if("MALE".equalsIgnoreCase(g)){
            gender = Gender.MALE;
        }else{
            System.out.println("Ops... Invalid gender");
        }

        BMI person = new BMI(height, weight, gender);

        System.out.println("Your BMI is "+ person.calculateBMI());
        System.out.println("You are "+ person.getBMIClassification() );



    }
}
