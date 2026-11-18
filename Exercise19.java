import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print("Enter N: ");
            String input = sc.nextLine().trim();
            try {
                n = Integer.parseInt(input);
                if (n >= 10) {
                    valid = true;
                } else {
                    System.out.println("Invalid input");
                    System.out.println("Input Again");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
                System.out.println("Input Again");
            }
        }
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 10; i <= n; i++) {
            if (i % 2 == 0) evenSum += i;
            else oddSum += i;
        }
        System.out.println("The SUM of even numbers from 10 to " + n + " is " + evenSum);
        System.out.println("The SUM of odd numbers from 10 to " + n + " is " + oddSum);
    }
}
