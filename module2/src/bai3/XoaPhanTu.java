package bai3;

import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] myNumbers = {0,10,3,9,5,2,11};
        System.out.println(" Nhập phần tử tại vị trí index cần xóa");
        int x = Integer.parseInt(scanner.nextLine());
        boolean isDelete = false;
        for (int i = 0; i < myNumbers.length - 1; i++){
            if (x == i) {
                isDelete = true;
            }
            if (isDelete) {
                myNumbers[i] = myNumbers[i+1];
            }
        }
        myNumbers[myNumbers.length-1] = 0;
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.print(myNumbers[i] + " ");
        }
    }

}
