import java.util.Scanner;
public class NegativeNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        for (int j = 0; j <= 5; j++) {
            System.out.println("please enter the number");
            int i = in.nextInt();

            if (i < 0) {
                System.out.println("\n" + " Entered Value  is  a   Negative number " + i );

            } else {
                System.out.println( "\n " + "   Entered value is a  Positive Number " +i );
            }
        }
    }
}