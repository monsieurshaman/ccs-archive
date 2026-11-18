import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print("Enter N: ");
            String input = sc.nextLine().trim();
            try {
                n = Integer.parseInt(input);
                if (n > 10) {
                    System.out.println("Exceed the limit");
                    System.out.println("Input Again");
                } else if (n < 1) {
                    System.out.println("Invalid Input");
                    System.out.println("Input Again");
                } else {
                    valid = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input");
                System.out.println("Input Again");
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i * 2);
            if (i < n) sb.append(" ");
        }
        System.out.println("The first " + n + " even numbers are " + sb);
        System.out.println("The factorial of the numbers are");
        for (int i = 1; i <= n; i++) {
            int even = i * 2;
            long fact = 1;
            for (int j = 2; j <= even; j++) {
                fact *= j;
            }
            System.out.println("Factorial of " + even + " is " + fact);
        }
    }
}
