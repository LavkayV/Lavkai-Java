import java.util.Scanner;

public class ArrayIndexMultiplying {
    public static void arrayIndexMultiplying() {
        System.out.println("Select the size of the array");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        System.out.println("Fill the array");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt() * 3;
        }
        System.out.print("Array = {");
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.print("}");
    }
}
