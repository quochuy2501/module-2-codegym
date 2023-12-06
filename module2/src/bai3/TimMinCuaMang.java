package bai3;

import java.util.Scanner;

public class TimMinCuaMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap kich thuoc cua mang: ");
        int size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];
        System.out.println("nhap phan tu cho mang:\n");
        for (int i=0;i<size;i++) {
            arr[i]= Integer.parseInt(sc.nextLine());
        }
        int min = arr[0];
        for (int i=1;i<size;i++){
            if (arr[i]<arr[0]){
                min= arr[i];
            }
        }
        System.out.println("gia tri nho nhat: "+min);
    }
}
