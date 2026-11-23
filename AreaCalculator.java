import java.util.Scanner;

public class AreaCalculator {

    static final Scanner input = new Scanner(System.in);

    static double circleArea(double r) {
        return Math.PI * r * r;
    }

    static double triangleArea(double b, double h) {
        return 0.5 * b * h;
    }

    static double squareArea(double a) {
        return a * a;
    }

    static double rectangleArea(double l, double w) {
        return l * w;
    }

    static double parallelogramArea(double b, double h) {
        return b * h;
    }

    static double trapezoidArea(double a, double b, double h) {
        return 0.5 * (a + b) * h;
    }

    static double readValue(String label) {
        System.out.print("Enter " + label + ": ");
        return input.nextDouble();
    }

    static void showMenu() {
        System.out.println("\n===== AREA OF 2D SHAPES =====");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        System.out.println("4. Rectangle");
        System.out.println("5. Parallelogram");
        System.out.println("6. Trapezoid");
        System.out.println("0. Exit");
        System.out.print("Choose a shape: ");
    }

    static void printResult(String shape, double area) {
        System.out.printf("Area of the %s = %.2f%n", shape, area);
    }

    public static void main(String[] args) {
        int choice;

        do {
            showMenu();
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    double r = readValue("the radius (r)");
                    printResult("circle", circleArea(r));
                    break;
                case 2:
                    double tb = readValue("the base (b)");
                    double th = readValue("the height (h)");
                    printResult("triangle", triangleArea(tb, th));
                    break;
                case 3:
                    double a = readValue("the length of side (a)");
                    printResult("square", squareArea(a));
                    break;
                case 4:
                    double l = readValue("the length (L)");
                    double w = readValue("the width (W)");
                    printResult("rectangle", rectangleArea(l, w));
                    break;
                case 5:
                    double pb = readValue("the base (B)");
                    double ph = readValue("the vertical height (H)");
                    printResult("parallelogram", parallelogramArea(pb, ph));
                    break;
                case 6:
                    double pa = readValue("the first parallel side (a)");
                    double pbb = readValue("the second parallel side (b)");
                    double zh = readValue("the height (h)");
                    printResult("trapezoid", trapezoidArea(pa, pbb, zh));
                    break;
                case 0:
                    System.out.println("Program ended. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please pick 0 to 6.");
            }
        } while (choice != 0);

        input.close();
    }
}
