import java.util.Scanner;
public class Salary {


    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.println("please enter the Salary");
            Scanner in = new Scanner(System.in);
            Double pay = in.nextDouble();

            if (pay <= 1000) {
                pay += (pay * 15 / 100);
                System.out.println("Total Salary is " + pay);
            } else {
                pay += (pay * 12 / 100);
                System.out.println("Total Salary is " + pay);

            }
        }
    }

}