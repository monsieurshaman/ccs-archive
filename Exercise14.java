import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = -1;
        while (score < 0 || score > 100) {
            System.out.print("Enter a raw score: ");
            String input = sc.nextLine().trim();
            try {
                score = Integer.parseInt(input);
                if (score < 0 || score > 100) {
                    System.out.println("Invalid Input");
                    System.out.println("Input Again");
                }
            } catch (NumberFormatException e) {
                score = -1;
                System.out.println("Invalid Input");
                System.out.println("Input Again");
            }
        }
        String grade;
        if (score >= 95) grade = "1.0";
        else if (score >= 93) grade = "1.25";
        else if (score >= 90) grade = "1.50";
        else if (score >= 88) grade = "1.75";
        else if (score >= 85) grade = "2.0";
        else if (score >= 81) grade = "2.25";
        else if (score >= 80) grade = "2.50";
        else if (score >= 78) grade = "2.75";
        else if (score >= 75) grade = "3.0";
        else grade = "5.0";

        System.out.println("Your equivalent grade is " + grade);
        if (score >= 90) System.out.println("Excellent!");
        else if (score >= 80) System.out.println("Keep it up!");
        else if (score >= 75) System.out.println("Try a little harder");
        else System.out.println("You need to study more!");
    }
}
