package bai2;

import java.util.Scanner;

public class ShapeMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            printMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    printRectangle();
                    break;
                case 2:
                    printSquareTriangle();
                    break;
                case 3:
                    printIsoscelesTriangle();
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 4);
        scanner.close();
    }
    public static void printMenu() {
        System.out.println("Menu:");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print the isosceles triangle");
        System.out.println("4. Exit");
    }
    public static void printRectangle() {
        int width = 5;
        int height = 3;
        System.out.println("Printing rectangle:");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printSquareTriangle() {
        int size = 5;

        System.out.println("Printing square triangle:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void printIsoscelesTriangle() {
        int size = 5;
        System.out.println("Printing isosceles triangle:");
        for (int i = 0; i < size; i++) {
            for (int j = size - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

