import java.util.Scanner;

public class DigitalAmmeter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("          DIGITAL AMMETER");
        System.out.println("=================================");

        System.out.print("Enter voltage across shunt resistor (V): ");
        double voltage = sc.nextDouble();

        System.out.print("Enter shunt resistance (Ohms): ");
        double resistance = sc.nextDouble();

        if (voltage < 0 || resistance <= 0) {
            System.out.println("\nInvalid input!");
            System.out.println("Voltage must be >= 0 and resistance must be > 0.");
            sc.close();
            return;
        }

        // Calculate current
        double current = voltage / resistance;

        System.out.println("\n----------- RESULTS -----------");
        System.out.printf("Shunt Voltage : %.3f V%n", voltage);
        System.out.printf("Resistance    : %.3f Ohm%n", resistance);
        System.out.printf("Current       : %.3f A%n", current);

        // Convert to mA
        System.out.printf("Current       : %.2f mA%n", current * 1000);

        System.out.println("-------------------------------");

        if (current == 0) {
            System.out.println("Status: NO CURRENT");
        }
        else if (current < 1) {
            System.out.println("Status: LOW CURRENT");
        }
        else if (current <= 5) {
            System.out.println("Status: NORMAL CURRENT");
        }
        else {
            System.out.println("Status: HIGH CURRENT");
            System.out.println("Warning: Check the load!");
        }

        System.out.println("=================================");

        sc.close();
    }
}
