package exercise3;

import java.util.Scanner;

public class AngleCalculation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Number:");
        int n = input.nextInt();
        char v = input.next().charAt(0);
        double radian;
        double grad ;
        if (v == 'g') {
            radian = (n*Math.PI)/180 ;
            System.out.print("Radian:"+radian);
        }else if ( v == 'r') {
            grad = 180/(n*Math.PI);
            System.out.print("Gradus:"+grad);
        }else {
            System.out.print("wrong number");
        }

        }




    }

