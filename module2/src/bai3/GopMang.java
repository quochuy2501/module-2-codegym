package bai3;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng 1: ");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        System.out.print("Nhập giá trị cho mảng 1:\n");
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.print("Nhập kích thước mảng 2: ");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        System.out.print("Nhập giá trị cho mảng 2:\n");
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }
        int size3 = size1+size2;
        int[] arr3 = new int[size3];
        for (int i=0;i<size1;i++) {
            arr3[i]=arr1[i];
        }
        for (int i=0;i<size2;i++) {
            arr3[size1+i]=arr2[i];
        }
        System.out.println("mang sau khi gop :");
        for (int i=0;i<size3;i++) {
            System.out.println(arr3[i]+ "");
        }
    }
}
