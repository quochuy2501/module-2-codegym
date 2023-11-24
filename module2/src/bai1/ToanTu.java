package bai1;

import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu rong: ");
        width = Float.parseFloat(scanner.nextLine());
        System.out.println("nhap chieu cao: ");
        height = Float.parseFloat(scanner.nextLine());
        float S = width*height;
        System.out.println("dien tich la :"+S);
    }
}
