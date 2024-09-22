
import java.util.Scanner;

public class Greetings {
    public static void greetings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a number");
        int number = scanner.nextInt();
        if (number <= 7) {
            while (number <= 7) {
                System.out.println("Try again");
                number = scanner.nextInt();
            }

        }
            System.out.println("What is your name?");
            scanner.nextLine(); // Clearing the Input Buffer After the scanner.nextInt(). Without it, it skips input for name variable
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("john")) {  // Using method equals, cause if I try to compare input with "==" it will starts compare their address in memory
                System.out.println("Hello, John");
            } else {
                System.out.println("There is no such name");
            }
        }
}
