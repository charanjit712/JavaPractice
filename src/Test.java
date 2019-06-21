import java.util.Scanner;
public class Test {
    public static void main( String []args ){

        Scanner in = new Scanner(System.in);
        System.out.println("Plz Enter the Integer ");
        int n = in.nextInt();
        int sum = 0;
        for (int i=0; i<=n; i++)
        {
            sum += i;
        }
        System.out.println(sum);




    }
}

