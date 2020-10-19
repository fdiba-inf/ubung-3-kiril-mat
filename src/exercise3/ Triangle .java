package exercise3;

import java.util.Scanner;
public class Triangle {

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("a:");
        int a = input.nextInt();
        System.out.print("b:");
        int b = input.nextInt();
        System.out.print("c:");
        int c = input.nextInt();


        double area;
        double s;
        String type = null;

        while (a > 0 && b > 0 && c > 0) {
            if ((a+b>c&&a+c>b&&c+b>a)) {


                s = (a + b + c) / 2;
                area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                if (a == b && b == c) {
                    type = "equilateral";
                } else if (a == b || b == c || c == a) {
                    type = "isosceles";
                } else {
                    type = "scalene";
                }
                System.out.print("Area: " + area);
                System.out.println("Triangle: " + type);

                System.out.println("Next triangle...");

                System.out.print("a:");
                a = input.nextInt();
                System.out.print("b:");
                b = input.nextInt();
                System.out.print("c:");
                c = input.nextInt();


            }else{
                System.out.print("Values are not correct!");
            }
        }
        System.out.print("Values are not correct!");

    }
}
