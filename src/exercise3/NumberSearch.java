package exercise3;

public class NumberSearch {
    public static void main(String[] args) {
        int counter = 0;
        int i = 100;

        while (i<=1000) {
            i=i+5;

            if (i%6==0) {
                if (counter == 9){
                    counter = 0;
                    System.out.println(" "+i);
                }else{
                    System.out.print(" "+i);
                    counter++;
                }
            }
        }

    }
}