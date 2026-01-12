package util;

import java.util.Scanner;

public class Validation {

    private static final Scanner sc = new Scanner(System.in);

    public static String getString(String msg) {
        System.out.print(msg);
        return sc.nextLine();
    }

    public static double getDouble(String msg, double min, double max) {
        while (true) {
            try {
                System.out.print(msg);
                double n = Double.parseDouble(sc.nextLine());
                if (n >= min && n <= max) return n;
            } catch (Exception ignored) {}
            System.out.println("Invalid input!");
        }
    }

    public static boolean confirm(String msg) {
        System.out.print(msg);
        return sc.nextLine().equalsIgnoreCase("y");
    }
}
