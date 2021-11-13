package triangle;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap canh 1: ");
        double a = scanner.nextDouble();
        System.out.println("Nhap canh 2: ");
        double b = scanner.nextDouble();
        System.out.println("Nhap canh 3: ");
        double c = scanner.nextDouble();
        System.out.println("Nhap color nua: ");
        String color = scanner.next();

        System.out.println(triangle.toString());
    }
}
