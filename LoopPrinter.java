public class LoopPrinter {
    public static void main(String[] args) {
        System.out.println("=== FOR LOOP ===");
        // For loop handling both columns side by side
        for (int i = 20, j = 8; i >= 10; i -= 2, j -= 2) {
            // If j drops below 0, just print empty space for column 2 so 10 still shows up correctly!
            if (j >= 0) {
                System.out.println(i + "\t" + j);
            } else {
                System.out.println(i);
            }
        }

        System.out.println("\n=== WHILE LOOP ===");
        int w1 = 20;
        int w2 = 8;
        while (w1 >= 10) {
            if (w2 >= 0) {
                System.out.println(w1 + "\t" + w2);
            } else {
                System.out.println(w1);
            }
            w1 -= 2;
            w2 -= 2;
        }

        System.out.println("\n=== DO-WHILE LOOP ===");
        int dw1 = 20;
        int dw2 = 8;
        do {
            if (dw2 >= 0) {
                System.out.println(dw1 + "\t" + dw2);
            } else {
                System.out.println(dw1);
            }
            dw1 -= 2;
            dw2 -= 2;
        } while (dw1 >= 10);
    }
}
