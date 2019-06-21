import java.util.Scanner;
public class Inventory {

    public static void main(String[] args) {
        int grandTotal = 0;
        String cont;
        do {
            System.out.println("Please enter the type of product received");
            Scanner in = new Scanner(System.in);
            String productType = in.next();
            System.out.println("Please enter the cost of each " + productType);
            int cost = in.nextInt();
            System.out.println("Please enter the brand name ");
            String brandName = in.next();
            System.out.println("please enter the number of " + productType + " received in the Shipment ");
            int numProductInShipment = in.nextInt();
            int totalCostOfShipment = cost * numProductInShipment / 100;
            System.out.println("Shipment Summary as : \n" + "The new Product is " + productType + "\n" + "This Shipment included" + numProductInShipment + "from" + brandName + "\n"  + "The Total cost of the Shipment was $" + totalCostOfShipment + "\n");

            System.out.println("With GST :" + totalCostOfShipment * 1.05f);
            grandTotal += totalCostOfShipment;

            if (grandTotal > totalCostOfShipment) {
                break;
            }
            System.out.println("Would u like to enter new Product");
            cont = in.next();
        }
            while (cont.equals("yes") || cont.equals("yes"));
            System.out.println("The Grand Total of the Shipment is " + grandTotal);

            }
    }
