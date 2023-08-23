package ComputeAverage;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Average {

//    Calculate the average of the 3 input numbers using method.
    public double averageCalculator(){
        Scanner num = new Scanner(System.in);
        System.out.print("Input first number: ");
        double x = num.nextDouble();
        System.out.print("Input second number: ");
        double y = num.nextDouble();
        System.out.print("Input third number: ");
        double z = num.nextDouble();
        num.close();

        return (x + y + z) / 3;
    }


    public static void main(String[] args){
        Average totalAverage = new Average();

        System.out.println("Input three number to compute its average\n");
        System.out.println("\nThe average value is: "+totalAverage.averageCalculator());
    }
}
