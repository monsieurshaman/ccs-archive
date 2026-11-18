import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print("Enter an integer: ");
            String input = sc.nextLine().trim();
            try {
                num = Integer.parseInt(input);
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input");
                System.out.println("Input Again");
            }
        }
        String little = Integer.toBinaryString(num);
        String big = new StringBuilder(little).reverse().toString();
        System.out.println("Big Endian Format is " + big);
        System.out.println("Little Endian Format is " + little);
    }
}
