package bai3;

import java.util.Scanner;

public class ThemPhanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6,0,0,0,0};
        System.out.println("nhap gia tri X can them vao:");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap vi tri index can chen X vao:");
        int index = Integer.parseInt(scanner.nextLine());
        if (index <0 || index> arr.length-1) {
            System.out.println("khong chen duoc phan tu vao mang!!!");
        }else {
            for (int i=arr.length-1;i>index;i--) {
                arr[i]=arr[i-1];
            }
            arr[index]=x;
            System.out.println("mang sau khi chen phan tu X vao");
            for (int j=0;j< arr.length;j++){
                System.out.println(arr[j]+"");
            }
        }
    }
}
