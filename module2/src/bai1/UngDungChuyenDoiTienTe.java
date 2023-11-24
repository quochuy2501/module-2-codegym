package bai1;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd=23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so usd can quy doi: ");
        usd = Double.parseDouble(scanner.nextLine());
        double rate = usd*23000;
        System.out.println("giá trị quy đổi :"+rate+" VND");
    }
}
