import java.util.Scanner;

public class Program226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Solve linear equation ax + b = 0");
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        if (a == 0) {
            if (b == 0) System.out.println("Infinite solutions");
            else System.out.println("No solution");
        } else {
            System.out.println("x = " + (-b / a));
        }

        System.out.println("\nSolve system of equations:");
        System.out.println("a11*x1 + a12*x2 = b1");
        System.out.println("a21*x1 + a22*x2 = b2");
        System.out.print("Enter a11, a12, b1: ");
        double a11 = sc.nextDouble(), a12 = sc.nextDouble(), b1 = sc.nextDouble();
        System.out.print("Enter a21, a22, b2: ");
        double a21 = sc.nextDouble(), a22 = sc.nextDouble(), b2 = sc.nextDouble();

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D != 0) {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("Unique solution: x1 = " + x1 + ", x2 = " + x2);
        } else {
            if (D1 == 0 && D2 == 0) System.out.println("Infinite solutions");
            else System.out.println("No solution");
        }

        System.out.println("\nSolve quadratic equation ax^2 + bx + c = 0");
        System.out.print("Enter a: ");
        a = sc.nextDouble();
        System.out.print("Enter b: ");
        b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) System.out.println("Infinite solutions");
                else System.out.println("No solution");
            } else {
                System.out.println("Linear solution: x = " + (-c / b));
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) System.out.println("No solution");
            else if (delta == 0) System.out.println("Double root: x = " + (-b / (2 * a)));
            else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Two distinct roots: x1 = " + x1 + ", x2 = " + x2);
            }
        }

        sc.close();
    }
}
