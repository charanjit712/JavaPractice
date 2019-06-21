import java.util.Scanner;
public class SquareOfNaturalNumbers {
    public static void main(String[] args) {
        int n;
        int square = 0;
        {
            System.out.println("Please Enter the Natural Number ");
            Scanner in = new Scanner(System.in);
            n = in.nextInt();

        }
        for (int j=n+1; j<=n+30; j++)
        {
          square = (j*j);

            System.out.println("Square   of " + j + "  " + square);
        }
    }
}
