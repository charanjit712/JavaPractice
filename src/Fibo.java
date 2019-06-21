
import java.util.Scanner;
public class Fibo {
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);
        System.out.println("plz enter the numbers");
        int number = in.nextInt();
        int f1 = 0, f2 = 1;
        int i = 0;

        while (i <= number)
        {
            System.out.println(f1  +"    ");
            int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            i++;


    }

        }



    }

