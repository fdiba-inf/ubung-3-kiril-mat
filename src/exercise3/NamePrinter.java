package exercise3;
import java.util.Scanner;

public class NamePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");

        String s= input.nextLine();
        char ch ;
        int l = s.length();
        for (int i =0;i<=l;i++){
            ch = s.charAt(i);
            System.out.println("*"+ch+"*");

        }
        

    }
}
