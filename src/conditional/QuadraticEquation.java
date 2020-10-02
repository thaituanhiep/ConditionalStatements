package conditional;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, delta;
        System.out.println("Quadratic equation a * x * x + b * x + c = 0");
        System.out.println("Input a : ");
        a = scanner.nextDouble();
        System.out.println("Input b : ");
        b = scanner.nextDouble();
        System.out.println("Input c : ");
        c = scanner.nextDouble();
        delta = b * b - 4 * a * c;

        if (a == 0) {
            if (b == 0) {
                if (c == 0)
                    System.out.println("All values are solutions");
                else
                    System.out.println("The equation has no solution");
            } else
                System.out.println("The equation has a solution is : " + ((-c) / b));
        } else {
            if (delta < 0)
                System.out.println("The equation has no solution");
            else if (delta == 0)
                System.out.println("The equation has a solution is : " + ((-b) / (2 * a)));
            else {
                double solution1 = ((-b) - Math.sqrt(delta)) / (2 * a);
                double solution2 = ((-b) + Math.sqrt(delta)) / (2 * a);
                System.out.println("The equation has two solutions : " + solution1 + "    " + solution2);
            }
        }
    }
}
