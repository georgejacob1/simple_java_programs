import java.util.Scanner;

public class expeditionProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int shipment, weight;
        long price = 0;

        System.out.println("______________________________________");
        System.out.println("JNX Expedition");
        System.out.println("Program to determine the shipping costs\n\n");
        System.out.println("List of Shipments Service :");
        System.out.println("1. Domestic shipments");
        System.out.println("2. International shipments\n");
        System.out.print("Choose the shipments service (1 or 2) ! ");
        shipment = sc.nextInt();
        System.out.print("How heavy the item ? ");
        weight = sc.nextInt();

        if (shipment == 1) {
            if (weight < 5) {
                price = 0;
            } else if (weight >= 5 && weight <= 10) {
                price = 165000;
            } else {
                price = 375000;
            }
        } else if (shipment == 2) {
            if (weight <= 2) {
                price = 0;
            } else {
                price = 500000;
            }

        } else {
            System.out.println("Invalid shipment service, please choose correctly!");
        }
        System.out.println("\nThe shipping costs is " + price);

    }
}