import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select which programme you want to use");
        System.out.println("1 - Greetings");
        System.out.println("2 - Array index multiplying");
        int classPicker = scanner.nextInt();
        if (classPicker == 1) {
            Greetings.greetings();
        } else if (classPicker == 2) {
            ArrayIndexMultiplying.arrayIndexMultiplying();
        } else {
            System.out.println("Invalid input");
        }
    }
}
