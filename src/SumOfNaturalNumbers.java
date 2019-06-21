import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        {
            System.out.println("Plz Enter a Natural Number ");
            Scanner in = new Scanner(System.in);
            n = in.nextInt();

        }
        for (int j = n+1; j <= n+100; j++) {

            sum+=j;


        }
        System.out.println("Sum of Natural number " + sum );
    }

}