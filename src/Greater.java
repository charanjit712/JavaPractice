import java.util.Scanner;
public class Greater {
    public static void main(String [] args){
        System.out.println("Plz Enter the number ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if ( a>=b  && a>=c )
        {
            System.out.println(a+ " is greatest ");
        }
        else if ( b>=a && b>=c){
            System.out.println(b +"is the greatest ");

        }
        else
        {
            System.out.println(c+ "is Greatest");
        }


    }
}