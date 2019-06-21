
import java.util.Scanner;

public class PrintNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
       for (int i=0; i<=5; i++) {
           System.out.println("Please Enter the Number");
           Double number = in.nextDouble();
           System.out.println("Please Enter the another  Number");
           int  number1 = in.nextInt();

           System.out.println("The Number u entered is " + number);
           System.out.println("The Number u entered is " + number1);


       }

    }
}
