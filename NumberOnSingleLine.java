import java.util.Scanner;

public class NumberOnSingleLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print("Enter the value of N: ");
            String input = sc.nextLine().trim();

            try {
                n = Integer.parseInt(input);
                if (n <= 0) {
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

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        sc.close();
    }
}
