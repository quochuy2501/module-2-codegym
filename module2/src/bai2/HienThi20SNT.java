package bai2;

import java.util.Scanner;

public class HienThi20SNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số :");
        int numbers = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int N = 2;
        while (count<numbers){
            int count2=0;
            for (int i=2;i<=Math.sqrt(N);i++){
                if (N % i==0){
                    count2++;
                }
            }
            if (count2==0){
                System.out.println(N+"");
                count++;
            }
            N++;
        }
    }
}
