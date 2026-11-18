import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print("Enter the value of N: ");
            String input = sc.nextLine().trim();
            try {
                n = Integer.parseInt(input);
                if (n > 0) {
                    valid = true;
                } else {
                    System.out.println("Invalid Input");
                    System.out.println("Input Again");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input");
                System.out.println("Input Again");
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i);
            if (i < n) sb.append(" ");
        }
        System.out.println(sb);
    }
}
