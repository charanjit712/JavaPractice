import java.util.Scanner;

public class Even {
    public static void main(String[] args){
        System.out.println("Plz enter the integer value ");
        Scanner in = new Scanner(System.in);
        int number=in.nextInt();
        if  (number%2 == 0)
        {
            System.out.println("Number is Even"+number);
        }
        else
        {
            System.out.println("Number is Odd" + number);
        }

    }
}
